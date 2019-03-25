package com.example.lab01am

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : AppCompatActivity() {

    private fun validEmail(email: String): Boolean {
        val pattern = Patterns.EMAIL_ADDRESS
        return pattern.matcher(email).matches()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val mail = editTextMail.text.toString()
        val password = editTextPassword.text.toString()

        if (!validEmail(mail) || mail.isEmpty() || password.isEmpty()) {
            Toast.makeText(this,"Enter valid e-mail and password",Toast.LENGTH_LONG).show();
        }

        val btn = findViewById(R.id.button) as Button
        btn.setOnClickListener {}
    }


}
