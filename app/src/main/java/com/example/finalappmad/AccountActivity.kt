package com.example.finalappmad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.account_layout.*
import com.example.finalappmad.FoodInfo

class AccountActivity : AppCompatActivity() {

    var account = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.account_layout)

        account = intent.getIntExtra("account",0)

        pay.setText(account.toString())
    }

    fun runPay(view: View) {
        startActivity(Intent(this, LogIn::class.java))
    }

    fun runContinue(view: View) {
        intent = Intent(this, ListTypeFood::class.java)
        intent.putExtra("account", account)
        startActivity(intent)
    }
}