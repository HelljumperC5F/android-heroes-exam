package com.example.examen.publisher.adapter

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.net.Uri
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.examen.HeroesActivity
import com.example.examen.publisher.Publisher
import com.example.examen.R
import com.squareup.picasso.Picasso

class PublisherViewHolder(val view: View): RecyclerView.ViewHolder(view) {
    val publisherNombre: TextView = view.findViewById<TextView>(R.id.nombrePublisher)
    val publisherImage: ImageView = view.findViewById<ImageView>(R.id.imagePublisher)
    val rowConstraint: ConstraintLayout = view.findViewById<ConstraintLayout>(R.id.publisherRowConstraint)
    val context = view.context

    fun render(publisher: Publisher) {
        publisherNombre.text = publisher.name
        Picasso.get().
        load(Uri.parse(publisher.imageUri)).
        into(publisherImage)

        rowConstraint.setOnClickListener {
            val intent: Intent = Intent(context, HeroesActivity::class.java)
            intent.putExtra("publisher", publisher.name)
            context.startActivity(intent)
        }
    }
}