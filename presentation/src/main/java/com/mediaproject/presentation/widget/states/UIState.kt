package com.mediaproject.presentation.widget.states

import com.mediaproject.domain.utils.ErrorState

sealed class UIState {
    data class Success(
        val isLoading: Boolean,
    ) : UIState()

    data class Failure(
        val isLoading: Boolean,
        val errorState: ErrorState,
        val errorMsg: String?
    ) : UIState()

    object Loading : UIState()
}
