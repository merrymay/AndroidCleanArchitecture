package com.may.androidcleanarchitecture.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.may.androidcleanarchitecture.R

class LoginActivity : AppCompatActivity() {

    companion object {
        fun callingIntent(context: Context) = Intent(context, LoginActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
}