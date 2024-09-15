package com.example.examen.heroes.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.examen.R
import com.example.examen.heroes.Hero

class HeroesAdapter(private val heroesList: List<Hero>): RecyclerView.Adapter<HeroesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroesViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return HeroesViewHolder(layoutInflater.inflate(R.layout.recycler_view_hero_row, parent, false))
    }

    override fun getItemCount(): Int = heroesList.size

    override fun onBindViewHolder(holder: HeroesViewHolder, position: Int) {
        val item = heroesList[position]
        holder.render(item)
    }
}