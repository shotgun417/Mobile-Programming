package com.example.mp0302
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView1 = findViewById<TextView>(R.id.textView1)

        textView1.text = "Hello World!"
        textView1.setTextColor(Color.parseColor("#03A9F4"))
        textView1.typeface = Typeface.SERIF
        textView1.textSize = 50f
    }
}