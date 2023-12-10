package com.example.fliqaindiaassignment.utils

import com.example.fliqaindiaassignment.R

object Constants {

    fun getServices(): List<ServicesModel> {

        val dataList = mutableListOf<ServicesModel>()

        dataList.add(
            ServicesModel(
                R.drawable.event_img,
                "Events",
                "Wedding Photography",
                "Pre-Wedding Shoot",
                "Birthday Photography",
                "Corporate Photography",
                "Portfolio Shoot",
                "Product Photography"
            )
        )

        dataList.add(
            ServicesModel(
                R.drawable.photography,
                "24*7 Photography",
                "Full Day Shoot",
                "Half Day Shoot",
                "Fashion Shoot",
                "Model Shoot",
                "Drone Shoot",
                "Travel Shoot"
            )
        )

        dataList.add(
            ServicesModel(
                R.drawable.graphics,
                "Graphics Designing",
                "Poster Designing",
                "Logo Designing",
                "Motion Graphics",
                "UI/UX Design",
                "Business Card",
                "Illustrator Design"
            )
        )

        return dataList
    }

    fun getGalleryImages(): List<GalleryModel> {

        val dataList = mutableListOf<GalleryModel>()

        dataList.add(GalleryModel(R.drawable.gallery_image1))
        dataList.add(GalleryModel(R.drawable.gallery_image2))
        dataList.add(GalleryModel(R.drawable.gallery_image3))
        dataList.add(GalleryModel(R.drawable.gallery_image4))
        dataList.add(GalleryModel(R.drawable.gallery_image5))
        dataList.add(GalleryModel(R.drawable.gallery_image6))
        dataList.add(GalleryModel(R.drawable.gallery_image7))
        dataList.add(GalleryModel(R.drawable.gallery_image8))
        dataList.add(GalleryModel(R.drawable.gallery_image9))

        return dataList
    }

}