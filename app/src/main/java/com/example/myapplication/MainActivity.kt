package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity1","onCreate")
        //
    }
    override fun onStart(){
        super.onStart ()
        Log.d("MainActivity1","onStart")
    }

    override fun onResume(){
        super.onResume()
        Log.d("MainActivity1","onResume")
    }

    override fun onPause(){
        super.onPause()
        Log.d("MainActivity1","onPause")
    }

    override fun onStop(){
        super.onStop()
        Log.d("MainActivity1","onStop")
    }
    override fun onDestroy(){
        super.onDestroy()
        Log.d("MainActivity1","onDestroy")
    }
}
