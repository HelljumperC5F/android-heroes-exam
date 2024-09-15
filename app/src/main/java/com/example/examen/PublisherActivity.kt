package com.example.examen

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.examen.publisher.Publisher
import com.example.examen.publisher.adapter.PublisherAdapter

// Vista para mostrar los dos publisher
class PublisherActivity : AppCompatActivity() {

    val Publishers = listOf(
        Publisher(1, "Marvel", "https://iconape.com/wp-content/png_logo_vector/marvel-logo.png"),
        Publisher(2, "DC", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3d/DC_Comics_logo.svg/1200px-DC_Comics_logo.svg.png"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_publisher)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initRecyclerView()
    }

    fun onClickLogout(view: View) {
        getSharedPreferences("preferences", Context.MODE_PRIVATE).edit().putBoolean("isLogged", false).apply()

        startActivity(Intent(this, MainActivity::class.java))
        finish()
        return
    }

    fun initRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewPublisher)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = PublisherAdapter(Publishers)
    }
}