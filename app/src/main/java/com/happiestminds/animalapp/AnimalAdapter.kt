package com.happiestminds.animalapp

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView


/**
 * [RecyclerView.Adapter] that can display a [PlaceholderItem].
 * TODO: Replace the implementation with code for your data type.
 */
class AnimalAdapter(
    private val values: List<Animal>
) : RecyclerView.Adapter<AnimalAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.fragment_item,parent,false))


    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val animal = values[position]
        holder.idView.text = animal.name

        when(animal.name.lowercase()){
            "dog" -> holder.imgView.setImageResource(R.drawable.dog)
            "cat" -> holder.imgView.setImageResource(R.drawable.cat)
            "cow" -> holder.imgView.setImageResource(R.drawable.cow)
            "buffalo" -> holder.imgView.setImageResource(R.drawable.buffalo)
            "tiger" -> holder.imgView.setImageResource(R.drawable.tiger)
            "deer" -> holder.imgView.setImageResource(R.drawable.deer)
            "lion" -> holder.imgView.setImageResource(R.drawable.lion)
            "giraffe" -> holder.imgView.setImageResource(R.drawable.giraffe)
            "fox" -> holder.imgView.setImageResource(R.drawable.fox)
        }

    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        val idView: TextView = view.findViewById(R.id.nameT)
        val imgView: ImageView = view.findViewById(R.id.imgV)


    }

}