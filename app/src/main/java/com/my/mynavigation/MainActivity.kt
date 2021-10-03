package com.my.mynavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import com.my.shared_base.MainNavigator

class MainActivity : AppCompatActivity() {

    private val navigator by viewModels<MainNavigator> {
        ViewModelProvider.AndroidViewModelFactory(application)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        navigator.whenActivityActive.mainActivity = this
    }

    override fun onPause() {
        super.onPause()
        navigator.whenActivityActive.mainActivity = null
    }
}