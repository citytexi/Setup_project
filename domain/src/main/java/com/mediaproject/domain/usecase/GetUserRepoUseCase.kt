package com.mediaproject.domain.usecase

import com.mediaproject.domain.repository.GithubRepository
import javax.inject.Inject

class GetUserRepoUseCase
@Inject
constructor(
    private val githubRepository: GithubRepository
) {
//    suspend fun execute(
//        remoteErrorEmitter: RemoteErrorEmitter,
//        owner : String
//    ) = githubRepository.getGithub(remoteErrorEmitter, owner)
}