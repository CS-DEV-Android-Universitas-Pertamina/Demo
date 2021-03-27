package com.csdev.week5.List.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Hero2(
    var photo: String,
    var name: String,
    var description: String
) : Parcelable