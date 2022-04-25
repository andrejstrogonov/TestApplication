package com.example.testapplication.UserInterface

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.example.testapplication.R
import com.example.testapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var drawer: DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {

        }
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            navigatorView.setNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.item1 -> Toast.makeText(this@MainActivity, "Item 1", Toast.LENGTH_SHORT)
                        .show()
                    R.id.item2 -> Toast.makeText(this@MainActivity, "Item 2", Toast.LENGTH_SHORT)
                        .show()
                    R.id.item3 -> Toast.makeText(this@MainActivity, "Item 3", Toast.LENGTH_SHORT)
                        .show()
                    R.id.item11 -> Toast.makeText(this@MainActivity, "Item 11", Toast.LENGTH_SHORT)
                        .show()
                    R.id.item22 -> Toast.makeText(this@MainActivity, "Item 22", Toast.LENGTH_SHORT)
                        .show()
                    R.id.item33 -> Toast.makeText(this@MainActivity, "Item 33", Toast.LENGTH_SHORT)
                        .show()
                }
                true
            }
        }
    }

}
