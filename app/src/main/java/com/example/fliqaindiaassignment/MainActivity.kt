package com.example.fliqaindiaassignment

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.fliqaindiaassignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.menuBtn.setOnClickListener {
            binding.menuContainer.visibility = View.VISIBLE
        }

        binding.menu.menuCloseBtn.setOnClickListener {
            binding.menuContainer.visibility = View.GONE
        }
    }
}