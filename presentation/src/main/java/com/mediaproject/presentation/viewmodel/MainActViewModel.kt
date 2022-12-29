package com.mediaproject.presentation.viewmodel

import android.content.SharedPreferences
import androidx.lifecycle.viewModelScope
import com.mediaproject.presentation.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainActViewModel
@Inject
constructor(
    private val sharedPreferences: SharedPreferences,
) : BaseViewModel() {
    companion object {
        private const val TAG = "[MainAVM]"
    }


    fun getUserRepo(owner: String) = viewModelScope.launch {
//        val response = getUserRepoUseCase.execute(this@MainActViewModel, owner)
//        if(response == null) {
//            mutableScreenState.postValue(ScreenState.ERROR)
//        } else {
//            mutableScreenState.postValue(ScreenState.RENDER)
//            _eventUserRepo.postValue(response!!)
//        }
    }

}