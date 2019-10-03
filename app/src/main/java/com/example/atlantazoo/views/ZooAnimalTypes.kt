package com.example.atlantazoo.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.atlantazoo.R
import com.example.atlantazoo.adapters.ZooAnimalTypesAdapter
import kotlinx.android.synthetic.main.activity_zoo_animal_types.*

const val MAMMAL = "Mammal"
const val BIRD = "Bird"
const val REPTILE = "Reptile"
const val FISH = "Fish"
const val AMPHIBIAN = "Amphibian"
const val BUG = "Bug"
const val INVERTEBRATE = "Invertebrate"

class ZooAnimalTypes : AppCompatActivity() {
    val types: List<String> = listOf(
        MAMMAL,
        BIRD,
        REPTILE,
        FISH,
        AMPHIBIAN,
        BUG,
        INVERTEBRATE
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zoo_animal_types)

        types_lv.adapter = ZooAnimalTypesAdapter(types)

    }


}
