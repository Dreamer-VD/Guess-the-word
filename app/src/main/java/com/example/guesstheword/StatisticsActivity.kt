package com.example.guesstheword

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class StatisticsActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_statistics)
            val textViewText:TextView=findViewById(R.id.textViewResalt)
        val intent = intent
        val arguments = intent.extras
        if(arguments!=null)
        {
            val number = intent.getStringExtra("Number").toString()
            textViewText.setText("Правильные ответ\n$number Из 10")
        }
    }

    fun ClickGoBack(view: View) {
        val intent: Intent = Intent(this,MainActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(intent)
    }
}