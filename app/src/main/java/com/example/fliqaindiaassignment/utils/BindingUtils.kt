package com.example.fliqaindiaassignment.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.google.android.material.imageview.ShapeableImageView

//Services
@BindingAdapter("servicesImage")
fun ImageView.setServicesImage(item: ServicesModel?) {
    item?.let {
        setImageResource(it.image)
    }
}

//Gallery
@BindingAdapter("galleryImage")
fun ShapeableImageView.setGalleryImage(item: GalleryModel?) {
    item?.let {
        Glide.with(this)
            .load(it.image)
            .centerCrop()
            .transition(DrawableTransitionOptions.withCrossFade(100))
            .into(this)
    }
}