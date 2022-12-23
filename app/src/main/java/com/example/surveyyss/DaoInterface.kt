package com.example.surveyyss

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface DaoInterface {

    @Headers("accept: text/plain")
    @GET("api/Surveys")
    suspend fun selectRespons(): Response<String>


}