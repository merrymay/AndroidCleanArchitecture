package com.may.androidcleanarchitecture.ui.navigation

import android.content.Context
import com.may.androidcleanarchitecture.ui.LoginActivity
import com.may.androidcleanarchitecture.ui.MainActivity
import features.login.Authenticator
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Navigator
@Inject constructor(private val authenticator: Authenticator) {

    private fun showLoginActivity(context: Context) = context.startActivity(LoginActivity.callingIntent(context))
    private fun showMainActivity(context: Context) = context.startActivity(MainActivity.callingIntent(context))

    fun showMain(context: Context){
        when(authenticator.userLoggedIn()){
            true -> showMainActivity(context)
            false -> showLoginActivity(context)
        }
    }
}