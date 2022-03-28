package com.example.testapplication

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.testapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                setCustomAnimations(
                    R.anim.fade_in,
                    R.anim.fade_out,
                    R.anim.slide_in,
                    R.anim.slide_out
                )
                add<LoginFragment>(R.id.login_fragment)
                setReorderingAllowed(true)
            }
        }
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

}