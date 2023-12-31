package com.example.fliqaindiaassignment.home

import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class HomeImageAdapter(activity: AppCompatActivity, private val itemsCount: Int) :
    FragmentStateAdapter(activity) {
    override fun getItemCount() = itemsCount
    override fun createFragment(position: Int) = HomeImageFragment.getInstance(position)
}