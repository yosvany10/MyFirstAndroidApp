package com.example.yosvany.myfirstandroidapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TextInputEditText
import android.view.View

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun confirm(view: View) {
        val mainIntent = Intent(this, MainActivity::class.java)
        val pronounText: TextInputEditText = findViewById(R.id.pronounText)
        mainIntent.putExtra("pronoun", pronounText.text.toString())
        startActivity(mainIntent)
    }
}
