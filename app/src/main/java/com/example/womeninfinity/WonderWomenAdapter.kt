package com.example.womeninfinity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.womeninfinity.models.Women

class WonderWomenAdapter(private val context: Context, private val women: ArrayList<Women>): RecyclerView.Adapter<WonderWomenAdapter.ViewHolder>() {


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: TextView = itemView.findViewById<TextView>(R.id.name)
        var imageView: ImageView = itemView.findViewById<ImageView>(R.id.profileImage)
        var shortDescription: TextView = itemView.findViewById<TextView>(R.id.shortDesc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.item_women,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = women[position].name
        holder.shortDescription.text = women[position].shortDesc
        Glide.with(context)
            .asBitmap()
            .load(women[position].imageUrl)
            .into(holder.imageView)
    }

    override fun getItemCount(): Int {
        return women.size
    }
}