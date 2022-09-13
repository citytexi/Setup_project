package com.mediaproject.domain.repository

import com.mediaproject.domain.model.GithubResponse
import com.mediaproject.domain.utils.RemoteErrorEmitter

interface GithubRepository {

    suspend fun getGithub(
        remoteErrorEmitter: RemoteErrorEmitter,
        owner : String
    ): List<GithubResponse>?

}