package com.example.popularhero.presenter;

import com.example.popularhero.model.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {

    //put endpoint in the parentheses
    @GET("posts")
    Call<List<Post>> getPosts();
}
