package com.example.recordkeeperfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.fragment.app.commit
import com.example.recordkeeperfragment.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationBarView

class MainActivity : AppCompatActivity(), NavigationBarView.OnItemSelectedListener {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.commit {
            replace(R.id.frame_layout, RunningActivity())

        }

        binding.bottomNav.setOnItemSelectedListener(this)


    }

    private fun clickedRunning() {
        supportFragmentManager.commit {
            replace(R.id.frame_layout, RunningActivity())
        }

    }

    private fun clickedCycling() {
        supportFragmentManager.commit {
            replace(R.id.frame_layout, CyclingActivity())
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate (R.menu.toolbar,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean = when(item.itemId) {
        R.id.reset_running_method -> {
            Toast.makeText(this, "All Running records were reseted!", Toast.LENGTH_SHORT).show()
            true
        }
        R.id.reset_cycling_method -> {
            Toast.makeText(this, "All Cycling records were reseted!", Toast.LENGTH_SHORT).show()
            true
        }
        R.id.reset_all_method -> {
            Toast.makeText(this, "All records were reseted!", Toast.LENGTH_SHORT).show()
            true
        }
        else -> {
            super.onOptionsItemSelected(item)

        }


    }
    


    override fun onNavigationItemSelected(item: MenuItem): Boolean = when (item.itemId) {

        R.id.running_method -> {
            clickedRunning()
            true

        }
        R.id.cycling_method -> {
            clickedCycling()
            true

        }
        else -> {
            false

        }
    }
}