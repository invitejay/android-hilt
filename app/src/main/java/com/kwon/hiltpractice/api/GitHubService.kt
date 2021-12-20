package com.kwon.hiltpractice.api

import retrofit2.http.GET
import retrofit2.http.Query

interface GitHubService {
    @GET("search/users")
    fun getSearchUsers(
        @Query("q") query: String? = null,
        @Query("per_page") per_page: Int? = null,
        @Query("page") page: Int? = null
    )
}