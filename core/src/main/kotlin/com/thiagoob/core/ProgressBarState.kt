package com.thiagoob.core

sealed class ProgressBarState {
    object Loading: ProgressBarState()

    object Idle: ProgressBarState()
}