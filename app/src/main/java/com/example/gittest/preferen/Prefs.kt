package com.example.gittest.preferen
import android.content.Context

class Prefs(val context: Context) {


    val DB_PREFS = "DB_Example"
    val USER_NAME = "USER"
    val PASS_NAME = "PASS"

    fun SaveLogin(user: String, pass: String) {
        context.getSharedPreferences(DB_PREFS, Context.MODE_PRIVATE)
            .edit().putString(USER_NAME, user)
            .putString(PASS_NAME, pass).apply()
    }

    fun SaveLogin(login: Login) {
        context.getSharedPreferences(DB_PREFS, Context.MODE_PRIVATE)
            .edit().putString(USER_NAME, login.user)
            .putString(PASS_NAME, login.pass).apply()
    }
    fun SaveUser(user: String) {
        context.getSharedPreferences(DB_PREFS, Context.MODE_PRIVATE)
            .edit()
            .putString(USER_NAME, user)
            .apply()
    }
    fun SavePassword( pass: String) {
        context.getSharedPreferences(DB_PREFS, Context.MODE_PRIVATE)
            .edit()
            .putString(PASS_NAME, pass)
            .apply()
    }
    fun GetPass(): String? {
        var config = context.getSharedPreferences(DB_PREFS, Context.MODE_PRIVATE)
        return config.getString(PASS_NAME, null)
    }

    fun GetUser(): String? {
        var config = context.getSharedPreferences(DB_PREFS,    Context.MODE_PRIVATE)
        return config.getString(USER_NAME, null)
    }
}
