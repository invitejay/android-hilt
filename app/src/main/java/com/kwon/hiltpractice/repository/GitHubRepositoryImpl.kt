package com.kwon.hiltpractice.repository

import com.kwon.hiltpractice.api.GitHubService
import com.kwon.hiltpractice.data.GitHubUserResponse
import javax.inject.Inject

class GitHubRepositoryImpl @Inject constructor(
    private val gitHubService: GitHubService
) :GitHubRepository{
    override fun searchUsers(query: String): GitHubUserResponse {
        TODO("Not yet implemented")
    }
}