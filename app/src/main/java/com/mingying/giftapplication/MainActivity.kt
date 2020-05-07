package com.mingying.giftapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LPAnimationManager.init(this)
        LPAnimationManager.addGiftContainer(ll_gift_container)
        gift_1.setOnClickListener {
            LPAnimationManager.addAnimalMessage(AnimMessage("yu", "", 10, "飞机"))
        }
        gift_2.setOnClickListener {
            LPAnimationManager.addAnimalMessage(AnimMessage("hellokitty", "", 10, "飞机"))
        }
        gift_3.setOnClickListener {
            LPAnimationManager.addAnimalMessage(AnimMessage("我是小学生", "", 20, "红包"))
        }

    }

}
