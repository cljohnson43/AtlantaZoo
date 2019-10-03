package com.example.atlantazoo.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.atlantazoo.R
import com.example.atlantazoo.models.ANIMAL_KEY
import com.example.atlantazoo.models.Animal
import com.example.atlantazoo.views.ZooAnimalDetail

class ZooAnimalListAdapter(val animals: List<Animal>) :
    RecyclerView.Adapter<ZooAnimalListAdapter.AnimalViewHolder>() {

    class AnimalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTV: TextView = itemView.findViewById(R.id.animal_name_tv)
        val typeTV: TextView = itemView.findViewById(R.id.animal_type_tv)
    }

    override fun getItemCount(): Int = animals.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.animal_item, parent, false)

        return AnimalViewHolder(view)
    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        val animal = animals.get(position)

        holder.nameTV.text = animal.name
        holder.typeTV.text = animal.type
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, ZooAnimalDetail::class.java).apply {
                putExtra(ANIMAL_KEY, animals.get(position))
            }
            holder.itemView.context.startActivity(intent)
        }
    }
}
