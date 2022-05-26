package dev.kishoiyan.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FoodActivity : AppCompatActivity() {
    lateinit var btnNext4 : Button
    lateinit var btnPrev3 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)
        btnNext4= findViewById(R.id.btnNext4)
        btnNext4.setOnClickListener {
            val intent= Intent(this,TravelActivity ::class.java)
            startActivity(intent)
        }
        btnPrev3= findViewById(R.id.btnPrev3)
        btnPrev3.setOnClickListener{
            val intent= Intent(this,HouseActivity ::class.java)
            startActivity(intent)
        }

    }
}