package com.example.fliqaindiaassignment.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
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
        setImageResource(it.image)
    }
}

//Offers
@BindingAdapter("offersImage")
fun ShapeableImageView.setOffersImage(item: OfferModel?) {
    item?.let {
        setImageResource(it.image)
    }
}