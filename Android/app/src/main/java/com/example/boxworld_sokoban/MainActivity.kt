package com.example.boxworld_sokoban

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AutoCompleteTextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.boxworld_sokoban.juego.JflexYCup.xml.LexicoXML
import com.example.boxworld_sokoban.juego.JflexYCup.xml.Map.Map
import com.example.boxworld_sokoban.juego.JflexYCup.xml.SicXML
import com.example.boxworld_sokoban.juego.Juego
import com.example.boxworld_sokoban.juego.SicXMLToMap
import com.example.boxworld_sokoban.juego.server.Connection
import java.io.File
import java.io.Reader
import java.io.StringReader

class MainActivity : AppCompatActivity() {

    val PORT = 8086//socket connection port
    val prueva:String = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<worlds>\n" +
            "\t<world>\n" +
            "\t\t<name>tatoine</name>\n" +
            "\t\t<name>tatoine</name><name>tatoine</name><name>tatoine</name>\n" +
            "\t\t<rows>5</rows>\n" +
            "\t\t<cols>4</cols>\n" +
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
            "\t\t\t<posX>0</posX>\n" +
            "\t\t\t<posY>0</posY>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posX>0</posX>\n" +
            "\t\t\t<posY>1</posY>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posX>0</posX>\n" +
            "\t\t\t<posY>2</posY>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "            </board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posX>0</posX>\n" +
            "\t\t\t<posY>3</posY>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posX>0</posX>\n" +
            "\t\t\t<posY>4</posY>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posX>1</posX>\n" +
            "\t\t\t<posY>0</posY>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posX>1</posX>\n" +
            "\t\t\t<posY>1</posY>\n" +
            "\t\t\t<type>HALL</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posX>1</posX>\n" +
            "\t\t\t<posY>2</posY>\n" +
            "\t\t\t<type>HALL</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posX>1</posX>\n" +
            "\t\t\t<posY>3</posY>\n" +
            "\t\t\t<type>HALL</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posX>1</posX>\n" +
            "\t\t\t<posY>4</posY>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posX>2</posX>\n" +
            "\t\t\t<posY>0</posY>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posX>2</posX>\n" +
            "\t\t\t<posY>1</posY>\n" +
            "\t\t\t<type>HALL</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posX>2</posX>\n" +
            "\t\t\t<posY>2</posY>\n" +
            "\t\t\t<type>HALL</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posX>2</posX>\n" +
            "\t\t\t<posY>3</posY>\n" +
            "\t\t\t<type>HALL</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posX>2</posX>\n" +
            "\t\t\t<posY>4</posY>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posX>3</posX>\n" +
            "\t\t\t<posY>0</posY>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posX>3</posX>\n" +
            "\t\t\t<posY>1</posY>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posX>3</posX>\n" +
            "\t\t\t<posY>2</posY>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "\t\t\t<posX>3</posX>\n" +
            "\t\t\t<posY>4</posY>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\t\t<board>\n" +
            "            <posX>3</posX>\n" +
            "\t\t\t<posY>5</posY>\n" +
            "\t\t\t<type>BRICK</type>\n" +
            "\t\t</board>\n" +
            "\t\t<boxes>\n" +
            "\t\t\t<posX>2</posX>\n" +
            "\t\t\t<posY>1</posY>\n" +
            "\t\t</boxes>\n" +
            "\t\t<boxes>\n" +
            "\t\t\t<posX>2</posX>\n" +
            "\t\t\t<posY>2</posY>\n" +
            "\t\t</boxes>\n" +
            "\t\t<targets>\n" +
            "\t\t\t<posX>3</posX>\n" +
            "\t\t\t<posY>1</posY>\n" +
            "\t\t</targets>\n" +
            "\t\t<targets>\n" +
            "\t\t\t<posX>3</posX>\n" +
            "\t\t\t<posY>2</posY>\n" +
            "\t\t</targets>\n" +
            "\t\t<player>\n" +
            "\t\t\t<posX>1</posX>\n" +
            "\t\t\t<posY>1</posY>\n" +
            "\t\t</player>\n" +
            "\t</world>\n" +
            "</worlds>\n"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun analyze(view:View){
        //send text socket
        val textsend:AutoCompleteTextView = findViewById(R.id.textSendSocket)
        Log.d("enviar",textsend.text.toString())
        //socket
        val server:Connection = Connection(this.PORT,findViewById(R.id.BotonCompiladorActivity),textsend.getText().toString())
        Toast.makeText(this,"Fue enviado la solicitu al server",Toast.LENGTH_SHORT)
        Log.d("enviado","enviado")
        server.sendJSon()
        //
        val sic: SicXML? = analyze(prueva)
        //decision, *************** put a switch ***************
        // go game
        if (sic != null) {
            irJuego(sic)
        }
        // go error
        goError()
        // show list
        showListWord()
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
    /**go game
     * */
    fun irJuego(sic: SicXML){
        val map : Map = SicXMLToMap(sic).getReturnFinal()
        val list:ArrayList<com.example.boxworld_sokoban.juego.JflexYCup.xml.Map.Map> = ArrayList()
        list.add(map)


        val intent = Intent(this, Juego::class.java)

        intent.putExtra("listado_reportes_mate", map)
        startActivity(intent)
    }

    fun goError(){

    }

    fun showListWord(){

    }

}