package com.example.guesstheword

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickOnGame(view: View) {
        val intent:Intent=Intent(this,GameActivity::class.java)
        startActivity(intent)
    }
    fun clickOnInfo(view: View) {
        val intent: Intent = Intent(this,StatisticsActivity::class.java)
        startActivity(intent)
    }
    fun clickOnExit(view: View) {
        super.onBackPressed()
    }
}