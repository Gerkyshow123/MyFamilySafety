package com.example.familysafety

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       var bottombar = findViewById<BottomNavigationView>(R.id.bottom_bar)
        bottombar.setOnItemSelectedListener{ menuitem ->
            if (menuitem.itemId==R.id.home){
                inflatefragment(HomeFragment.newInstance())
            }
//            else if(menuitem.itemId==R.id.dashboard){
//                inflatefragment()
//            }
            else if(menuitem.itemId==R.id.guard){
                inflatefragment(GuardFragment.newInstance())
            }
            true
        }


    }

    private fun inflatefragment(newInstance: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, newInstance)
        transaction.commit()
    }
}