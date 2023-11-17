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

class Signup : AppCompatActivity() {

    private lateinit var fullName: EditText
    private lateinit var email: EditText
    private lateinit var phone: EditText
    private lateinit var password: EditText
    private lateinit var haveAccount_text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        haveAccount_text = findViewById<TextView>(R.id.haveAccount_text)
        val signUp_button = findViewById<Button>(R.id.signUp_button)
        fullName = findViewById<EditText>(R.id.fullName_edit_text)
        email = findViewById<EditText>(R.id.email_edit_text)
        phone = findViewById<EditText>(R.id.phone_number_text)
        password = findViewById(R.id.adminpassword1_Create_AC)




        haveAccount_text.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
        }

        signUp_button.setOnClickListener {
            signUp()
        }
    }

    private fun signUp() {

        val fullName = fullName.text.toString().trim { it <= ' ' }
        val email = email.text.toString().trim { it <= ' ' }
        val phone = phone.text.toString().trim { it <= ' ' }
        val password = password.text.toString().trim { it <= ' ' }

        when {
            TextUtils.isEmpty(fullName) -> {
                Toast.makeText(this@Signup, "Please enter your Full Name", Toast.LENGTH_SHORT)
                    .show()
            }

            TextUtils.isEmpty(email) -> {
                Toast.makeText(this@Signup, "Please enter your UID", Toast.LENGTH_SHORT).show()
            }

            TextUtils.isEmpty(phone) -> {
                Toast.makeText(this@Signup, "Please enter your Phone Number", Toast.LENGTH_SHORT)
                    .show()
            }

            TextUtils.isEmpty(password) -> {
                Toast.makeText(this@Signup, "Please enter your password", Toast.LENGTH_SHORT)
                    .show()
            }

            else -> {
                val progressDialog = ProgressDialog(this@Signup)
                progressDialog.setTitle("Registration in progress")
                progressDialog.setTitle("Please wait")
                progressDialog.setCanceledOnTouchOutside(false)
                progressDialog.show()
            }
        }
    }}