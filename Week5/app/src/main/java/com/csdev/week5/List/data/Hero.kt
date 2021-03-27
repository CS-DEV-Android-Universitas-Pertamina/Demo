package com.csdev.week5.List.data

import android.media.Image
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

data class Hero(
    var photo: Int,
    var name: String,
    var description: String
)