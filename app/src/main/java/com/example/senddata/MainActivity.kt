package com.example.senddata


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
   lateinit var editText:EditText
   lateinit var editText2:EditText
    lateinit var editText3:EditText
    lateinit var editText4:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn=findViewById<Button>(R.id.Send)
        editText = findViewById(R.id.object1)
        editText2 = findViewById(R.id.object2)
        editText3 = findViewById(R.id.object3)
        editText4 = findViewById(R.id.object4)
        btn.setOnClickListener{
            val intent=Intent(this,SecondActivity::class.java)
            val passingObject=DataTransfer()
            val passingObject2=DataTransfer()
            passingObject.username=editText.text.toString();
            passingObject.Password=editText2.text.toString();
            passingObject2.username=editText3.text.toString();
            passingObject2.Password=editText4.text.toString();
            intent.putExtra("object",passingObject)
            intent.putExtra("object2", passingObject2)
            startActivity(intent)
        }

    }
}
