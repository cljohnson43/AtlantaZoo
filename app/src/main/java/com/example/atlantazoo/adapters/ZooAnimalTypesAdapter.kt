package com.example.atlantazoo.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.atlantazoo.R

class ZooAnimalTypesAdapter(val types: List<String>) : BaseAdapter(){
    override fun getCount(): Int = types.size
    override fun getItem(pos: Int): String = types.get(pos)
    override fun getItemId(pos: Int) = pos as Long
    override fun getView(pos: Int, convertView: View?, parent: ViewGroup): View {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.animal_type_item, parent, false)
        val typeTextView: TextView = view.findViewById(R.id.types_tv)
        typeTextView.text = types.get(pos)
        return view
    }
}