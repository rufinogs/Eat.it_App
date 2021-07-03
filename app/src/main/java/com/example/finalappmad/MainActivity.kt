package com.example.finalappmad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.finalappmad.ListTypeFood

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun runOrderActivity(view: View) {
        startActivity(Intent(this, ListTypeFood::class.java))
    }
}