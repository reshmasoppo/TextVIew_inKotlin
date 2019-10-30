package com.example.textview_inkotlin

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.third_layout.*

class Third : AppCompatActivity()
{

    val language= arrayOf<String>("a","b","c")
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third_layout)
            val arrayAdapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,language)
            list.adapter = arrayAdapter

            list.onItemClickListener = AdapterView.OnItemClickListener{adapterView, view, position, id ->
                val selectedItem = adapterView.getItemAtPosition(position) as String
                val itemIdAtPos = adapterView.getItemIdAtPosition(position)
                Toast.makeText(applicationContext,"click item $selectedItem its position $itemIdAtPos",Toast.LENGTH_SHORT).show()

            }






        }

}