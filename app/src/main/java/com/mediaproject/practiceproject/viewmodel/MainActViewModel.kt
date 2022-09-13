package com.mediaproject.practiceproject.viewmodel

import android.content.SharedPreferences
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.mediaproject.domain.model.GithubResponse
import com.mediaproject.practiceproject.base.BaseViewModel
import com.mediaproject.practiceproject.widget.utils.ScreenState
import com.mediaproject.practiceproject.widget.utils.SingleLiveEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainActViewModel
@Inject
constructor(
    private val sharedPreferences: SharedPreferences
) : BaseViewModel() {

    private val _eventUserRepo = SingleLiveEvent<List<GithubResponse>>()

    val eventUserRepo: LiveData<List<GithubResponse>>
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
}