package com.example.examen

import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.examen.HeroList.Companion.HeroesList
import com.squareup.picasso.Picasso

// Detalles de un heroe
class HeroDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_hero_detail)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val heroId = intent.getIntExtra("heroId", -1)

        val hero = HeroesList.find { it.id == heroId }
        if (hero != null) {
            findViewById<TextView>(R.id.heroDetailsName).text = hero.name
            findViewById<TextView>(R.id.heroDetailsPublisher).text = hero.publisher
            findViewById<TextView>(R.id.heroDetailsDescription).text = hero.description

            Picasso.get().
            load(Uri.parse(hero.imageUri)).
            into(findViewById<ImageView>(R.id.heroDetailsImage))
        }

    }
}