package com.i14yokoro.myedittexttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity(), InputListener{
    lateinit var myEditText: MyEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myEditText = findViewById(R.id.my_edit)
        myEditText.setListener(this)
    }

    override fun onKey(text: Char) {
        Log.e("MainActivity", "text=$text")
        // TODO something
    }
}
