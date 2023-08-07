package com.mastercoding.greetme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class HelloActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)



        var bundle : Bundle? = intent.extras

        val name = bundle?.getString("name")

        val resultTxt : TextView = findViewById(R.id.textView)
        resultTxt.setText("Hello \n" + name)

        val img : ImageView = findViewById(R.id.image)
        img.setImageResource(R.drawable.hello)

    }
}