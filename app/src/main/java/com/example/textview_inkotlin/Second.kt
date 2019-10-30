package com.example.textview_inkotlin

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.second_layout.*

class Second : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_layout)

        var strUser: String = intent.getStringExtra("Username")
        var strPassword: String = intent.getStringExtra("Password")
        userid.setText(strUser)
        password.setText(strPassword)
    }

    fun action1(v:View)
    {
       // val mToast = Toast.makeText(applicationContext,"button 3 clicked", Toast.LENGTH_SHORT)
       // mToast.show()
        intent = Intent(Intent.ACTION_VIEW)
        intent.setData(Uri.parse("https://www.javatpoint.com/"))
        startActivity(intent)
    }

    fun action2(v:View)
    {
        intent = Intent(this@Second,Third::class.java)
        startActivity(intent)

    }
}