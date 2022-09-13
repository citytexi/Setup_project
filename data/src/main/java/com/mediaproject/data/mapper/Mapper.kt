package com.mediaproject.data.mapper

import com.mediaproject.domain.model.GithubResponse

object Mapper {

    fun mapperGithub(
        response: List<GithubResponse>?
    ) : List<GithubResponse>? = if (response != null) {
        response.toDomain()
    } else {
        null
    }


    fun List<GithubResponse>.toDomain() : List<GithubResponse> = this.map {
        GithubResponse(
            name = it.name,
            id = it.id,
            date = it.date,
            url = it.url
        )
    }

}