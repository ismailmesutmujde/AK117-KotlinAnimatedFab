package com.ismailmesutmujde.kotlinanimatedfab

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.ismailmesutmujde.kotlinanimatedfab.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var  bindingMain : ActivityMainBinding

    var fabState = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        val view = bindingMain.root
        setContentView(view)

        bindingMain.fabFirst.scaleX = 0.0f
        bindingMain.fabFirst.scaleY = 0.0f
        bindingMain.fabSecond.scaleX = 0.0f
        bindingMain.fabSecond.scaleY = 0.0f
        bindingMain.fabThird.scaleX = 0.0f
        bindingMain.fabThird.scaleY = 0.0f

        bindingMain.fabMain.setOnClickListener {
            if (fabState) {
                val rotateFabMain = ObjectAnimator.ofFloat(bindingMain.fabMain,"rotation", 45.0f, 0.0f)
                val scaleXFabFirst = ObjectAnimator.ofFloat(bindingMain.fabFirst,"scaleX", 1.0f, 0.0f)
                val scaleYFabFirst = ObjectAnimator.ofFloat(bindingMain.fabFirst,"scaleY", 1.0f, 0.0f)
                val scaleXFabSecond = ObjectAnimator.ofFloat(bindingMain.fabSecond,"scaleX", 1.0f, 0.0f)
                val scaleYFabSecond = ObjectAnimator.ofFloat(bindingMain.fabSecond,"scaleY", 1.0f, 0.0f)
                val scaleXFabThird = ObjectAnimator.ofFloat(bindingMain.fabThird,"scaleX", 1.0f, 0.0f)
                val scaleYFabThird = ObjectAnimator.ofFloat(bindingMain.fabThird,"scaleY", 1.0f, 0.0f)

                val multiAnimation = AnimatorSet().apply {
                    duration = 500
                    playTogether(rotateFabMain,scaleXFabFirst,scaleYFabFirst,scaleXFabSecond,scaleYFabSecond,scaleXFabThird,scaleYFabThird)
                }
                multiAnimation.start()
                fabState = false

            } else {
                val rotateFabMain = ObjectAnimator.ofFloat(bindingMain.fabMain,"rotation", 0.0f, 45.0f)
                val scaleXFabFirst = ObjectAnimator.ofFloat(bindingMain.fabFirst,"scaleX", 0.0f, 1.0f)
                val scaleYFabFirst = ObjectAnimator.ofFloat(bindingMain.fabFirst,"scaleY", 0.0f, 1.0f)
                val scaleXFabSecond = ObjectAnimator.ofFloat(bindingMain.fabSecond,"scaleX", 0.0f, 1.0f)
                val scaleYFabSecond = ObjectAnimator.ofFloat(bindingMain.fabSecond,"scaleY", 0.0f, 1.0f)
                val scaleXFabThird = ObjectAnimator.ofFloat(bindingMain.fabThird,"scaleX", 0.0f, 1.0f)
                val scaleYFabThird = ObjectAnimator.ofFloat(bindingMain.fabThird,"scaleY", 0.0f, 1.0f)

                val multiAnimation = AnimatorSet().apply {
                    duration = 500
                    playTogether(rotateFabMain,scaleXFabFirst,scaleYFabFirst,scaleXFabSecond,scaleYFabSecond,scaleXFabThird,scaleYFabThird)
                }
                multiAnimation.start()
                fabState = true
            }
            Toast.makeText(applicationContext,"Fab Main Clicked", Toast.LENGTH_SHORT).show()
        }

        bindingMain.fabFirst.setOnClickListener {
            Toast.makeText(applicationContext,"Fab First Clicked", Toast.LENGTH_SHORT).show()
        }

        bindingMain.fabSecond.setOnClickListener {
            Toast.makeText(applicationContext,"Fab Second Clicked", Toast.LENGTH_SHORT).show()
        }

        bindingMain.fabThird.setOnClickListener {
            Toast.makeText(applicationContext,"Fab Third Clicked", Toast.LENGTH_SHORT).show()
        }
    }
}