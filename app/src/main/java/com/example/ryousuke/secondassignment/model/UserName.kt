package com.example.ryousuke.secondassignment.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

//This is big differences because kotlin-extensions is deprecated so we have to change plugin!!
@Parcelize
data class UserName (
    val userName: String
        ): Parcelable