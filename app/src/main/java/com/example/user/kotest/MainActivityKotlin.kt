package com.example.user.kotest

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main_kotlin.*
import org.jetbrains.anko.db.insert

class MainActivityKotlin : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_kotlin)
    }

    fun btnShowValue(v: View)
        {
        textViewResult.text=editTextValue.getText().toString()

            database.use {
                insert("user", "user_name" to "Vasya")

            }

        }

}


