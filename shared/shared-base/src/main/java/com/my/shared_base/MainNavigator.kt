package com.my.shared_base

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel

class MainNavigator(
    application: Application
) : AndroidViewModel(application) {

    val whenActivityActive = MainActivityActions()

    fun test() {
Log.d("EE", "TEST")
    }
//  val whenActivityActive = MainActivityActions()

//  private val _result = MutableLiveData<Event<Any>>()
//  val result: LiveData<Event<Any>> = _result

//    override fun launch(screen: BaseScreen) = whenActivityActive {
//        launchFragment(it, screen)
//    }
//
//    override fun goBack(result: Any?) = whenActivityActive {
//        if (result != null) {
//            _result.value = Event(result)
//        }
//        it.onBackPressed()
//    }
//
    override fun onCleared() {
        super.onCleared()
        whenActivityActive.clear()
    }
//
//    override fun toast(messageRes: Int) {
//        Toast.makeText(getApplication(), messageRes, Toast.LENGTH_SHORT).show()
//    }
//
//    override fun getString(messageRes: Int): String {
//        return getApplication<Application>().getString(messageRes)
//    }
//
//    fun launchFragment(activity: MainActivity, screen: BaseScreen, addToBackStack: Boolean = true) {
//        val fragment = screen.javaClass.enclosingClass.newInstance() as Fragment
//        fragment.arguments = bundleOf(ARG_SCREEN to screen)
//        val transaction = activity.supportFragmentManager.beginTransaction()
//        if (addToBackStack) transaction.addToBackStack(null)
//        transaction
//            .replace(R.id.fragmentContainer, fragment)
//            .commit()
//    }
}