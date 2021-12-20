package com.kwon.hiltpractice.vm

import androidx.lifecycle.ViewModel
import com.kwon.hiltpractice.repository.GitHubRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class GitHubSearchViewModel @Inject constructor(
    gitHubRepository: GitHubRepository
) : ViewModel() {

}