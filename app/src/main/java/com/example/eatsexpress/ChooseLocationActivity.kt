package com.example.eatsexpress

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.eatsexpress.databinding.ActivityChooseLocationBinding

class ChooseLocationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityChooseLocationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChooseLocationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupLocation()
    }

    private fun setupLocation() {
        val locationList = arrayOf("Ahmedabad", "Rajkot", "Surat", "Vadodara", "Gandhinagar", "Jamnagar", "Junagadh", "Bhavnagar", "Porbandar")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, locationList)
        binding.listOfLocation.setAdapter(adapter)
    }
}