package com.example.multiscreenapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        val orderOfCustomer = intent.getStringExtra(MainActivity.KEY)
        val TVOrder = findViewById<TextView>(R.id.TVOrder)
        TVOrder.text="Order Placed \n"+ orderOfCustomer.toString() +"\n"
    }
}