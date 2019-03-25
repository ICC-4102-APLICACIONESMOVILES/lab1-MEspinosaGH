package com.example.lab01ap

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.example.lab01am.LoginActivity
import com.example.lab01am.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myIntent = Intent(this@MainActivity, LoginActivity::class.java)
        myIntent.putExtra("key", value) //Optional parameters
        this@MainActivity.startActivity(myIntent)
    }


    companion object {
        val value = "com.example.myfirstapp.MESSAGE"
    }
}
