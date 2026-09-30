package com.example.mp0304

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName = findViewById<EditText>(R.id.etName)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etBirth = findViewById<EditText>(R.id.etBirth)
        val etPhone = findViewById<EditText>(R.id.etPhone)
        val btnResult = findViewById<Button>(R.id.btnResult)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnResult.setOnClickListener {
            val resultText = """
                성명 - ${etName.text}
                비밀번호 - ${etPassword.text}
                이메일 - ${etEmail.text}
                생년월일 - ${etBirth.text}
                연락처 - ${etPhone.text}
            """.trimIndent()

            tvResult.text = resultText
        }
    }
}