package com.example.boxworld_sokoban

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.boxworld_sokoban.juego.Juego

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun irJuego(view: View){
        val intent = Intent(this, Juego::class.java)
        startActivity(intent)
    }

}