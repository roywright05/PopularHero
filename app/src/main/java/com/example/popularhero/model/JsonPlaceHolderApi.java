package com.example.popularhero.model;

import com.example.popularhero.presenter.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {

    //put endpoint in the parentheses
    @GET("posts")
    Call<List<Post>> getPosts();
}
