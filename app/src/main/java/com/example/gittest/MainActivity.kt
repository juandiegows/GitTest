package com.example.gittest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.gittest.databinding.ActivityMainBinding
import com.example.gittest.preferen.Prefs
import com.example.gittest.preferen.SharedPreferentApplication
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
            binding.apply {

            SharedPreferentApplication.prefs.SaveUser("Juan Diego")
        }


    }



}
