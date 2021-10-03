package com.my.feature_a

import androidx.lifecycle.ViewModel
import com.my.shared_base.MainNavigator

class AViewModel(
    private val navigator: MainNavigator
): ViewModel() {

    fun test(){
        navigator.test()
    }
}