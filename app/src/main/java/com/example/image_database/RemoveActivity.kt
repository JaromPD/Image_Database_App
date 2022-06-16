package com.example.image_database

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class RemoveActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_remove)

        val collection = "Images"
        val db = Firebase.firestore

        val userImageNameInput = findViewById<EditText>(R.id.name_textbox).text
        val removeButton = findViewById<Button>(R.id.view_button)

        removeButton.setOnClickListener {
            val removeRef = db.collection(collection).document(userImageNameInput.toString())
            removeRef.delete()
        }
    }
}