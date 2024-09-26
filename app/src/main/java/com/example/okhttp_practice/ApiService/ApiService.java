package com.example.okhttp_practice.ApiService;

import com.example.okhttp_practice.Model.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("/posts")
    Call<List<Post>> getPosts();
}
