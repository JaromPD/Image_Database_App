package com.example.image_database

import android.icu.number.NumberFormatter.with
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.squareup.picasso.Picasso

class ViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)

        val db = Firebase.firestore
        val collection = "Images"

        val userNameInput = findViewById<EditText>(R.id.name_textbox).text
        val viewButton = findViewById<Button>(R.id.view_button)
        val imageView = findViewById<ImageView>(R.id.imageView)

        viewButton.setOnClickListener {
            val searchRef = db.collection(collection).document(userNameInput.toString())

            searchRef.get()
                .addOnSuccessListener { search ->
                    val searchData: MutableMap<String, Any>? = search.data
                    if (searchData != null) {
                        val url = searchData.get("URL")
                        Picasso.get().load(url.toString()).into(imageView)
                    }
                }
            //Picasso.get().load(userUrlString).into(imageView);
        }

    }
}