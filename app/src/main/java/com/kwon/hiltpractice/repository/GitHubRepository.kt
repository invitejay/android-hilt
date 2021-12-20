package com.kwon.hiltpractice.repository

import com.kwon.hiltpractice.data.GitHubUserResponse

interface GitHubRepository {
    fun searchUsers(
        query: String
    ): GitHubUserResponse
}