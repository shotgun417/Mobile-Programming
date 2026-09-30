package com.example.mp0303

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var tvNum1: TextView
    private lateinit var tvNum2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvNum1 = findViewById(R.id.tvNum1)
        tvNum2 = findViewById(R.id.tvNum2)
    }

    // XML의 android:onClick 속성에 연결되는 메서드
    fun onSumClick(view: View) {
        val num1 = tvNum1.text.toString().toInt()
        val num2 = tvNum2.text.toString().toInt()
        val sum = num1 + num2

        Toast.makeText(this, "합계 : $sum", Toast.LENGTH_SHORT).show()
    }
}