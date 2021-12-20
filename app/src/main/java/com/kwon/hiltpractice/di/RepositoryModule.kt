package com.kwon.hiltpractice.di

import com.kwon.hiltpractice.repository.GitHubRepository
import com.kwon.hiltpractice.repository.GitHubRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Singleton
    @Provides
    fun provideGitHubRepository(gitHubRepository: GitHubRepositoryImpl): GitHubRepository {
        return gitHubRepository
    }
}