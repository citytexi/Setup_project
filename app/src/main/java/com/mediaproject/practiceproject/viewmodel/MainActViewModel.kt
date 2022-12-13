package com.mediaproject.practiceproject.viewmodel

import android.content.SharedPreferences
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.mediaproject.domain.model.GithubResponse
import com.mediaproject.domain.model.SaveUserResponse
import com.mediaproject.domain.usecase.SaveUserRepoUseCase
import com.mediaproject.practiceproject.base.BaseViewModel
import com.mediaproject.practiceproject.widget.utils.ScreenState
import com.mediaproject.practiceproject.widget.utils.SingleLiveEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainActViewModel
@Inject
constructor(
    private val sharedPreferences: SharedPreferences,
    private val saveUserRepoUseCase: SaveUserRepoUseCase
) : BaseViewModel() {

    private val _eventUserRepo = SingleLiveEvent<SaveUserResponse>()

    val eventUserRepo: LiveData<SaveUserResponse>
        get() = _eventUserRepo

    fun getUserRepo(owner: String) = viewModelScope.launch {
//        val response = getUserRepoUseCase.execute(this@MainActViewModel, owner)
//        if(response == null) {
//            mutableScreenState.postValue(ScreenState.ERROR)
//        } else {
//            mutableScreenState.postValue(ScreenState.RENDER)
//            _eventUserRepo.postValue(response!!)
//        }
    }

    fun userRepo(userId: String) = CoroutineScope(Dispatchers.IO).launch {
        val response = saveUserRepoUseCase.execute(
            userId = userId,
            nickname = "test",
            gender = 1,
            password = "1234"
        )
        if (response.userId == userId) {
            mutableScreenState.postValue(ScreenState.RENDER)
            _eventUserRepo.postValue(response)
        } else {
            mutableScreenState.postValue(ScreenState.ERROR)
        }
    }
}