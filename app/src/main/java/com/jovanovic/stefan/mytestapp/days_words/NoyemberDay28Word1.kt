package com.jovanovic.stefan.mytestapp.days_words
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jovanovic.stefan.mytestapp.R

class NoyemberDay28Word1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_noyember_day28_word1)
        val actionbar = supportActionBar
        actionbar!!.title = "ՍԱՂՄՈՍ 149 "

        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setBackgroundDrawable(ColorDrawable(Color.parseColor("#00d9ff")))

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
