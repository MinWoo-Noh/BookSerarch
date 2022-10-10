package com.nowornaver.booksearchapp.data.model.api

import com.nowornaver.booksearchapp.data.model.SearchResponse
import com.nowornaver.booksearchapp.util.Constants.API_KEY
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface BookSearchApi {

    @Headers("Authorization: KakaoAK $API_KEY")
    @GET("v3/search/book")
    suspend fun searchBook(
        @Query("query") query : String,
        @Query("sort") sort : String,
        @Query("page") page : Int,
        @Query("size") size : Int,
    ): retrofit2.Response<SearchResponse>
}