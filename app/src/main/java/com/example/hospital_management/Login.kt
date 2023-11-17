package com.example.hospital_management

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class Login : AppCompatActivity() {

    private lateinit var email:EditText
    private lateinit var password:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val login_btn = findViewById<AppCompatButton>(R.id.login_btn)
        val forget_password = findViewById<TextView>(R.id.forget_password_txt)
        val create_account = findViewById<TextView>(R.id.create_account)

        email = findViewById<EditText>(R.id.mail_txt)
        password = findViewById<EditText>(R.id.password_txt)

        login_btn.setOnClickListener {
            login()
        }

        create_account.setOnClickListener {
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
        }
        forget_password.setOnClickListener {

        }}

        private fun login(){
            val email = email.text.toString().trim{ it <= ' '}
            val password = password.text.toString().trim{ it <= ' '}

            when {
                TextUtils.isEmpty(email) -> {
                    Toast.makeText(this@Login, "please enter your email id ", Toast.LENGTH_SHORT)


                }

                TextUtils.isEmpty(password) -> {
                    Toast.makeText(this@Login, "Please enter your Password", Toast.LENGTH_SHORT)
                        .show()
                }

                else -> {
                    val progressDialog = ProgressDialog(this@Login)
                    progressDialog.setMessage("Signing In")
                    progressDialog.setCanceledOnTouchOutside(false)
                    progressDialog.show()

                    val intent = Intent(this, Dashboard::class.java)
                    startActivity(intent)

                }
            }
        }
}

