package com.mediaproject.practiceproject.view.activity

import android.util.Log
import android.view.View
import androidx.activity.viewModels
import com.mediaproject.practiceproject.R
import com.mediaproject.practiceproject.base.BaseActivity
import com.mediaproject.practiceproject.databinding.ActivityMainBinding
import com.mediaproject.practiceproject.viewmodel.MainActViewModel
import com.mediaproject.practiceproject.widget.utils.ScreenState
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    companion object {
        const val TAG = "[MainAct]"
    }

    private val viewModel by viewModels<MainActViewModel>()

    override fun init() {

    }

    fun clickSearchBtn(view: View){
        viewModel.userRepo("huihun66@ajou.ac.kr")
//        viewModel.getUserRepo(binding.githubNameEditTxt.text.toString())
    }

    private fun observeViewModel() {
//        viewModel.mutableScreenState.observe(this) {
//            Log.d(TAG, "ScreenState: $it")
//            when (it) {
//                ScreenState.RENDER -> {
//                    shortShowToast("성공!")
//                }
//                ScreenState.LOADING -> {
//                    shortShowToast("로딩중")
//                }
//                ScreenState.ERROR -> {
//                    shortShowToast("에러 발생!")
//                }
//                else -> {
//                    shortShowToast("알 수 없는 에러 발생!")
//                }
//            }
//        }
//        viewModel.eventUserRepo.observe(this) {
//            it.map { item ->
//            }
//        }
    }
}