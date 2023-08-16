package com.mastercoding.greetme

import android.content.Intent
import android.content.SharedPreferences
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

            SaveNameInSharedPref(name)

            //explict intents
            var i : Intent  = Intent(this, HelloActivity::class.java)
                //passing data between activities"
//                i.putExtra("name", name)
                startActivity(i)
        }


    }

    private fun SaveNameInSharedPref(enteredText: String) {
        //opening shared preferences
        val sharedPreferences : SharedPreferences = getSharedPreferences("UserName", MODE_PRIVATE)

        //writing data to shared preferences
        val editor : SharedPreferences.Editor = sharedPreferences.edit()
        editor.putString("name",enteredText)
        editor.commit()
    }
}