package com.tasinctg.cuetbusschedulingapp


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tasinctg.cuetbusschedulingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // Declare binding as a property
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Access buttons directly using binding
        binding.showScheduleButton.setOnClickListener {
            val intent = Intent(this, ScheduleActivity::class.java)
            startActivity(intent)
        }

        binding.showBusInfoButton.setOnClickListener {
            val intent = Intent(this, BusInfoActivity::class.java)
            startActivity(intent)
        }
    }
}
