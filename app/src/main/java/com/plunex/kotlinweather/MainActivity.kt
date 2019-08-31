package com.plunex.kotlinweather

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        message.text = "Hello world!"

        toast("Hello")
    }

    fun add(x: Int, y: Int): Int {
        return x + y
    }

    fun multiply(x: Int, y: Int): Int = x * y

    fun toast(message: String,
              tag: String = MainActivity::class.java.simpleName,
              length: Int = Toast.LENGTH_SHORT) {
         Toast . makeText (this, "[$tag] $message", length).show()
    }




}
