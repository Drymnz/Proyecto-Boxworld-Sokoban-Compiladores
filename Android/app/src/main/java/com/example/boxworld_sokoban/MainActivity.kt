package com.example.boxworld_sokoban

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AutoCompleteTextView
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


    val prueva_two:String = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<worlds>\n" +
            "\t<world>\n" +
            "\t\t<name>tatoine</name>\n" +
            "\t\t<rows>10</rows>\n" +
            "\t\t<cols>10</cols>\n" +
            "\t\t<config>\n" +
            "\t\t\t<box_color>#ffff00</box_color>\n" +
            "\t\t\t<box_on_target_color>#fe0002</box_on_target_color>\n" +
            "\t\t\t<target_color>#d6fe0a</target_color>\n" +
            "\t\t\t<brick_color>#bdbebf</brick_color>\n" +
            "\t\t\t<hall_color>#0001ff</hall_color>\n" +
            "\t\t\t<undefined_color>#303030</undefined_color>\n" +
            "\t\t\t<player_color>#ff00f7</player_color>\n" +
            "\t\t</config>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posY>1</posY>\n" +
            "\t\t\t<posX>3</posX>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posY>1</posY>\n" +
            "\t\t\t<posX>4</posX>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posY>1</posY>\n" +
            "\t\t\t<posX>5</posX>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\n" +
            "\t\t<board>\n" +
            "\t\t\t<posY>2</posY>\n" +
            "\t\t\t<posX>3</posX>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posY>2</posY>\n" +
            "\t\t\t<posX>4</posX>\n" +
            "\t\t\t<type>HALL</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posY>2</posY>\n" +
            "\t\t\t<posX>5</posX>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\n" +
            "\t\t<board>\n" +
            "\t\t\t<posY>3</posY>\n" +
            "\t\t\t<posX>3</posX>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posY>3</posY>\n" +
            "\t\t\t<posX>4</posX>\n" +
            "\t\t\t<type>HALL</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posY>3</posY>\n" +
            "\t\t\t<posX>5</posX>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\n" +
            "\t\t<board>\n" +
            "\t\t\t<posY>3</posY>\n" +
            "\t\t\t<posX>6</posX>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posY>3</posY>\n" +
            "\t\t\t<posX>7</posX>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posY>3</posY>\n" +
            "\t\t\t<posX>8</posX>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\n" +
            "\t\t<board>\n" +
            "\t\t\t<posY>4</posY>\n" +
            "\t\t\t<posX>1</posX>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posY>4</posY>\n" +
            "\t\t\t<posX>2</posX>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posY>4</posY>\n" +
            "\t\t\t<posX>3</posX>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\n" +
            "\t\t<board>\n" +
            "\t\t\t<posY>4</posY>\n" +
            "\t\t\t<posX>4</posX>\n" +
            "\t\t\t<type>HALL</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posY>4</posY>\n" +
            "\t\t\t<posX>5</posX>\n" +
            "\t\t\t<type>HALL</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posY>4</posY>\n" +
            "\t\t\t<posX>6</posX>\n" +
            "\t\t\t<type>HALL</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posY>4</posY>\n" +
            "\t\t\t<posX>7</posX>\n" +
            "\t\t\t<type>HALL</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posY>4</posY>\n" +
            "\t\t\t<posX>8</posX>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\n" +
            "\t\t<board>\n" +
            "\t\t\t<posY>5</posY>\n" +
            "\t\t\t<posX>1</posX>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posY>5</posY>\n" +
            "\t\t\t<posX>2</posX>\n" +
            "\t\t\t<type>HALL</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posY>5</posY>\n" +
            "\t\t\t<posX>3</posX>\n" +
            "\t\t\t<type>HALL</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posY>5</posY>\n" +
            "\t\t\t<posX>4</posX>\n" +
            "\t\t\t<type>HALL</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posY>5</posY>\n" +
            "\t\t\t<posX>5</posX>\n" +
            "\t\t\t<type>HALL</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posY>5</posY>\n" +
            "\t\t\t<posX>6</posX>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posY>5</posY>\n" +
            "\t\t\t<posX>7</posX>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posY>5</posY>\n" +
            "\t\t\t<posX>8</posX>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\n" +
            "\t\t<board>\n" +
            "\t\t\t<posY>6</posY>\n" +
            "\t\t\t<posX>1</posX>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posY>6</posY>\n" +
            "\t\t\t<posX>2</posX>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posY>6</posY>\n" +
            "\t\t\t<posX>3</posX>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posY>6</posY>\n" +
            "\t\t\t<posX>4</posX>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posY>6</posY>\n" +
            "\t\t\t<posX>5</posX>\n" +
            "\t\t\t<type>HALL</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posY>6</posY>\n" +
            "\t\t\t<posX>6</posX>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\n" +
            "\t\t<board>\n" +
            "\t\t\t<posY>7</posY>\n" +
            "\t\t\t<posX>4</posX>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posY>7</posY>\n" +
            "\t\t\t<posX>5</posX>\n" +
            "\t\t\t<type>HALL</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posY>7</posY>\n" +
            "\t\t\t<posX>6</posX>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\n" +
            "\t\t<board>\n" +
            "\t\t\t<posY>8</posY>\n" +
            "\t\t\t<posX>4</posX>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posY>8</posY>\n" +
            "\t\t\t<posX>5</posX>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posY>8</posY>\n" +
            "\t\t\t<posX>6</posX>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\n" +
            "\n" +
            "\t\t<boxes>\n" +
            "\t\t\t<posY>5</posY>\n" +
            "\t\t\t<posX>4</posX>\n" +
            "\t\t</boxes>\n" +
            "\t\t<boxes>\n" +
            "\t\t\t<posY>6</posY>\n" +
            "\t\t\t<posX>5</posX>\n" +
            "\t\t</boxes>\n" +
            "\t\t<boxes>\n" +
            "\t\t\t<posY>4</posY>\n" +
            "\t\t\t<posX>4</posX>\n" +
            "\t\t</boxes>\n" +
            "\t\t<boxes>\n" +
            "\t\t\t<posY>4</posY>\n" +
            "\t\t\t<posX>6</posX>\n" +
            "\t\t</boxes>\n" +
            "\n" +
            "\n" +
            "\t\t<targets>\n" +
            "\t\t\t<posY>2</posY>\n" +
            "\t\t\t<posX>4</posX>\n" +
            "\t\t</targets>\n" +
            "\t\t<targets>\n" +
            "\t\t\t<posY>4</posY>\n" +
            "\t\t\t<posX>7</posX>\n" +
            "\t\t</targets>\n" +
            "\t\t<targets>\n" +
            "\t\t\t<posY>5</posY>\n" +
            "\t\t\t<posX>2</posX>\n" +
            "\t\t</targets>\n" +
            "\t\t<targets>\n" +
            "\t\t\t<posY>7</posY>\n" +
            "\t\t\t<posX>5</posX>\n" +
            "\t\t</targets>\n" +
            "\n" +
            "\n" +
            "\t\t<player>\n" +
            "\t\t\t<posY>5</posY>\n" +
            "\t\t\t<posX>5</posX>\n" +
            "\t\t</player>\n" +
            "\t</world>\n" +
            "</worlds>\n"

    // TODO: make the ip dynamic
    val ipServer: String = "192.168.10.130"
    val portServer: Int = 8086//socket connection port
    var textView: TextView? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun analyze(view:View){
        //send text socket
        val textsend:AutoCompleteTextView = findViewById(R.id.textSendSocket)
        //Log.d("enviar",textsend.text.toString())
        //socket
        Toast.makeText(this,"Fue enviado la solicitu al server",Toast.LENGTH_SHORT)
        Log.d("enviado","enviado")
        sendMessage(textsend.text.toString())
        //
        val sic: SicXML? = analyze(prueva_two)
        //decision, *************** put a switch ***************
        // go game
        //if (sic != null && sic.isMap) {
                //irJuego(sic)
        //}
        //else{
            // go error
            // show list
        //}
    }
    fun analyze(text:String):SicXML?{
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
        if (output != null) {
            textView?.text = output
            Log.d("formin",output)
        } else {
            textView?.text = "Something went wrong"
        }
    }
    private fun sendMessage(message: String) {
        val task = MyTask(ipServer, portServer, message)
        task.delegate = this
        task.execute()
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