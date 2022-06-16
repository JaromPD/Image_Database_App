
# Overview 

Image Database is a simple app that allows a user to add, edit, remove, and view images that are saved to a Google Firebase Firestore database. The images are saved by their name and include the data taken and the image's URLs in order to access them later.

I wrote this software to help myself become more familiar with Kotlin app development, and to learn how to create cloud databases. I had made SQL databases before that were accessed with a Python program so making a cloud database that is accessed by a Kotlin app was a unique challenge.

[Software Demo Video](http://youtube.link.goes.here)

# Cloud Database

This is a simple Google Firebase Firestore cloud database used to save Images with the date they were taken and a link to them online.

Datastructure:

    Images──► ImageName─┬─► Date
                        │
                        └─► URL
# Development Environment

This program was written inside Android Studio Chipmunk 2021.2.1

This program was written in Kotlin and used the [Picasso Library](https://square.github.io/picasso/) to display images and [Google Firebase Firestore](https://firebase.google.com/docs/firestore) to host the database.
# Useful Websites
* [Firestore Documentation](https://firebase.google.com/docs/firestore)
* [Picasso Documentation](https://square.github.io/picasso/)

# Future Work
* Security features for database authentication.
* Robustness (Errors for invalid inputs, or requests) 
* Ability to view all Image names currently saved.
* Better GUI to make using the app more intuitive.