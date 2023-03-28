package com.example.myapplication.rest

import com.example.pssexample.models.Results
import retrofit2.Response

class Datasource {
    suspend fun loadNews(): Response<Results> {
        return RetrofitHelper.getInstance().create(ApiService::class.java).getPosts()
    }
}

