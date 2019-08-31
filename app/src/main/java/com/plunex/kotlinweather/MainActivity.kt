package com.plunex.kotlinweather

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var forcastList = findViewById<RecyclerView>(R.id.forecast_list)
        forcastList.layoutManager = LinearLayoutManager(this)
        forcastList.adapter = ForecastListAdapter(items)

//        message.text = "Hello world!"
//
//        toast("Hello")
    }

//    fun add(x: Int, y: Int): Int {
//        return x + y
//    }
//
//    fun multiply(x: Int, y: Int): Int = x * y
//
//    fun toast(message: String,
//              tag: String = MainActivity::class.java.simpleName,
//              length: Int = Toast.LENGTH_SHORT) {
//         Toast . makeText (this, "[$tag] $message", length).show()
//    }


    private val items = listOf(
        "Mon 6/23 - Sunny - 31/17",
        "Tue 6/24 - Foggy - 21/8",
        "Wed 6/25 - Cloudy - 22/17",
        "Thurs 6/26 - Rainy - 18/11",
        "Fri 6/27 - Foggy - 21/10",
        "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
        "Sun 6/29 - Sunny - 20/7"
    )


}
