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

//Wedding
@BindingAdapter("weddingImage")
fun ShapeableImageView.setWeddingImage(item: WeddingModel?) {
    item?.let {
        setImageResource(it.image)
    }
}

//Courses
@BindingAdapter("courseImage")
fun ShapeableImageView.setCourseImage(item: CoursesModel?) {
    item?.let {
        setImageResource(it.image)
    }
}

//Blogs
@BindingAdapter("blogImage")
fun ShapeableImageView.setBlogImage(item: BlogsModel?) {
    item?.let {
        setImageResource(it.image)
    }
}

//Clients
@BindingAdapter("clientImage")
fun ShapeableImageView.setClientImage(item: ClientsModel?) {
    item?.let {
        setImageResource(it.image)
    }
}
