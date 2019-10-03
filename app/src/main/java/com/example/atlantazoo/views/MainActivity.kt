package com.example.atlantazoo.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atlantazoo.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        animals_tv.setOnClickListener {
            val intent = Intent(this, ZooAnimalTypes::class.java)
            startActivity(intent)
        }
    }
}
