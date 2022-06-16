package com.example.image_database

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class EditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)

        val collection = "Images"

        val db = Firebase.firestore

        val userImageNameInput = findViewById<EditText>(R.id.name_textbox)
        val userDataInput = findViewById<EditText>(R.id.data_textbox)

        val nameButton = findViewById<Button>(R.id.name_button)
        val dateButton = findViewById<Button>(R.id.date_button)
        val urlButton = findViewById<Button>(R.id.url_button)

        val userImageName = userImageNameInput.text
        val userData = userDataInput.text

        nameButton.setOnClickListener {

            val currDataRef = db.collection(collection).document(userImageName.toString())
            currDataRef.get()
                        .addOnSuccessListener { currData ->
                            if (currData != null){
                                val usableCurrData = currData.data
                                if (usableCurrData != null) {
                                    db.collection(collection).document(userData.toString()).set(usableCurrData)
                                    db.collection(collection).document(userImageName.toString()).delete()
                                }
                            }

                        }
        }
        dateButton.setOnClickListener {
            val imageRef = db.collection(collection).document(userImageName.toString())
            imageRef.update("Date", userData.toString())

        }
        urlButton.setOnClickListener {
            val imageRef = db.collection(collection).document(userImageName.toString())
            imageRef.update("URL", userData.toString())
        }
    }
}