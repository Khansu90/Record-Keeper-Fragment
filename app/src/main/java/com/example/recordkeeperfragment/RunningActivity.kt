package com.example.recordkeeperfragment

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.example.recordkeeperfragment.databinding.ActivityRunningBinding

class RunningActivity : Fragment() {

    private lateinit var binding: ActivityRunningBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ActivityRunningBinding.inflate(inflater, container, false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        clickListeners()
    }



    private fun clickListeners() {
        binding.frame5km.setOnClickListener { launchListener("5km") }
        binding.frame10km.setOnClickListener { launchListener("10km") }
        binding.frame15km.setOnClickListener { launchListener("15km") }
        binding.frame20km.setOnClickListener { launchListener("20km") }
    }

    private fun launchListener(distance: String) {
        context
        val myIntentActivity = Intent(context, RunningActivitySetup::class.java)
        myIntentActivity.putExtra("Distance", distance)
        startActivity(myIntentActivity)
    }
}
