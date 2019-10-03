package com.example.atlantazoo.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

const val TYPE_KEY = "type"
const val ANIMAL_KEY = "animal"

@Parcelize
class Animal(val name: String, val type: String) : Parcelable {
}