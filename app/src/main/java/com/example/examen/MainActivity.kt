package com.example.examen

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

// Clase para representar a los usuarios
class User (val email: String, val password: String)

class MainActivity : AppCompatActivity() {
    // Array de usuarios predeterminados
    var DefaultUsers = arrayOf(
        User("admin@gmail.com", "admin"),

        User("user1@gmail.com", "user1"),
        User("user2@gmail.com", "user2"),
        User("user3@gmail.com", "user3"),
        User("user4@gmail.com", "user4"),
        )

    // Manejador del evento de inicio de sesión
    fun onClickLogin(view: View) {
        val email = findViewById<TextView>(R.id.emailText).text.toString().trim()
        val password = findViewById<EditText>(R.id.passwordText).text.toString().trim()
        Log.d("HaloLog", "The email is: ${email}")
        Log.d("HaloLog", "The password is: ${password}")

        var validLogin = false
        for (user in DefaultUsers) {
            Log.d("HaloLog", "Email: ${user.email}, Password: ${user.password}")
            if (user.email.equals(email) && user.password.equals(password)) {
                validLogin = true
                break
            }
        }

        Log.d("HaloLog", "Valid Login: $validLogin")

        if (!validLogin) {
            val snackBar = Snackbar.make(
                findViewById(R.id.main),
                "Email or password are incorrect.",
                Snackbar.LENGTH_LONG
            ).setAction("Undo", null)

            snackBar.show()
            return
        }

        getSharedPreferences("preferences", Context.MODE_PRIVATE).edit().putBoolean("isLogged", true).apply()

        startActivity(Intent(this, PublisherActivity::class.java))
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        // Verificar si ya se ha iniciado sesion
        if (getSharedPreferences("preferences", Context.MODE_PRIVATE).getBoolean("isLogged", false)) {
            super.onCreate(savedInstanceState)
            startActivity(Intent(this, PublisherActivity::class.java))
            finish()
            return
        }

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}