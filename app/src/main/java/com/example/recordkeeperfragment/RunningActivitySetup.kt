package com.example.recordkeeperfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recordkeeperfragment.databinding.ActivityRunningSetupBinding

class RunningActivitySetup : AppCompatActivity() {

   private lateinit var binding:ActivityRunningSetupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRunningSetupBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val distance = intent.getStringExtra("Distance")
        title = "$distance Record"

    }
}