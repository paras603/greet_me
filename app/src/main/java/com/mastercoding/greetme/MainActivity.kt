package com.mastercoding.greetme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //declaring views
        var edt_txt : EditText = findViewById(R.id.editText)
        var btn : Button = findViewById(R.id.button)

        //getting value from text box


        //button function
        btn.setOnClickListener(){
            var name : String = edt_txt.text.toString()
            //explict intents
            var i : Intent  = Intent(this, HelloActivity::class.java)
                //passing data between activities"

                i.putExtra("name", name)
                startActivity(i)


        }


    }
}