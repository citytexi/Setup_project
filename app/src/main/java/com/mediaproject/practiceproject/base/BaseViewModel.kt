package com.mediaproject.practiceproject.base

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mediaproject.domain.utils.ErrorType
import com.mediaproject.domain.utils.RemoteErrorEmitter
import com.mediaproject.practiceproject.widget.utils.ScreenState
import com.mediaproject.practiceproject.widget.utils.SingleLiveEvent

abstract class BaseViewModel : ViewModel(), RemoteErrorEmitter {

    val mutableProgress = MutableLiveData<Int>(View.GONE)
    val mutableScreenState = SingleLiveEvent<ScreenState>()
    val mutableErrorMessage = SingleLiveEvent<String>()
    val mutableSuccessMessage = MutableLiveData<String>()
    val mutableErrorType = SingleLiveEvent<ErrorType>()


    override fun onError(errorType: ErrorType) {
        mutableErrorType.postValue(errorType)
    }

    override fun onError(msg: String) {
        mutableErrorMessage.postValue(msg)
    }

}