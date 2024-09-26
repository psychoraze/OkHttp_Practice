package com.example.okhttp_practice.Repository;

import com.example.okhttp_practice.ApiService.ApiService;
import com.example.okhttp_practice.Model.Post;

import java.util.List;

import retrofit2.Call;

public class PostRepository {
    private final ApiService apiService;

    public PostRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public Call<List<Post>> getPost(){
        return apiService.getPosts();
    }
}
