package com.jovanovic.stefan.mytestapp.april

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jovanovic.stefan.mytestapp.R
import com.jovanovic.stefan.mytestapp.days_words.*
import kotlinx.android.synthetic.main.activity_april19.*


class April19 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_april19)
        val actionbar = supportActionBar
        actionbar!!.title = "Ապրիլ 19"


        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#00d9ff")))

        button1.setOnClickListener {
            val intent = Intent(this,AprilDay19Word1::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent = Intent(this,AprilDay19Word2::class.java)
            startActivity(intent)
        }

        button3.setOnClickListener {
            val intent = Intent(this,AprilDay19Word3::class.java)
            startActivity(intent)
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}