package com.example.atlantazoo.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.atlantazoo.R
import com.example.atlantazoo.adapters.ZooAnimalListAdapter
import com.example.atlantazoo.models.Animal
import kotlinx.android.synthetic.main.activity_zoo_animal_list.*

class ZooAnimalList : AppCompatActivity() {
    val animals: List<Animal> = listOf(
        Animal("Lion", MAMMAL),
        Animal("Tiger", MAMMAL),
        Animal("Shark", FISH),
        Animal("Eagle", BIRD),
        Animal("Cobra", REPTILE),
        Animal("Poison Dart Frog", AMPHIBIAN),
        Animal("Sea Urchin", INVERTEBRATE ),
        Animal("Scorpion", BUG)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zoo_animal_list)

        val type = intent?.getStringExtra("type") ?: ""
        setupView(animals.filter { it.type == type})
    }

    fun setupView(list: List<Animal>) {
        val adapter = ZooAnimalListAdapter(list)

        animal_list_rv.layoutManager = LinearLayoutManager(this)
        animal_list_rv.adapter = adapter
    }
}
