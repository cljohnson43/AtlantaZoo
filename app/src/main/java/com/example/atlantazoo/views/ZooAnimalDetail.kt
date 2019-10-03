package com.example.atlantazoo.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atlantazoo.R
import com.example.atlantazoo.models.ANIMAL_KEY
import com.example.atlantazoo.models.Animal
import kotlinx.android.synthetic.main.activity_zoo_animal_detail.*

class ZooAnimalDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zoo_animal_detail)

        val animal: Animal = intent?.getParcelableExtra<Animal>(ANIMAL_KEY) ?: Animal("", "")

        animal_name_tv.text = animal.name
        animal_type_tv.text = animal.type
    }
}
