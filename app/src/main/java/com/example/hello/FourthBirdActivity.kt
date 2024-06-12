package com.example.hello

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityFourthBirdBinding
import com.example.hello.databinding.ActivityMainBinding
import com.example.hello.databinding.ActivitySecondBirdBinding
import com.squareup.picasso.Picasso

class FourthBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityFourthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnNext6.setOnClickListener {
            val intent = Intent(this, FifthBirdActivity::class.java)
            startActivity(intent)
        }
        binding.btnNext7.setOnClickListener {
            val intent = Intent(this,ThirdBirdActivity::class.java)
            finish()
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1555169062-013468b47731?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OHx8QklSRHxlbnwwfHwwfHx8MA%3D%3D")
            .resize(1200,1200)
            .into(binding.imageView8)

    }}}