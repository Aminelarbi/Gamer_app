package com.example.gamerappp

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.gamerappp.databinding.HomeBinding
class Home  : AppCompatActivity() {

    private  lateinit var fragmentManager: FragmentManager
    private lateinit var binding: HomeBinding
    private lateinit var binding1: Home

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.bt1.setOnClickListener{
            goToFragment(NewsFragment())
        }


        binding.bt2.setOnClickListener{
            goToFragment(StoreFragment())
        }



    }



    private  fun goToFragment(fragment: Fragment){
        fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment).commit()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar, menu) // Inflate your custom menu XML
        return true
    }



}