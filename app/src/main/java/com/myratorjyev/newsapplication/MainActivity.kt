package com.myratorjyev.newsapplication

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.ui.setupWithNavController
import com.myratorjyev.newsapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.fragment_splash)


        Handler(Looper.myLooper()!!).postDelayed({
            setContentView(binding.root)
            binding.bottomNavMenu.setupWithNavController(
                navController = Navigation.findNavController(this, R.id.nav_host_fragment)
            )
        },5000)
    }

}