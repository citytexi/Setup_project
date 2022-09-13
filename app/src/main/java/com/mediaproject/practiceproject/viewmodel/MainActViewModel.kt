package com.mediaproject.practiceproject.viewmodel

import android.content.SharedPreferences
import com.mediaproject.practiceproject.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainActViewModel
@Inject
constructor(
    private val sharedPreferences: SharedPreferences
) : BaseViewModel() {


}