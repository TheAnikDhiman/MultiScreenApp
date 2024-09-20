package com.example.multiscreenapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.multiscreenapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    companion object{
        const val KEY="com.example.multiscreenapp.MainActivity.KEY"
    }
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(this.binding.root)
        binding.btnOrder.setOnClickListener {
            val orderPlaced = binding.et1.text.toString() + " " + binding.et2.text.toString() + " " + binding.et3.text.toString() + " " + binding.et4.text.toString()
            intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(KEY, orderPlaced)
            startActivity(intent)
        }
    }
}