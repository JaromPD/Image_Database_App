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
        val addButton = findViewById<Button>(R.id.add_button)
        val editButton = findViewById<Button>(R.id.edit_button)
        val removeButton = findViewById<Button>(R.id.remove_button)
        val viewButton = findViewById<Button>(R.id.view_button)

        // Open add screen
        addButton.setOnClickListener{
            val Intent = Intent(this, AddActivity::class.java)
            startActivity(Intent)
        }

        editButton.setOnClickListener {
            val Intent = Intent(this, EditActivity::class.java)
            startActivity(Intent)
        }

        removeButton.setOnClickListener {
            val Intent = Intent(this, RemoveActivity::class.java)
            startActivity(Intent)
        }

        viewButton.setOnClickListener {
            val Intent = Intent(this, ViewActivity::class.java)
            startActivity(Intent)
        }

    }
}

//Test URLS
// Rexburg https://i.imgur.com/wdqytYA.jpg
// Spori https://i.imgur.com/gs78unU.jpg