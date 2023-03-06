package com.jovanovic.stefan.mytestapp.onboarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.VISIBLE
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.view.animation.LinearInterpolator
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2
import com.jovanovic.stefan.mytestapp.R
import kotlinx.android.synthetic.main.fragment_first_screen.*
import kotlinx.android.synthetic.main.fragment_first_screen.view.*
import kotlinx.android.synthetic.main.fragment_second_screen.*
import kotlinx.android.synthetic.main.fragment_second_screen.view.*
import kotlin.random.Random

class SecondScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_second_screen, container, false)
        val viewPager =  activity?.findViewById<ViewPager2>(R.id.viewPager)
        val ttb = AnimationUtils.loadAnimation(activity,R.anim.ttb)
        val btb = AnimationUtils.loadAnimation(activity,R.anim.btn1)
        val stb = AnimationUtils.loadAnimation(activity,R.anim.stb)
        val title2 = view.findViewById<TextView>(R.id.title2) as TextView
        val back = view.findViewById<TextView>(R.id.back) as TextView
        val next = view.findViewById<TextView>(R.id.next) as TextView
        val btb1 = AnimationUtils.loadAnimation(activity,R.anim.btn2)
        val blind = AnimationUtils.loadAnimation(activity,R.anim.blind)
        val fade = AnimationUtils.loadAnimation(activity,R.anim.fade)
        val word = arrayOf("1", "2", "3", "4")
        view.imageView2.startAnimation(ttb)

        title2.startAnimation(stb)
        view.description2.startAnimation(stb)
        //back.startAnimation(btb1)
        back.visibility = View.INVISIBLE
        next.startAnimation(btb)


        back.setOnClickListener {
            back.animate().apply {
                duration = 1000
                rotationYBy(360f)
            }.withEndAction{
                viewPager?.currentItem = 0
            }
        }

        next.setOnClickListener {
            next.animate().apply {
                duration = 1000
                rotationYBy(360f)
            }.withEndAction{
                viewPager?.currentItem = 2

            }
        }

        val descs = listOf(
            "Եկեղեցում մենք արտահայտում ենք մեր սերն Աստծո, ինչպես նաև մերձավորի նկատմամբ:",
            "Աստծո սերը հիմքն է մեր ողջ ծառայության համար, երբ մենք օգնում և ծառայում ենք միմյանց, երբ մենք տարածում ենք Ավետարանը և ծառայում ենք հասարակությանը մեր շուրջը:\n",
            "Եկեղեցին միասնության վայր է, որում ամեն մեկը հավասարապես արժեքավոր է Աստծո համար:",
            "Եկեղեցին ընտանիք է, որը կազմված է ամենատարբեր ազգություններից և էթնիկ խմբերից:",
            "Եկեղեցին ընտանիք է, որը բաղկացած է տարբեր տարիքի և սերունդների մարդկանցից:"
        )
        var clickCount = 0
        next.setOnClickListener {
            back.visibility = View.VISIBLE
            back.startAnimation(stb)
            if (clickCount >= 3){
                viewPager?.currentItem = 2
            } else {
                next.startAnimation(stb)
                back.startAnimation(stb)
                clickCount = clickCount + 1
                view.description2.startAnimation(ttb)
                description2.text=descs[clickCount]
                if (clickCount >= 3)
                    next.text = "ԱՌԱՋ"
            }
        }
        return view
    }

}
