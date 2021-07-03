package com.example.finalappmad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LogIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.usermail_layout)
    }

    fun runLog(view: View) {
        startActivity(Intent(this, FinalView::class.java))
    }
}
