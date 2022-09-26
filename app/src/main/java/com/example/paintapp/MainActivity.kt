package com.example.paintapp

import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    companion object {
        var path = Path()
        var paintbrush=Paint()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val redbtn=findViewById<ImageButton>(R.id.redColor)
        val bluebtn=findViewById<ImageButton>(R.id.blueColor)
        val blackbtn=findViewById<ImageButton>(R.id.blackColor)
        val rubber=findViewById<ImageButton>(R.id.whiteColor)

        redbtn.setOnClickListener {
        Toast.makeText(this, "Clicked r",Toast.LENGTH_SHORT).show()
        }
        bluebtn.setOnClickListener {
            Toast.makeText(this, "Clicked blue",Toast.LENGTH_SHORT).show()
        }
        blackbtn.setOnClickListener {
            Toast.makeText(this, "Clicked black",Toast.LENGTH_SHORT).show()
        }
        rubber.setOnClickListener {
            Toast.makeText(this, "Clicked white",Toast.LENGTH_SHORT).show()
        }

    }
}