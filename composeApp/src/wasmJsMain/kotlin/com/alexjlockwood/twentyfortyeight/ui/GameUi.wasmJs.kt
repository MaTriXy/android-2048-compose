package com.alexjlockwood.twentyfortyeight.ui

import kotlinx.browser.window

internal actual fun shouldDetectSwipes(): Boolean {
    return window.navigator.maxTouchPoints > 0
}

internal actual fun shouldCenterAlignTopAppBar(): Boolean {
    return false
}
