package com.example.vernaljobs

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class Registercompany : AppCompatActivity() {

//    lateinit var textInputPassword: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_company)


        }
    fun registerBack(view: View) {

        // Create an Intent to start the second activity
        val registerIntent = Intent(this, MainActivity::class.java)

        // Start the new activity.
        startActivity(registerIntent)

    }

}


