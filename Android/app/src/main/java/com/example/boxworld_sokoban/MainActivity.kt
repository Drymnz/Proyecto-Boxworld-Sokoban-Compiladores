package com.example.boxworld_sokoban

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AutoCompleteTextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.boxworld_sokoban.juego.Juego
import com.example.boxworld_sokoban.juego.server.Connection

class MainActivity : AppCompatActivity() {
    val PORT = 8086
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun irJuego(view: View){
        val textsend:AutoCompleteTextView = findViewById(R.id.textSendSocket)
        Log.d("enviar",textsend.text.toString())
        val server:Connection = Connection(this.PORT,findViewById(R.id.BotonCompiladorActivity),textsend.getText().toString())
        Toast.makeText(this,"Fue enviado la solicitu al server",Toast.LENGTH_SHORT)
        Log.d("enviado","enviado")
        server.sendJSon()
        val intent = Intent(this, Juego::class.java)
        startActivity(intent)
    }

}