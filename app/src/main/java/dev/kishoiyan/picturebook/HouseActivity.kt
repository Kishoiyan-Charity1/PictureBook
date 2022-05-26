package dev.kishoiyan.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HouseActivity : AppCompatActivity() {
    lateinit var btnNext3: Button
    lateinit var btnPrev2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_house)
        btnNext3= findViewById(R.id.btnNext3)
        btnNext3.setOnClickListener {
           val intent = Intent( this,FoodActivity :: class.java)
            startActivity(intent)
        }
        btnPrev2= findViewById(R.id.btnPrev2)
        btnPrev2.setOnClickListener{
            val intent = Intent(this,CarActivity ::class.java)
            startActivity(intent)
        }

    }
}