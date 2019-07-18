package com.example.vernaljobs

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_register_company.*
import java.util.regex.Matcher
import java.util.regex.Pattern
import android.util.Patterns
import androidx.core.content.ContextCompat.startActivity


class Registercompany : AppCompatActivity() {

    lateinit var textInputPassword: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_company)

        fun registerBack(view: View) {

            // Create an Intent to start the second activity
            val registerIntent = Intent(this, MainActivity::class.java)

            // Start the new activity.
            startActivity(registerIntent)
        }


    }

}


