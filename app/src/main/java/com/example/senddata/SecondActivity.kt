package com.example.senddata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
val myIntent=intent
        val derivedObject=myIntent.getSerializableExtra("object")as DataTransfer
        val derivedObject2=myIntent.getSerializableExtra("object2")as DataTransfer
        val myTextView=findViewById<TextView>(R.id.display)
        val myTextView2=findViewById<TextView>(R.id.display2)
        myTextView.append(derivedObject.username+"\n")
        myTextView.append(derivedObject.Password+"\n")
        myTextView2.append(derivedObject2.username+"\n")
        myTextView2.append(derivedObject2.Password+"\n")
    }

}