package com.may.androidcleanarchitecture.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.may.androidcleanarchitecture.ui.navigation.Navigator
import features.login.Authenticator

class RouterActivity : AppCompatActivity() {

    var navigator: Navigator = Navigator(Authenticator()) // TODO - use lateinit and dependency injection

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        navigator.showMain(this)
    }
}