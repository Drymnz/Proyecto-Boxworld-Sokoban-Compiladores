package com.example.boxworld_sokoban

import android.content.Intent
import android.os.Bundle
import android.text.TextPaint
import android.util.Log
import android.view.View
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.boxworld_sokoban.juego.JflexYCup.xml.LexicoXML
import com.example.boxworld_sokoban.juego.JflexYCup.xml.Map.Map
import com.example.boxworld_sokoban.juego.JflexYCup.xml.SicXML
import com.example.boxworld_sokoban.juego.Juego
import com.example.boxworld_sokoban.juego.SicXMLToMap
import com.example.boxworld_sokoban.juego.server.Connection
import com.example.boxworld_sokoban.juego.server.message.SimpleMessage
import com.example.boxworld_sokoban.juego.server.task.AsyncResponse
import com.example.boxworld_sokoban.juego.server.task.MyTask
import java.io.Reader
import java.io.StringReader

class MainActivity : AppCompatActivity(), AsyncResponse {

    val portServer: Int = 8086//socket connection port

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * run button execution
     * */
    fun analyze(view:View){
        //send text socket
        val textsend:AutoCompleteTextView = findViewById(R.id.textSendSocket)
        //socket
        findViewById<Button>(R.id.BotonCompiladorActivity).setEnabled(false)//diseble button
        Log.d("enviado","se envia la solicitud")//status
        sendMessage(textsend.text.toString())//send text
    }
    fun analyze(text:String):SicXML?{
        findViewById<Button>(R.id.BotonCompiladorActivity).setEnabled(true)//diseble button
        val reader: Reader = StringReader(text)
        val Lexico = LexicoXML(reader)
        val sic = SicXML(Lexico)
        try {
            sic.parse()
            System.out.println(Lexico.getReport())
            return sic
        } catch (e: Exception) {
            return null
        }
        return null
    }

    override fun processResponse(output: String?) {
        if (output != null && !output.isEmpty()) {
            val sic: SicXML? = analyze(output)
            //decision, *************** put a switch ***************
            // go game
            if (sic != null && sic.isMap) {
                irJuego(sic)
            }
            else{
            // go error
            // show list
            }
        } else {
            Toast.makeText(this, "Ip incorrecta",Toast.LENGTH_LONG)
        }
    }
    /**
     * send String to severt
     * */
    private fun sendMessage(message: String) {
        val task = MyTask(getIpServert(), portServer, message)//create the object
        task.delegate = this
        task.execute()
    }
    /**
     * return ip entered
     * */
    private fun getIpServert():String {
        val text:String = findViewById<EditText>(R.id.ipServer).text.toString().replace("\\s".toRegex(), "")
        Log.d("IP SERVER",text)
        if (!text.isEmpty()){
            return text
        }
        return ""
    }
    /**go game
     * */
    fun irJuego(sic: SicXML){
        val map : Map = SicXMLToMap(sic).getReturnFinal()
        val list:ArrayList<com.example.boxworld_sokoban.juego.JflexYCup.xml.Map.Map> = ArrayList()
        list.add(map)
        val intent = Intent(this, Juego::class.java)
        intent.putExtra("listado_reportes_mate", map)//send map
        startActivity(intent)
    }

}