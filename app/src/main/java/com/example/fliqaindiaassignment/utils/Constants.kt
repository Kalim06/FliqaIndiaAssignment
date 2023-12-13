package com.example.fliqaindiaassignment.utils

import com.example.fliqaindiaassignment.R

object Constants {

    fun getServices(): List<ServicesModel> {

        val dataList = mutableListOf<ServicesModel>()

        dataList.add(
            ServicesModel(
                R.drawable.services_img1,
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
                R.drawable.services_img2,
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
                R.drawable.services_img3,
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

        dataList.add(OfferModel(R.drawable.offers_img1, "Wedding Shoot"))
        dataList.add(OfferModel(R.drawable.offers_img2, "Pre-Wedding Shoot"))
        dataList.add(OfferModel(R.drawable.offers_img3, "Birthday Shoot"))
        dataList.add(OfferModel(R.drawable.offers_img4, "Product Shoot"))
        dataList.add(OfferModel(R.drawable.offers_img5, "UI/UX Design"))

        return dataList
    }

    fun getWeddings(): List<WeddingModel> {

        val dataList = mutableListOf<WeddingModel>()

        dataList.add(WeddingModel(R.drawable.wedding_img1,"Bijoy & Shreya"))
        dataList.add(WeddingModel(R.drawable.wedding_img2,"Monoj & Riyan"))
        dataList.add(WeddingModel(R.drawable.wedding_img3,"Rishi & Adrita"))
        dataList.add(WeddingModel(R.drawable.wedding_img4,"Shuful & Mita"))
        dataList.add(WeddingModel(R.drawable.wedding_img5,"Rahit & Arisha"))

        return dataList
    }


}