package com.example.fliqaindiaassignment.home

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.fliqaindiaassignment.R

fun ImageView.loadImage(image: Int) {
    Glide.with(this)
        .load(image)
        .placeholder(R.drawable.loading_animation)
        .error(R.drawable.broken_image)
        .centerCrop()
        .into(this)
}