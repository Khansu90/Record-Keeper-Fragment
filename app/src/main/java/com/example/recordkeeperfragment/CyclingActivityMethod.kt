package com.example.recordkeeperfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recordkeeperfragment.databinding.ActivityCyclingMethodBinding

class CyclingActivityMethod : AppCompatActivity() {

    private lateinit var binding:ActivityCyclingMethodBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCyclingMethodBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val distance = intent.getStringExtra("Distance")
        title = "$distance Record"
    }
}