package com.example.okhttp_practice.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.okhttp_practice.Model.Post;
import com.example.okhttp_practice.Repository.PostRepository;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PostViewModel extends ViewModel {
    private final PostRepository postRepository;
    private final MutableLiveData<List<Post>> postLiveData = new MutableLiveData<>();

    public PostViewModel(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public LiveData<List<Post>> getPosts() {
            postRepository.getPost().enqueue(new Callback<List<Post>>() {
                @Override
                public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                    if (response.isSuccessful()){
                        postLiveData.setValue(response.body());
                    }
                }

                @Override
                public void onFailure(Call<List<Post>> call, Throwable throwable) {

                }
            });
    }
}
