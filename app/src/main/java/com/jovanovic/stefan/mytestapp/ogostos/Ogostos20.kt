package com.jovanovic.stefan.mytestapp.ogostos

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jovanovic.stefan.mytestapp.R
import com.jovanovic.stefan.mytestapp.days_words.*
import kotlinx.android.synthetic.main.activity_ogostos20.*


class Ogostos20 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ogostos20)
        val actionbar = supportActionBar
        actionbar!!.title = "Օգոստոս 20"


        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#00d9ff")))

        button1.setOnClickListener {
            val intent = Intent(this,OgostosDay20Word1::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent = Intent(this,OgostosDay20Word2::class.java)
            startActivity(intent)
        }

        button3.setOnClickListener {
            val intent = Intent(this,OgostosDay20Word3::class.java)
            startActivity(intent)
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}