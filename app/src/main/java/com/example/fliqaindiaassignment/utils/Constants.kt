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

        dataList.add(WeddingModel(R.drawable.wedding_img1, "Bijoy & Shreya"))
        dataList.add(WeddingModel(R.drawable.wedding_img2, "Monoj & Riyan"))
        dataList.add(WeddingModel(R.drawable.wedding_img3, "Rishi & Adrita"))
        dataList.add(WeddingModel(R.drawable.wedding_img4, "Shuful & Mita"))
        dataList.add(WeddingModel(R.drawable.wedding_img5, "Rahit & Arisha"))

        return dataList
    }

    fun getCourses(): List<CoursesModel> {

        val dataList = mutableListOf<CoursesModel>()

        dataList.add(CoursesModel(R.drawable.course_img1, "Photography"))
        dataList.add(CoursesModel(R.drawable.course_img2, "Videography"))
        dataList.add(CoursesModel(R.drawable.course_img3, "Cinematography"))
        dataList.add(CoursesModel(R.drawable.course_img4, "Animation"))
        dataList.add(CoursesModel(R.drawable.course_img5, "Designing"))

        return dataList
    }

    fun getBlogs(): List<BlogsModel> {

        val dataList = mutableListOf<BlogsModel>()

        dataList.add(
            BlogsModel(
                R.drawable.blog_img1,
                "Capturing Photos in different styles",
                "The word photography means 'drawing with light,' which derives from the Greek photo, meaning light, and graph, meaning to draw. Photography is the process of recording an image – a photograph – on light-sensitive film or, in the case of digital Photography, via a digital electronic or magnetic memory. "
            )
        )

        dataList.add(
            BlogsModel(
                R.drawable.blog_img2,
                "Basic Post-Processing Tips to Instantly Improve Your Photos",
                "Photography post-processing opens up the enormous potential for transforming an image, whether to make it just as vivid as you remember or something that even defies the laws of gravity. Digging up tutorials on specific photo edits is excellent, but understanding photography post-processing techniques allow even rookies to learn concepts that can apply to any image."
            )
        )

        dataList.add(
            BlogsModel(
                R.drawable.blog_img3,
                "Basic Post-Processing Tips to Instantly Improve Your Photos",
                "Light plays a vital role in photography. Photography is an image created by light falling on a photo-sensitive surface, usually photographic film or an electronic image sensor. Photography is the skill of clicking photos creatively."
            )
        )

        dataList.add(
            BlogsModel(
                R.drawable.blog_img4,
                "Composition and Perspective of the Photography",
                "Composition in photography is defined as positioning the objects in the frame so that the viewer's eye is automatically drawn to the most exciting or significant area of the capture."
            )
        )

        return dataList
    }

    fun getClients(): List<ClientsModel> {

        val dataList = mutableListOf<ClientsModel>()

        dataList.add(ClientsModel(R.drawable.client_img1, "Aditya", "Wedding", "client 1"))
        dataList.add(ClientsModel(R.drawable.client_img2, "Rahul", "Pre Wedding", "client 2"))
        dataList.add(ClientsModel(R.drawable.client_img3, "Aliyna", "Product", "client 3"))
        dataList.add(ClientsModel(R.drawable.client_img4, "Monoj", "Corporate", "client 4"))
        dataList.add(ClientsModel(R.drawable.client_img5, "Sanjida", "Corporate", "client 5"))

        return dataList
    }


}