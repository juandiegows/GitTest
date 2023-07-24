package com.example.gittest.preferen

import android.app.Application

class SharedPreferentApplication : Application() {
    companion object {
        lateinit var prefs: Prefs
    }





    override fun onCreate() {
        super.onCreate()
        prefs = Prefs(this)
    }
}