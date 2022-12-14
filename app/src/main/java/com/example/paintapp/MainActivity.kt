package com.example.paintapp

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.example.paintapp.PaintView.Companion.colorList
import com.example.paintapp.PaintView.Companion.currentBrush
import com.example.paintapp.PaintView.Companion.pathList

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
            paintbrush.color=Color.RED
            currentColor(paintbrush.color)
        }
        bluebtn.setOnClickListener {
            paintbrush.color=Color.BLUE
            currentColor(paintbrush.color)
        }
        blackbtn.setOnClickListener {
            paintbrush.color=Color.BLACK
            currentColor(paintbrush.color)
        }
        rubber.setOnClickListener {
            pathList.clear()
            colorList.clear()
            path.reset()
        }

        }
    private fun currentColor(color:Int)
    {
        currentBrush=color
        path= Path()
    }
}