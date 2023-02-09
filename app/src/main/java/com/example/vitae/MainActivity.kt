package com.example.vitae

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns.EMAIL_ADDRESS
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.SeekBar
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun reset(view: View)
    {
        val name = findViewById<EditText>(R.id.fullnameTextField)
        val age = findViewById<EditText>(R.id.ageTextField)
        val email = findViewById<EditText>(R.id.emailTextField)
        val maleGenderRadio = findViewById<RadioButton>(R.id.maleGenderRadio)
        val IOSSBar = findViewById<SeekBar>(R.id.iosSeekBar)
        val androidSB = findViewById<SeekBar>(R.id.androidSeekBar)
        val flutterSB = findViewById<SeekBar>(R.id.flutterSeekBar)

        name.setText("")
        age.setText("")
        email.setText("")
        maleGenderRadio.setChecked(true)
        IOSSBar.setProgress(0)
        androidSB.setProgress(0)
        flutterSB.setProgress(0)
    }

    fun next(view: View)
    {
        val name = findViewById<EditText>(R.id.fullnameTextField)
        val age = findViewById<EditText>(R.id.ageTextField)
        val email = findViewById<EditText>(R.id.emailTextField)

        if(TextUtils.isEmpty(name.text) || TextUtils.isEmpty(age.text) || TextUtils.isEmpty(email.text))
        {
            Toast.makeText(this,"Error: Empty fields",Toast.LENGTH_LONG).show()
        }

        else if(!EMAIL_ADDRESS.matcher(email.text).matches())
        {
            Toast.makeText(this,"Invalid e-mail format!",Toast.LENGTH_LONG).show()
        }

        val androidSB = findViewById<SeekBar>(R.id.androidSeekBar);
        val flutterSB = findViewById<SeekBar>(R.id.flutterSeekBar);
        val IOSSBar = findViewById<SeekBar>(R.id.iosSeekBar);
        val map = mapOf<String, SeekBar>("Android" to androidSB , "Flutter" to flutterSB, "IOS" to IOSSBar)
        var fail = true;
        var skill = "";
        var skillScore = 0;

        map.forEach{

            if(it.value.progress>=80 && it.value.progress >skillScore)
            {
                fail = false;
                skill = it.key;
                skillScore = it.value.progress;
            }
            else if(it.value.progress>30)
            {
                fail = false;
            }
        }
        if(fail)
        {
            Toast.makeText(this,"Low Skills",Toast.LENGTH_LONG).show()
        }
        else if(skill != "")
        {
            Toast.makeText(this, "You have good skills on: $skill",Toast.LENGTH_LONG).show()
        }
        else
        {
            Toast.makeText(this, "You have good skills",Toast.LENGTH_LONG).show()
        }

    }
}