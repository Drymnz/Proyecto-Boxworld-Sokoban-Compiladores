package com.example.boxworld_sokoban

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.drawable.BitmapDrawable
import android.widget.ImageView
import androidx.core.app.NotificationCompat.getColor
import com.example.boxworld_sokoban.juego.BoxGame
import com.example.boxworld_sokoban.juego.JflexYCup.xml.LexicoXML
import com.example.boxworld_sokoban.juego.JflexYCup.xml.Map.ListSquare
import com.example.boxworld_sokoban.juego.JflexYCup.xml.Map.Map
import com.example.boxworld_sokoban.juego.JflexYCup.xml.SicXML
import com.example.boxworld_sokoban.juego.ListBox
import com.example.boxworld_sokoban.juego.SicXMLToMap
import org.junit.Test
import java.io.File
import java.io.Reader
import java.io.StringReader

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val inputString = File("/mnt/Archivo/Mis documentos/Proyect/Proyecto compiladores/Android/app/src/test/java/com/example/boxworld_sokoban/test.xml").reader().use{it.readText()}
        val String:String = inputString
        //println (String)
        val reader: Reader = StringReader(String)
        val Lexico = LexicoXML(reader)
        val sic = SicXML(Lexico)
        try {
            sic.parse()
            System.out.println(Lexico.getReport())
        } catch (e: Exception) {
            assert(false)
        }
        //go to map
        val map : Map = SicXMLToMap(sic).getReturnFinal()
        val dr : Boolean = true
        //from map to cells
        val listBoxGameMap = ArrayList<ArrayList<BoxGame>>()
        for(possY in 0..map.getRows()) {
            val row = ArrayList<BoxGame>()
            for(possX in 0..map.getCols()) {
                val selec:ListSquare = map.getMatrix().get(possY).get(possX).getType()
                when (selec) {
                    ListSquare.BOX -> {
                        //row.add(createBox(ListBox.BOX))
                    }
                    ListSquare.HALL -> {
                        //row.add(createBox(ListBox.HALL))
                    }
                    ListSquare.BRICK -> {
                        //row.add(createBox(ListBox.BRICK))
                    }
                    ListSquare.TARGET -> {
                        //row.add(createBox(ListBox.TARGET))
                    }
                    ListSquare.PLAY -> {
                        //row.add(createBox(ListBox.PLAY))
                    }
                    else -> {

                    }
                }
            }
            listBoxGameMap.add(row)
        }
        assert(true)
    }

    private fun getColor(hallColor: Int): Int {
        return  0
    }


}