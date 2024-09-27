package com.ismailmesutmujde.kotlinanimatedfab

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.ismailmesutmujde.kotlinanimatedfab.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var  bindingMain : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        val view = bindingMain.root
        setContentView(view)

        bindingMain.fabMain.setOnClickListener {
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