package com.mediaproject.presentation.view.activity

import android.view.View
import androidx.activity.viewModels
import com.mediaproject.domain.utils.ErrorState
import com.mediaproject.practiceproject.R
import com.mediaproject.presentation.base.BaseActivity
import com.mediaproject.practiceproject.databinding.ActivityMainBinding
import com.mediaproject.presentation.viewmodel.MainActViewModel
import com.mediaproject.presentation.widget.states.UIState
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    companion object {
        private const val TAG = "[MainAct]"
    }

    private val viewModel by viewModels<MainActViewModel>()

    override fun init() {
        observeViewModel()
    }

    private fun observeViewModel() {
        if (viewModel.uiState.hasActiveObservers()) {
            viewModel.uiState.removeObservers(this)
        }
        viewModel.uiState.observe(this) { state -> observedUIState(state) }
    }

    private fun observedUIState(state: UIState) = when (state) {
        is UIState.Loading -> {
            TODO("Loading State")
        }
        is UIState.Success -> {
            TODO("Success State")
        }
        is UIState.Failure -> {
            when (state.errorState) {
                is ErrorState.NetworkError -> {

                }
                is ErrorState.TimeOutError -> {

                }
                is ErrorState.NotFoundResults -> {

                }
                is ErrorState.SessionExpiredError -> {

                }
                is ErrorState.UnknownError -> {

                }
            }
        }
    }

}