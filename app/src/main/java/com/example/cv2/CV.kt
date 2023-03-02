package com.example.cv2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class CV : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cvactivity)

        var bundle :Bundle ?=intent.extras
        var fullname = bundle!!.getString("fullname")
        var email = bundle!!.getString("email")
        var age = bundle!!.getString("age")
        var gender = bundle!!.getString("gender")
        var android = bundle!!.getString("android")
        var ios = bundle!!.getString("ios")
        var flutter = bundle!!.getString("flutter")
        var Language = bundle!!.getString("Language")
        var hobbies = bundle!!.getString("hobbies")
        var img = bundle!!.getString("images")

        val text_flutter : TextView = findViewById(R.id.textflutter)
        text_flutter.setText("FLUTTER : "+flutter)
        val text_lan : TextView = findViewById(R.id.lang)
        text_lan.setText("languages : "+Language)
        val text_hobbies : TextView = findViewById(R.id.hobb)
        text_hobbies.setText("hobbies : "+hobbies)
        val text_name : TextView = findViewById(R.id.tXTname)
        text_name.setText("FULLName : "+fullname)
        val text_ios : TextView = findViewById(R.id.textios)
        text_ios.setText("IOS : "+ios)
        val text_email : TextView = findViewById(R.id.txtemail)
        text_email.setText("Email : "+email)
        val text_age : TextView = findViewById(R.id.textage)
        text_age.setText("Age : "+age)
        val text_gender : TextView = findViewById(R.id.txtgender)
        text_gender.setText("Gender : "+gender)
        val text_android : TextView = findViewById(R.id.textandroid)
        text_android.setText("Android : "+android)
        val btn : Button = findViewById(R.id.button)

        btn.setOnClickListener {
            val intent = Intent(this,niveau::class.java).apply {
                putExtra("fullname", fullname)
                putExtra("email", email)
            }
            startActivity(intent)

        }
    }


}