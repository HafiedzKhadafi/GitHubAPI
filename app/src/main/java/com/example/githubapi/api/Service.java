package com.example.githubapi.api;

import retrofit2.Call;
import com.example.githubapi.model.ItemResponse;
import retrofit2.http.GET;

public interface Service {
    @GET("/search/users?q=language:java+location:indonesia")
    Call<ItemResponse> getItems();
}
