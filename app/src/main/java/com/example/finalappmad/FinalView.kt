package com.example.finalappmad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class FinalView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.final_view_layout)
    }

    fun runStart(view: View) {
        startActivity(Intent(this, MainActivity::class.java))
    }
}