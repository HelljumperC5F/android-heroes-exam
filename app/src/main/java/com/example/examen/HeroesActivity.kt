package com.example.examen

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.examen.HeroList.Companion.HeroesList
import com.example.examen.heroes.adapter.HeroesAdapter

// Mostrar Lista de heroes de uno de los dos publisher
class HeroesActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_heroes)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initRecyclerView()
    }

    fun initRecyclerView() {
        val publisher = intent.getStringExtra("publisher")
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewHeroes)
        recyclerView.layoutManager = LinearLayoutManager(this)

        if (publisher.equals("DC")) {
            val DCHeroes = HeroesList.filter { it.publisher.equals("DC") }
            recyclerView.adapter = HeroesAdapter(DCHeroes)
        }

        if (publisher.equals("Marvel")) {
            val MarvelHeroes = HeroesList.filter { it.publisher.equals("Marvel") }
            recyclerView.adapter = HeroesAdapter(MarvelHeroes)
        }
    }
}