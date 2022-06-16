package com.example.image_database
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val add_button = findViewById<Button>(R.id.add_button)
        val edit_button = findViewById<Button>(R.id.edit_button)
        val remove_button = findViewById<Button>(R.id.remove_button)
        val view_button = findViewById<Button>(R.id.view_button)
        val db = Firebase.firestore

        // Open add screen
        add_button.setOnClickListener{
            val Intent = Intent(this, AddActivity::class.java)
            startActivity(Intent)
        }

        edit_button.setOnClickListener {
            val Intent = Intent(this, EditActivity::class.java)
            startActivity(Intent)
        }

        remove_button.setOnClickListener {
            val Intent = Intent(this, RemoveActivity::class.java)
            startActivity(Intent)
        }

        view_button.setOnClickListener {
            val Intent = Intent(this, ViewActivity::class.java)
            startActivity(Intent)
        }

    }
}