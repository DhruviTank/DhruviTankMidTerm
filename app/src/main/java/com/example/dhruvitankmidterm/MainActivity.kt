package com.example.dhruvitankmidterm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore
//import androidx.core.app.ComponentActivity
//import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import androidx.annotation.NonNull
import com.google.android.gms.tasks.OnFailureListener
import com.google.firebase.firestore.DocumentReference
import com.google.android.gms.tasks.OnSuccessListener
import javax.swing.UIManager.put
//import androidx.core.app.ComponentActivity
//import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T







class MainActivity : AppCompatActivity() {


    var db = FirebaseFirestore.getInstance()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Create a new user with a first and last name
        val data = HashMap<Any, String >()
        data.put("first", "Ada")
        data.put("last", "Lovelace")
        data.put("born", 1815)

// Add a new document with a generated ID
        db.collection("users")
            .add(data)
            .addOnSuccessListener { documentReference ->
                Log.d(
                    FragmentActivity.TAG,
                    "DocumentSnapshot added with ID: " + documentReference.id
                )
            }
            .addOnFailureListener { e -> Log.w(FragmentActivity.TAG, "Error adding ", e) }

    }



}



