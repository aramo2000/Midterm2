package com.example.myapplication.rest

import com.example.pssexample.models.Results
import retrofit2.http.GET
import retrofit2.Response

interface ApiService {
    @GET("api/?inc=nat,name,email&results=10")
    suspend fun getPosts(): Response<Results>
}