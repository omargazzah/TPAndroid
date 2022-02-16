package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rclNames = findViewById<RecyclerView>(R.id.recycle)
        // If size of the all items are equal and won't change for a better performance it's better to set setHasFixedSize to truetter to set setHasFixedSize to true

        rclNames.setHasFixedSize(true)
// Creating an instance of our NameAdapter class and setting it to our RecyclerView
        val nameList = getListOfNames()
        val namesAdapter = NameAdapter(nameList)
        rclNames.adapter = namesAdapter
// Setting our RecyclerView's layout manager equal to LinearLayoutManager

        rclNames.layoutManager = LinearLayoutManager(this)
        btnUpdateList.setOnClickListener {
            nameList[nameList.size - 1] = "Hello! I've been updated right now :)"
            namesAdapter.notifyDataSetChanged()
        }
    }

    // This function just creates a list of names for us
    private fun getListOfNames(): MutableList<String> {
        val nameList = mutableListOf<String>()
        nameList.add("ahmed")
        nameList.add("yassine")
        nameList.add("sonia")
        nameList.add("mariem")
        nameList.add("taha")
        nameList.add("oussema")
        nameList.add("fatma")
        nameList.add("haythem")
        nameList.add("ayoub")
        nameList.add("aya")
        nameList.add("houda")
        return nameList
    }



}