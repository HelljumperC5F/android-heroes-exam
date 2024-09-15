package com.example.examen.publisher.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.examen.publisher.Publisher
import com.example.examen.R

class PublisherAdapter(private val publisherList: List<Publisher>): RecyclerView.Adapter<PublisherViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PublisherViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return PublisherViewHolder(layoutInflater.inflate(R.layout.recycler_view_publisher_row, parent, false))
    }

    override fun getItemCount(): Int = publisherList.size

    override fun onBindViewHolder(holder: PublisherViewHolder, position: Int) {
        val item = publisherList[position]
        holder.render(item)
    }
}