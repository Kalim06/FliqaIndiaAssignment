package com.example.fliqaindiaassignment.utils

import com.example.fliqaindiaassignment.R

object Constants {

    fun getServices(): List<ServicesModel> {

        val dataList = mutableListOf<ServicesModel>()

        dataList.add(
            ServicesModel(
                R.drawable.services_img_1,
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
                R.drawable.services_img_2,
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
                R.drawable.services_img_3,
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

    fun getOffers(): List<OfferModel> {

        val dataList = mutableListOf<OfferModel>()

        dataList.add(OfferModel(R.drawable.offers_img_1, "Wedding Shoot"))
        dataList.add(OfferModel(R.drawable.offers_img_2, "Pre-Wedding Shoot"))
        dataList.add(OfferModel(R.drawable.offers_img_3, "Birthday Shoot"))
        dataList.add(OfferModel(R.drawable.offers_img_4, "Product Shoot"))
        dataList.add(OfferModel(R.drawable.offers_img_5, "UI/UX Design"))

        return dataList
    }


}