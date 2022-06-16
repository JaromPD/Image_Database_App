package com.example.image_database

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class AddActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)
        val imageNameInput = findViewById<EditText>(R.id.name_textbox)
        val dateInput = findViewById<EditText>(R.id.date_textbox)
        val urlInput = findViewById<EditText>(R.id.URL_textbox)

        val addButton = findViewById<Button>(R.id.view_button)

        val userImageName = imageNameInput.text
        val userDate = dateInput.text
        val userUrl = urlInput.text

        val db = Firebase.firestore

        addButton.setOnClickListener {
            val testMap = hashMapOf("Date" to userDate.toString(), "URL" to userUrl.toString())
            db.collection("Images").document(userImageName.toString()).set(testMap)
            Toast.makeText(applicationContext, "Added!", Toast.LENGTH_SHORT).show()
        }
    }
}