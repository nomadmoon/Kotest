package com.example.user.kotest

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main_kotlin.*
import org.jetbrains.anko.db.insert
import java.io.Console
import java.io.File

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

    fun btnShowDebug(v: View)
    {
        val tmpImg = File(getExternalFilesDir(null).absolutePath, "tmpImg.jpg")
        val intentfoto = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        intentfoto.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(tmpImg))
        startActivityForResult(intentfoto, 300)
        Log.d("TAG", "zzzzzzzzzzzzz")
    }

}


