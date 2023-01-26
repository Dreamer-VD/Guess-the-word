package com.example.guesstheword

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
    }

    fun ClickGoBack(view: View) {
        val intent: Intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}