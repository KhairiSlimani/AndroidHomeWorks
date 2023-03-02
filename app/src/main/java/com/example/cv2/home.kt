package com.example.cv2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.RadioButton

class home : AppCompatActivity() {

    private lateinit var imageview: ImageView
    companion object{
        val IMAGE_REQUEST_CODE = 100
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        imageview = findViewById(R.id.imageView2)
        imageview.setOnClickListener{

            pickImageGallery()
        }

        val btn : Button = findViewById(R.id.NEXT)
        btn.setOnClickListener {
            Verif()
        }
    }

    fun Verif() : Boolean
    {
        val fullname : EditText = findViewById(R.id.fntxt)
        val email : EditText = findViewById(R.id.temail)
        val age : EditText = findViewById(R.id.tage)
        val homme : RadioButton = findViewById(R.id.radhomme)
        val femme : RadioButton = findViewById(R.id.radfemme)
        var fullname_txt = fullname.getText().toString();
        var age_text = age.getText().toString();
        var email_text = email.getText().toString().trim();
        val email_verif = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
        if(fullname_txt.isEmpty())
        {
            fullname.error = getString(R.string.empty)
            return false
        }
        if (email_text.matches(email_verif.toRegex())) {
        } else {
            email.error = getString(R.string.email)
            return false
        }
        if(age_text.isEmpty())
        {
            age.error = getString(R.string.empty)
            return false
        }
        var sendFullname=fullname.getText().toString()
        var sendEmail =email_text
        var sendAge =   age_text
        var sendGender = ""
        if(homme.isChecked)
        {
            sendGender="homme"
        }
        else
        {
            sendGender="femme"
        }
        val intent = Intent(this,skills::class.java).apply {
            putExtra("fullname", sendFullname)
            putExtra("email", sendEmail)
            putExtra("age", sendAge)
            putExtra("gender",sendGender)


        }
        startActivity(intent)

        val intent2 = Intent(this,niveau::class.java).apply {
            putExtra("fullname", sendFullname)
            putExtra("email", sendEmail)

            putExtra("resID",R.id.imageView)

        }
        startActivity(intent2)
        return true
    }
    private fun pickImageGallery() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, IMAGE_REQUEST_CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == IMAGE_REQUEST_CODE && resultCode == RESULT_OK )
            imageview.setImageURI(data?.data)
    }





}
