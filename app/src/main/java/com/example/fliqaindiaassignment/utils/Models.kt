package com.example.fliqaindiaassignment.utils


data class ServicesModel(
    var image: Int,
    var title: String,
    var service1: String,
    var service2: String,
    var service3: String,
    var service4: String,
    var service5: String,
    var service6: String
)

data class GalleryModel(var image: Int)

data class OfferModel(var image: Int, var title: String)

data class WeddingModel(var image: Int, var title: String)

data class CoursesModel(var image: Int, var title: String)