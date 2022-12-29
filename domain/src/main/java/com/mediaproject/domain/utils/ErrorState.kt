package com.mediaproject.domain.utils

sealed class ErrorState {
    object NetworkError : ErrorState()
    object NotFoundResults : ErrorState()
    object TimeOutError : ErrorState()
    object SessionExpiredError : ErrorState()
    object UnknownError : ErrorState()
}
