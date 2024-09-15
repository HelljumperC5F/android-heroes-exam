package com.example.examen.heroes.adapter

import android.content.Intent
import android.net.Uri
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.examen.HeroDetailActivity
import com.example.examen.PublisherActivity
import com.example.examen.R
import com.example.examen.heroes.Hero
import com.squareup.picasso.Picasso

class HeroesViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val nombreHero: TextView = view.findViewById(R.id.nombreHero)
    val heroImage: ImageView = view.findViewById(R.id.imageHero)
    val heroRowConstraint: ConstraintLayout = view.findViewById(R.id.heroRowConstraint)
    val heroPublisher: TextView = view.findViewById(R.id.heroPublisher)
    val context = view.context

    fun render(hero: Hero) {
        nombreHero.text = hero.name
        heroPublisher.text = hero.publisher

        Picasso.get().
        load(Uri.parse(hero.imageUri)).
        into(heroImage)

        heroRowConstraint.setOnClickListener {
            val intent: Intent = Intent(context, HeroDetailActivity::class.java)
            intent.putExtra("heroId", hero.id)
            context.startActivity(intent)
        }
    }
}