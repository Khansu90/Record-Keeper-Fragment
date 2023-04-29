package com.example.recordkeeperfragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.recordkeeperfragment.databinding.ActivityCyclingBinding

class CyclingActivity :Fragment() {


    private lateinit var binding:ActivityCyclingBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ActivityCyclingBinding.inflate(inflater,container,false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        clickListeners()
    }

    private fun clickListeners() {
        binding.frameLongestRide.setOnClickListener { launchListener("Longest Ride") }
        binding.frameBiggestClimb.setOnClickListener { launchListener("Biggest Climb") }
        binding.frameBestSpeed.setOnClickListener { launchListener("Best Average Speed") }
    }

    private fun launchListener(distance :String) {
        context
        val myIntentActivity = Intent(context,CyclingActivityMethod::class.java)
        myIntentActivity.putExtra("Distance",distance)
        startActivity(myIntentActivity)
    }
}