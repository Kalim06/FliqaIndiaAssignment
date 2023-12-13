package com.example.fliqaindiaassignment.utils

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri

fun Context.watchYoutube(id: String) {
    val appIntent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$id"))
    val webIntent = Intent(
        Intent.ACTION_VIEW,
        Uri.parse("https://youtu.be/$id")
    )
    try {
        this.startActivity(appIntent)
    } catch (ex: ActivityNotFoundException) {
        this.startActivity(webIntent)
    }
}