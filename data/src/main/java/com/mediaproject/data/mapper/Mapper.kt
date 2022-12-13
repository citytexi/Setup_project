package com.mediaproject.data.mapper

import com.mediaproject.data.remote.model.response.ResponseSaveUserDto
import com.mediaproject.domain.model.GithubResponse
import com.mediaproject.domain.model.SaveUserResponse

object Mapper {

    fun mapperGithub(
        response: List<GithubResponse>?
    ) : List<GithubResponse>? = if (response != null) {
        response.toDomain()
    } else {
        null
    }

    fun mapperSaveUser(
        response: ResponseSaveUserDto?
    ): SaveUserResponse = when (response) {
        null -> {
            SaveUserResponse("")
        }
        else -> { response.toDomain() }
    }


    fun List<GithubResponse>.toDomain() : List<GithubResponse> = this.map {
        GithubResponse(
            name = it.name,
            id = it.id,
            date = it.date,
            url = it.url
        )
    }

    private fun ResponseSaveUserDto.toDomain(): SaveUserResponse = SaveUserResponse(
        userId = userId,
        nickname = nickname,
        gender = gender,
        photoUrl = photoUrl,
        token = token
    )

}