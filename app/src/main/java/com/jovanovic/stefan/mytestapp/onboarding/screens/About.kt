package com.jovanovic.stefan.mytestapp.onboarding.screens

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.jovanovic.stefan.mytestapp.R
import kotlinx.android.synthetic.main.activity_about.*
import kotlinx.android.synthetic.main.activity_about.description2
import kotlinx.android.synthetic.main.activity_petrvar10.*
import kotlinx.android.synthetic.main.fragment_second_screen.*
import kotlinx.android.synthetic.main.fragment_second_screen.view.*

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        val actionbar = supportActionBar
        actionbar!!.title = "Մեր Տեսիլքը"

        val ttb = AnimationUtils.loadAnimation(this,R.anim.ttb)
        val stb = AnimationUtils.loadAnimation(this,R.anim.stb)


        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#00d9ff")))

        val descs = listOf(
            "Եկեղեցում մենք արտահայտում ենք մեր սերն Աստծո, ինչպես նաև մերձավորի նկատմամբ:",
            "Աստծո սերը հիմքն է մեր ողջ ծառայության համար, երբ մենք օգնում և ծառայում ենք միմյանց, երբ մենք տարածում ենք Ավետարանը և ծառայում ենք հասարակությանը մեր շուրջը:\n",
            "Եկեղեցին միասնության վայր է, որում ամեն մեկը հավասարապես արժեքավոր է Աստծո համար:",
            "Եկեղեցին ընտանիք է, որը կազմված է ամենատարբեր ազգություններից և էթնիկ խմբերից:",
            "Եկեղեցին ընտանիք է, որը բաղկացած է տարբեր տարիքի և սերունդների մարդկանցից:"
        )
        var clickCount = 0
        l.setOnClickListener {
            if (clickCount >= 3){
                clickCount = 0
            } else {
                clickCount = clickCount + 1
                l.startAnimation(ttb)
                description2.startAnimation(ttb)
                description2.text=descs[clickCount]
            }
        }

        youtube.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UC6cVWwOLYlz1QfcOVUcVmFQ")))
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}