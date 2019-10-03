package com.example.atlantazoo.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.atlantazoo.R
import com.example.atlantazoo.models.Animal
import com.example.atlantazoo.models.TYPE_KEY
import com.example.atlantazoo.views.ZooAnimalList

class ZooAnimalTypesAdapter(val types: List<String>) : BaseAdapter(){
    override fun getCount(): Int = types.size
    override fun getItem(pos: Int): String = types.get(pos)
    override fun getItemId(pos: Int) = (pos as Long)
    override fun getView(pos: Int, convertView: View?, parent: ViewGroup): View {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.animal_type_item, parent, false)
        val type = types.get(pos)
        val typeTextView: TextView = view.findViewById(R.id.types_tv)
        typeTextView.text = type
        typeTextView.setOnClickListener {
            val listIntent = Intent(parent.context, ZooAnimalList::class.java).apply {
                putExtra(TYPE_KEY, type)
            }
            parent.context.startActivity(listIntent)
        }
        return view
    }
}