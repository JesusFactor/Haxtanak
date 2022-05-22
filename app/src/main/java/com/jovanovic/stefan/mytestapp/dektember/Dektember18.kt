package com.jovanovic.stefan.mytestapp.dektember

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jovanovic.stefan.mytestapp.R
import kotlinx.android.synthetic.main.activity_dektember18.*

class Dektember18 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dektember18)
        val actionbar = supportActionBar
        actionbar!!.title = "Դեկտեմեր 18"


        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#00d9ff")))

        button1.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/ru/bible/2329/PRO.19.ՆՎԱԱ")))
        }

        button2.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/ru/bible/2329/ACT.2.ՆՎԱԱ")))
        }

        button3.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/ru/bible/2329/JOB.15.ՆՎԱԱ")))
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true



    }

}