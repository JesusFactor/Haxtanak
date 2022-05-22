package com.jovanovic.stefan.mytestapp.petrvar

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jovanovic.stefan.mytestapp.R
import kotlinx.android.synthetic.main.activity_petrvar14.*

class Petrvar14 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_petrvar14)
        val actionbar = supportActionBar
        actionbar!!.title = "Փետրվար 14"


        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#00d9ff")))

        button1.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/ru/bible/2329/PSA.45.ՆՎԱԱ")))
        }

        button2.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/ru/bible/2329/ACT.17.ՆՎԱԱ")))
        }

        button3.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/ru/bible/2329/EXO.39.ՆՎԱԱ")))
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true



    }

}
