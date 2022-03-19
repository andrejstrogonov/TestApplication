package com.example.testapplication

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.testapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            navigatorView.setNavigationItemSelectedListener {
                when(it.itemId) {
                    R.id.item1-> Toast.makeText(this@MainActivity,"Item 1",Toast.LENGTH_SHORT).show()
                }
                true
            }
        }

    }
/*изменение*/

}