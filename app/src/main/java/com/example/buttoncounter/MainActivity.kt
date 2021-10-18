package com.example.buttoncounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.TextureView
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tvNum:TextView
    lateinit var btnPlus:Button
    lateinit var btnMinus:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvNum=findViewById(R.id.tvNum)
        btnMinus=findViewById(R.id.btnMinus)
        btnPlus=findViewById(R.id.btnPlus)

        var num=tvNum.text.toString().toInt()

        btnMinus.setOnClickListener(){
            num--
            tvNum.text=num.toString()
        }

        btnPlus.setOnClickListener(){
            num++
            tvNum.text=num.toString()
        }
    }
}