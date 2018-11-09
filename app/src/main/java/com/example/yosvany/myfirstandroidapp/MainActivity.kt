package com.example.yosvany.myfirstandroidapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val extras: Bundle? = intent.extras
        if (extras != null) {
            val text: TextView = findViewById(R.id.textView)
            text.text = "hello " + extras.get("pronoun") as String
        }
    }

    fun toastMe(view: View) {
        // val myToast = Toast.makeText(this, message, duration);
        val extras: Bundle? = intent.extras
        val pronoun: String
        val myToast: Toast
        if (extras != null) {
            pronoun = extras.get("pronoun") as String
            myToast = Toast.makeText(this, "Hello " + pronoun, Toast.LENGTH_SHORT)
        } else {
            myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT)
        }
        myToast.show()
    }

    fun misGendered(view: View) {
        val genderIntent = Intent(this, Main2Activity::class.java)
        startActivity(genderIntent)
    }
}
