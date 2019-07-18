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



class Registercompany : AppCompatActivity() {

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

//    fun isValidPassword(view: View) : Boolean {
//        password?.let {
//            val passwordPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{4,}$"
//            val passwordMatcher = Regex(passwordPattern)
//
//            return passwordMatcher.find(passwordPattern) != null
//        } ?: return false
//    }




}




