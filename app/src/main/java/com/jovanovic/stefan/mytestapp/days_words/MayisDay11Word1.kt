package com.jovanovic.stefan.mytestapp.days_words
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jovanovic.stefan.mytestapp.R

class MayisDay11Word1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mayis_day11_word1)
        val actionbar = supportActionBar
        actionbar!!.title = "ՍԱՂՄՈՍ 130 "

        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setBackgroundDrawable(ColorDrawable(Color.parseColor("#00d9ff")))

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
