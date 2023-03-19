package com.example.boxworld_sokoban.juego

import android.os.AsyncTask
import android.util.Log
import android.widget.Button
import com.example.boxworld_sokoban.juego.JflexYCup.MovePlay.Lexema
import com.example.boxworld_sokoban.juego.JflexYCup.MovePlay.parser
import com.example.boxworld_sokoban.R
import com.example.boxworld_sokoban.juego.server.task.AsyncResponse
import java.io.ObjectInputStream
import java.io.ObjectOutputStream
import java.io.StringReader
import java.net.Socket

class Analyze(text:String,game:Juego) : AsyncTask<Void, Void, String>() {

    private val text:String
    private val game:Juego
    private var runAnaly:Boolean = false
    private var listReportOperacion = ArrayList<ArrayList<String>>()

    init {
        this.text = text
        this.game = game
    }
    public fun runAnaly(){
        if (!this.runAnaly){
            Log.d("analyze","iniciando el analise")
            try {
                val lexema: Lexema =
                    Lexema(
                        StringReader(this.text)
                    )
                val sintac: parser =
                    parser(lexema)
                sintac.parse()
                //start move
                //fin move
                this.listReportOperacion = sintac.listMath
                this.runMovePlay(sintac.getListMoveGame())
            }catch (e:Exception ){
                e.printStackTrace()
            }
        }
        this.runAnaly = true
    }
    private fun runMovePlay(list:ArrayList<ReportMoven>){

        if (!list.isEmpty()){
            var countTOP:Int = 0
            var countDOWN:Int = 0
            var countRIGHT:Int = 0
            var countLEFT:Int = 0
            var startTableReport:Boolean = true
            var beforeType:ListMovePlay = list.get(0).getType()
            var sizeListReportMoven:Int = 0
            for(item in list){
                val beforePossY = game.getPossY()
                val beforePossX = game.getPossX()
                game.moverPlay(item.getType())
                insertReportInstructions(beforePossY,beforePossX,beforeType,item.getType(),startTableReport,item)
                startTableReport = game.getListadoReport().isEmpty()
                sizeListReportMoven = game.getListadoReport().size
                beforeType=item.getType()
                when (item.getType()) {
                    ListMovePlay.TOP->countTOP++
                    ListMovePlay.PUSH_TOP->countTOP++
                    ListMovePlay.DOWN->countDOWN++
                    ListMovePlay.PUSH_DOWN->countDOWN++
                    ListMovePlay.LEFT->countLEFT++
                    ListMovePlay.PUSH_LEFT->countLEFT++
                    ListMovePlay.RIGHT->countRIGHT++
                    ListMovePlay.PUSH_RIGHT->countRIGHT++
                    else->
                    {
                    }
                }
                Thread.sleep(500)
            }
            insertReportMove(countTOP, countDOWN,countRIGHT,countLEFT)
        }
    }

    fun insertReportMove(countTOP:Int,
                         countDOWN:Int,
                         countRIGHT:Int,
                         countLEFT:Int)
    {

        val qualification:ArrayList<String> = ArrayList()
        qualification.add("--REPORTE DE MOVIMIENTOS--")
        game.getListadoReport().add(qualification)
            val listRowStart:ArrayList<String> = ArrayList()
            listRowStart.add("Dirección")
            listRowStart.add("Cantidad")
        game.getListadoReport().add(listRowStart)
        val listRowleft:ArrayList<String> = ArrayList()
        listRowleft.add("left")
        listRowleft.add(countLEFT.toString())
        game.getListadoReport().add(listRowleft)
        val listRowright:ArrayList<String> = ArrayList()
        listRowright.add("right")
        listRowright.add(countRIGHT.toString())
        game.getListadoReport().add(listRowright)
        val listRowup:ArrayList<String> = ArrayList()
        listRowup.add("up")
        listRowup.add(countLEFT.toString())
        game.getListadoReport().add(listRowup)
        val listRowdown:ArrayList<String> = ArrayList()
        listRowdown.add("down")
        listRowdown.add(countDOWN.toString())
        game.getListadoReport().add(listRowdown)
    }
    fun insertReportInstructions(beforePossY:Int,beforePossX:Int,beforeType:ListMovePlay,item:ListMovePlay,startTableReport:Boolean,toke:ReportMoven){
        val moven:Boolean = (beforePossY!=game.getPossY() || beforePossX!=game.getPossX())
        if ( beforeType!= item
        ){
            if (moven){
                val listRow:ArrayList<String> = ArrayList()
                if (startTableReport){
                    val qualification:ArrayList<String> = ArrayList()
                    qualification.add("--REPORTE DE INSTRUCCIONES PARCIALES O TOTALMENTE EJECUTADAS--")
                    game.getListadoReport().add(qualification)
                    val listRowStart:ArrayList<String> = ArrayList()
                    listRowStart.add("Instrucción")
                    listRowStart.add("Línea")
                    listRowStart.add("Columna")
                    listRowStart.add("Tipo")
                    game.getListadoReport().add(listRowStart)
                }
                listRow.add(item.toString())
                listRow.add(toke.getY().toString())
                listRow.add(toke.getX().toString())
                listRow.add("Total")
                game.getListadoReport().add(listRow)
            }
            else{
                val listRow:ArrayList<String> = ArrayList()
                if (startTableReport){
                    val qualification:ArrayList<String> = ArrayList()
                    qualification.add("--REPORTE DE INSTRUCCIONES PARCIALES O TOTALMENTE EJECUTADAS--")
                    game.getListadoReport().add(qualification)
                    val listRowStart:ArrayList<String> = ArrayList()
                    listRowStart.add("Instrucción")
                    listRowStart.add("Línea")
                    listRowStart.add("Columna")
                    listRowStart.add("Tipo")
                    game.getListadoReport().add(listRowStart)
                }
                listRow.add(item.toString())
                listRow.add(toke.getY().toString())
                listRow.add(toke.getX().toString())
                listRow.add("Parcial")
                game.getListadoReport().add(listRow)
            }
        }
    }

    override fun doInBackground(vararg p0: Void?): String {
        runAnaly()
            return ""
    }


    override fun onPostExecute(result: String?) {
        game?.setListReportOperacion(this.listReportOperacion)
        game?.irReport()
    }
    public  fun  isRunAnaly():Boolean{return  this.runAnaly}
    fun getListReportOperaicon():ArrayList<ArrayList<String>>{
        return  this.listReportOperacion
    }
}