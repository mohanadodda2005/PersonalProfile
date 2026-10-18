package com.mohana.personalprofile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnAbout).setOnClickListener {
            startActivity(Intent(this, AboutActivity::class.java))
        }

        findViewById<Button>(R.id.btnSkills).setOnClickListener {
            startActivity(Intent(this, SkillsActivity::class.java))
        }

        findViewById<Button>(R.id.btnContact).setOnClickListener {
            startActivity(Intent(this, ContactActivity::class.java))
        }
    }
}
