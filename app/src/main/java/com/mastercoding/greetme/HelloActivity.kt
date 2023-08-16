package com.mastercoding.greetme

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class HelloActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)



//        var bundle : Bundle? = intent.extras
//
//        val name = bundle?.getString("name")

        val resultTxt : TextView = findViewById(R.id.textView)

        val userName = displaySavedName()

        resultTxt.setText("Hello \n" + userName)

        val img : ImageView = findViewById(R.id.image)
        img.setImageResource(R.drawable.hello)

    }

    //reading data from shard preference
    fun displaySavedName(): String{
        val sharedPreferences: SharedPreferences = getSharedPreferences("UserName", MODE_PRIVATE)

        val s1: String? = sharedPreferences.getString("name","")

        return s1.toString()
    }
}