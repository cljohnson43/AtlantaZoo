package com.example.atlantazoo.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Animal(val name: String, val type: String) : Parcelable {
}