package com.example.boxworld_sokoban.juego

import android.util.Log
import android.widget.Button
import com.example.boxworld_sokoban.JflexYCup.Lexema
import com.example.boxworld_sokoban.JflexYCup.parser
import com.example.boxworld_sokoban.R
import java.io.Reader
import java.io.StringReader

class Analyze {

    private val text:String
    private val game:Juego
    private var runAnaly:Boolean = false

    constructor(text:String,game:Juego){
        this.text = text
        this.game = game
    }
    public fun runAnaly(){
        if (!this.runAnaly){
            Log.d("analyze","iniciando el analise")
            val lexema:Lexema = Lexema(StringReader(this.text))
            val sintac: parser = parser(lexema)
            sintac.parse()
            game.findViewById<Button>(R.id.BotonCompiladorGame).setEnabled(false)
            //start move
            val thread = Thread(Runnable {
                //fin move
                this.runMovePlay(sintac.getListMoveGame())
            })
            thread.start()
        }
        this.runAnaly = true
    }
    private fun runMovePlay(list:ArrayList<ListMovePlay>){
        for(item in list){
            game.moverPlay(item)
            Thread.sleep(500)
        }
        this.runAnaly = false
        this.game.findViewById<Button>(R.id.BotonCompiladorGame).setEnabled(true)
    }
    public  fun  isRunAnaly():Boolean{return  this.runAnaly}
}