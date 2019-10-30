package com.example.textview_inkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            val intent = Intent(this@MainActivity,Second::class.java)
            var username1 = textview.text.toString()
            var password1 = password.text.toString()
            intent.putExtra("Username", username1)
            intent.putExtra("Password", password1)
            startActivity(intent)
            Toast.makeText(applicationContext,"Toast",Toast.LENGTH_SHORT).show()

          }


    }



}


