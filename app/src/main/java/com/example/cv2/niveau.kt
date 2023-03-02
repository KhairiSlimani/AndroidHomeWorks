package com.example.cv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment


class niveau : AppCompatActivity() {

    private lateinit var btnSkills: Button
    private lateinit var btnHobbies: Button
    private lateinit var btnLanguages: Button
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_niveauff)

        var bundle :Bundle ?=intent.extras
        var fullname = bundle!!.getString("fullname")
        var email = bundle!!.getString("email")
        var resID:Int = bundle!!.getInt("resID")

        val tname : TextView = findViewById(R.id.tname)
        tname.setText("My Name : "+fullname)

        val temail : TextView = findViewById(R.id.temail)
        temail.setText("My Email : "+email)

        val imageView:ImageView = findViewById(R.id.imageView3)
        imageView.setImageResource(resID)

        btnSkills = findViewById(R.id.btnSkills)
        btnHobbies = findViewById(R.id.btnHobbies)
        btnLanguages = findViewById(R.id.btnLanguages)

        btnSkills.setOnClickListener{
            changeFragment(skills_frag(),"Skills")
        }
        btnHobbies.setOnClickListener{
            changeFragment(hobbies_frag(), "Hobbies")
        }
        btnLanguages.setOnClickListener{
            changeFragment(languages_frag(), "Languages")
        }

        supportFragmentManager.beginTransaction().add(R.id.fragment_container, skills_frag()).commit()

    }



    private fun changeFragment(fragment: Fragment, name: String) {
        if (name.isEmpty())
            supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).commit()
        else
            supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).addToBackStack(name).commit()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
        }
        return super.onOptionsItemSelected(item)
    }
}