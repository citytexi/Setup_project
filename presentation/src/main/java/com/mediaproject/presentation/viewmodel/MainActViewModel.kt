package com.mediaproject.presentation.viewmodel

import android.content.SharedPreferences
import android.provider.Contacts.Intents.UI
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mediaproject.presentation.widget.states.UIState
import com.mediaproject.presentation.widget.utils.SingleLiveEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainActViewModel
@Inject
constructor(
    private val sharedPreferences: SharedPreferences,
) : ViewModel() {
    companion object {
        private const val TAG = "[MainAVM]"
    }

    private val _uiState = SingleLiveEvent<UIState>()
    val uiState: LiveData<UIState>
        get() = _uiState



}