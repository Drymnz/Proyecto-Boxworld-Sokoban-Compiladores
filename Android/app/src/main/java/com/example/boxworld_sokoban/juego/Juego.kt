package com.example.boxworld_sokoban.juego

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.boxworld_sokoban.R
import com.example.boxworld_sokoban.juego.JflexYCup.xml.Map.ListSquare
import com.example.boxworld_sokoban.juego.JflexYCup.xml.Map.Map

class Juego : AppCompatActivity() {

    private lateinit var table_game:TableLayout
    private lateinit var play_game:View
    private var posXPlay:Int = 5
    private var posYPlay:Int = 5
    private var numBox:Int = 0

    private val listadoReprotes = ArrayList<ArrayList<String>>()
    private var listReportOperacion = ArrayList<ArrayList<String>>()

    fun getListadoReport():ArrayList<ArrayList<String>>{
        return this.listadoReprotes
    }
    fun setListReportOperacion(listReportOperacion : ArrayList<ArrayList<String>>)
    {
        this.listReportOperacion = listReportOperacion
    }
    /**
    IMPORTANTE IMPLMEMENTAR LO DE QUE EMPUJER UNA CAJA ACTIVA, ME POSICION EN EL TAGER Y DESPUES --> PUDE SER CON UN LISTADO DE TAGET IGUAL DE MANERA
     COMO RECORA SI HAY CAJAS ACTIVAS PARA NUM BOX Y LA VICTORIA
    * */

    fun getPossY():Int{return this.posYPlay}
    fun getPossX():Int{return this.posXPlay}
    private val listBoxGameMap = ArrayList<ArrayList<BoxGame>>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_juego)
        //variable assignment
        this.table_game = findViewById<TableLayout>(R.id.table_game)
        //
        val bundle = getIntent().getSerializableExtra("listado_reportes_mate")
        if (bundle!=null){
            convertMapToList(bundle as Map)
        }
        loadMap()//load mapW
        val nameTextField:AutoCompleteTextView = findViewById(R.id.TextGameMove)
        var buttonA:Button = findViewById(R.id.BotonCompiladorGame)
        //solucion
    }
    /**
     * code for load map
    * */
    public fun loadMap(){
        for (item in this.listBoxGameMap){
            val row_one_pruea:TableRow = TableRow(this)
            for(item_intern in item){
                row_one_pruea.addView(item_intern.getBox())
            }
            table_game.addView(row_one_pruea)
        }
    }
    /**
     * @Map to list
     * convert a map to a table listing
     * ****/
    private fun convertMapToList(map: Map){
        for(possY in 0..(map.getRows() - 1)) {
            val row = ArrayList<BoxGame>()
            for(possX in 0..(map.getCols() - 1)) {
                val selec: ListSquare = map.getMatrix().get(possY).get(possX).getType()
                when (selec) {
                    ListSquare.BOX -> {
                        row.add(createBox(ListBox.BOX))
                    }
                    ListSquare.HALL -> {
                        row.add(createBox(ListBox.HALL))
                    }
                    ListSquare.BRICK -> {
                        row.add(createBox(ListBox.BRICK))
                    }
                    ListSquare.TARGET -> {
                        row.add(createBox(ListBox.TARGET))
                    }
                    ListSquare.PLAY -> {
                        row.add(createBox(ListBox.PLAY))
                        this.posXPlay = possX
                        this.posYPlay = possY
                    }
                    ListSquare.UNDEFINED -> {
                        row.add(createBox(ListBox.UNDEFINED))
                    }
                    else -> {

                    }
                }
            }
            this.listBoxGameMap.add(row)
        }
    }

    /**
     * enter a ListBox type to receive a BoxGame of the requested type
     * @ListBox
     * */
    @SuppressLint("SuspiciousIndentation")
    private fun createBox(type:ListBox): BoxGame {
        var returnBox:ImageView = ImageView(this)
            when (type) {
            ListBox.HALL -> // hall
                {
                    returnBox.setImageResource(R.drawable.hall)
                    returnBox.setBackgroundColor(getColor(R.color.hall_color))
                }
            ListBox.BOX -> // box
                {
                    returnBox.setImageResource(R.drawable.box)
                    returnBox.setBackgroundColor(getColor(R.color.box_color))
                    this.numBox++
                }
            ListBox.TARGET ->// target
                {
                    returnBox.setImageResource(R.drawable.target)
                    returnBox.setBackgroundColor(getColor(R.color.target_color))
                }
            ListBox.PLAY->//play
                {
                    returnBox.setImageResource(R.drawable.play)
                    returnBox.setBackgroundColor(getColor(R.color.player_color))
                    this.play_game = returnBox
                }
            ListBox.BRICK -> // brick
                {
                    returnBox.setImageResource(R.drawable.brick)
                    returnBox.setBackgroundColor(getColor(R.color.brick_color))
                }
            ListBox.UNDEFINED -> // undefined
                {
                    val bitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_4444)
                    val canvas = Canvas(bitmap)
                    //color
                    var paint = Paint()
                    paint.setColor((getColor(R.color.undefined_color)))
                    // draw rect
                    canvas.drawRect(0F,0F,50F, 50F, paint)
                    // set bitmap as background to ImageView
                    returnBox.background = BitmapDrawable(getResources(), bitmap)
                }
                else -> {

                }
            }
        var newBoxGame = BoxGame(type,returnBox)
        return newBoxGame
    }
    /**
     * enter a ListBox for move the player
     **/
    public fun moverPlay (type:ListMovePlay){
        when (type) {
            ListMovePlay.TOP->//top
            {
                if(this.posYPlay>0 && (
                            this.listBoxGameMap.get(this.posYPlay-1).get(this.posXPlay).getType()==ListBox.HALL
                                    ||
                                    this.listBoxGameMap.get(this.posYPlay-1).get(this.posXPlay).getType()==ListBox.TARGET
                            )){
                    val isTarget:Boolean = this.listBoxGameMap.get(this.posYPlay-1).get(this.posXPlay).getType()==ListBox.TARGET
                    switchBoxGame(this.posYPlay,this.posXPlay,this.posYPlay-1,this.posXPlay)
                    if(isTarget){
                        this.listBoxGameMap.get(this.posYPlay).get(this.posXPlay).setType(ListBox.HALL)
                        this.listBoxGameMap.get(this.posYPlay).get(this.posXPlay).getBox().setImageResource(R.drawable.hall)
                        this.listBoxGameMap.get(this.posYPlay).get(this.posXPlay).getBox().setBackgroundColor(getColor(R.color.hall_color))
                        this.listBoxGameMap.get(this.posYPlay-1).get(this.posXPlay).setType(ListBox.TARGET)
                    }
                    this.posYPlay--
                }else {
                    Log.d("Class-Juego_Metodo_moverPlay","No se puede mover arriba,ostaculo")
                }
            }
            ListMovePlay.LEFT->//top
            {
                if(this.posXPlay>0 && (
                            this.listBoxGameMap.get(this.posYPlay).get(this.posXPlay-1).getType()==ListBox.HALL
                                    ||
                                    this.listBoxGameMap.get(this.posYPlay).get(this.posXPlay-1).getType()==ListBox.TARGET
                            ))
                {
                    val isTarget:Boolean = this.listBoxGameMap.get(this.posYPlay).get(this.posXPlay-1).getType()==ListBox.TARGET
                    switchBoxGame(this.posYPlay,this.posXPlay,this.posYPlay,this.posXPlay-1)
                    if(isTarget){
                        this.listBoxGameMap.get(this.posYPlay).get(this.posXPlay).setType(ListBox.HALL)
                        this.listBoxGameMap.get(this.posYPlay).get(this.posXPlay).getBox().setImageResource(R.drawable.hall)
                        this.listBoxGameMap.get(this.posYPlay).get(this.posXPlay).getBox().setBackgroundColor(getColor(R.color.hall_color))
                        this.listBoxGameMap.get(this.posYPlay).get(this.posXPlay-1).setType(ListBox.TARGET)
                    }
                    this.posXPlay--
                }else {
                    Log.d("Class-Juego_Metodo_moverPlay","No se puede mover arriba")
                }
            }
            ListMovePlay.DOWN ->
            {
                if(this.posYPlay < this.listBoxGameMap.size && (
                            this.listBoxGameMap.get(this.posYPlay+1).get(this.posXPlay).getType()==ListBox.HALL
                                    ||
                                    this.listBoxGameMap.get(this.posYPlay+1).get(this.posXPlay).getType()==ListBox.TARGET
                            ))
                {
                    val isTarget:Boolean = this.listBoxGameMap.get(this.posYPlay+1).get(this.posXPlay).getType()==ListBox.TARGET
                    switchBoxGame(this.posYPlay,this.posXPlay,this.posYPlay+1,this.posXPlay)
                    if(isTarget){
                        this.listBoxGameMap.get(this.posYPlay).get(this.posXPlay).setType(ListBox.HALL)
                        this.listBoxGameMap.get(this.posYPlay).get(this.posXPlay).getBox().setImageResource(R.drawable.hall)
                        this.listBoxGameMap.get(this.posYPlay).get(this.posXPlay).getBox().setBackgroundColor(getColor(R.color.hall_color))
                        this.listBoxGameMap.get(this.posYPlay+1).get(this.posXPlay).setType(ListBox.TARGET)
                    }
                    this.posYPlay++
                }else {
                    Log.d("Class-Juego_Metodo_moverPlay","No se puede mover abajo")
                }
            }
            ListMovePlay.RIGHT->
            {
                if(this.posXPlay<this.listBoxGameMap.get(this.posYPlay).size && (
                            this.listBoxGameMap.get(this.posYPlay).get(this.posXPlay+1).getType()==ListBox.HALL
                                    ||
                                    this.listBoxGameMap.get(this.posYPlay).get(this.posXPlay+1).getType()==ListBox.TARGET
                            ))
                {
                    val isTarget:Boolean = this.listBoxGameMap.get(this.posYPlay).get(this.posXPlay+1).getType()==ListBox.TARGET
                    switchBoxGame(this.posYPlay,this.posXPlay,this.posYPlay,(this.posXPlay+1))
                    if(isTarget){
                        this.listBoxGameMap.get(this.posYPlay).get(this.posXPlay).setType(ListBox.HALL)
                        this.listBoxGameMap.get(this.posYPlay).get(this.posXPlay).getBox().setImageResource(R.drawable.hall)
                        this.listBoxGameMap.get(this.posYPlay).get(this.posXPlay).getBox().setBackgroundColor(getColor(R.color.hall_color))
                        this.listBoxGameMap.get(this.posYPlay).get(this.posXPlay+1).setType(ListBox.TARGET)
                    }
                    this.posXPlay++
                }else {
                    Log.d("Class-Juego_Metodo_moverPlay","No se puede mover arriba")
                }
            }
            ListMovePlay.PUSH_DOWN->
            {
                if ((this.posYPlay+2) < this.listBoxGameMap.size){
                    if (this.listBoxGameMap.get(this.posYPlay+1).get(this.posXPlay).getType()==ListBox.BOX){
                        if(//the box will put in a hall
                            this.listBoxGameMap.get(this.posYPlay+2).get(this.posXPlay).getType()==ListBox.HALL
                            ||//or the box will put in a target
                            this.listBoxGameMap.get(this.posYPlay+2).get(this.posXPlay).getType()==ListBox.TARGET
                        ){
                            if(this.listBoxGameMap.get(this.posYPlay+2).get(this.posXPlay).getType()==ListBox.TARGET){// if is a target
                                this.listBoxGameMap.get(this.posYPlay+2).get(this.posXPlay).getBox().setBackgroundColor(getColor(R.color.box_on_target_color))
                            }else{//if is a hall
                                this.listBoxGameMap.get(this.posYPlay+2).get(this.posXPlay).getBox().setBackgroundColor(getColor(R.color.box_color))
                            }
                            this.listBoxGameMap.get(this.posYPlay+2).get(this.posXPlay).getBox().setImageResource(R.drawable.box)
                            this.listBoxGameMap.get(this.posYPlay+2).get(this.posXPlay).setType(ListBox.BOX)
                            this.listBoxGameMap.get(this.posYPlay+1).get(this.posXPlay).setType(ListBox.HALL)
                            moverPlay(ListMovePlay.DOWN)
                        }else{
                            Log.d("Class-Juego_Metodo_moverPlay","No hay espacio")
                        }
                    }else{
                        Log.d("Class-Juego_Metodo_moverPlay","No es una caja")
                    }
                }else{
                    Log.d("Class-Juego_Metodo_moverPlay","no se puede empujar")
                }
            }
            ListMovePlay.PUSH_TOP->
            {
                if ((this.posYPlay-2) > 0){
                    if (this.listBoxGameMap.get(this.posYPlay-1).get(this.posXPlay).getType()==ListBox.BOX){
                        if(//the box will put in a hall
                            this.listBoxGameMap.get(this.posYPlay-2).get(this.posXPlay).getType()==ListBox.HALL
                            ||//or the box will put in a target
                            this.listBoxGameMap.get(this.posYPlay-2).get(this.posXPlay).getType()==ListBox.TARGET
                        ){
                            if(this.listBoxGameMap.get(this.posYPlay-2).get(this.posXPlay).getType()==ListBox.TARGET){// if is a target
                                this.listBoxGameMap.get(this.posYPlay-2).get(this.posXPlay).getBox().setBackgroundColor(getColor(R.color.box_on_target_color))
                            }else{//if is a hall
                                this.listBoxGameMap.get(this.posYPlay-2).get(this.posXPlay).getBox().setBackgroundColor(getColor(R.color.box_color))
                            }
                            this.listBoxGameMap.get(this.posYPlay-2).get(this.posXPlay).getBox().setImageResource(R.drawable.box)
                            this.listBoxGameMap.get(this.posYPlay-2).get(this.posXPlay).setType(ListBox.BOX)
                            this.listBoxGameMap.get(this.posYPlay-1).get(this.posXPlay).setType(ListBox.HALL)
                            moverPlay(ListMovePlay.TOP)
                        }else{
                            Log.d("Class-Juego_Metodo_moverPlay","No hay espacio")
                        }
                    }else{
                        Log.d("Class-Juego_Metodo_moverPlay","No es una caja")
                    }
                }else{
                    Log.d("Class-Juego_Metodo_moverPlay","no se puede empujar")
                }
            }
            ListMovePlay.PUSH_RIGHT->
            {
                if ((this.posXPlay+2) < this.listBoxGameMap.get(this.posYPlay).size){
                    if (this.listBoxGameMap.get(this.posYPlay).get(this.posXPlay+1).getType()==ListBox.BOX){
                        if(//the box will put in a hall
                            this.listBoxGameMap.get(this.posYPlay).get(this.posXPlay+2).getType()==ListBox.HALL
                            ||//or the box will put in a target
                            this.listBoxGameMap.get(this.posYPlay).get(this.posXPlay+2).getType()==ListBox.TARGET
                        ){
                            if(this.listBoxGameMap.get(this.posYPlay).get(this.posXPlay+2).getType()==ListBox.TARGET){// if is a target
                                this.listBoxGameMap.get(this.posYPlay).get(this.posXPlay+2).getBox().setBackgroundColor(getColor(R.color.box_on_target_color))
                            }else{//if is a hall
                                this.listBoxGameMap.get(this.posYPlay).get(this.posXPlay+2).getBox().setBackgroundColor(getColor(R.color.box_color))
                            }
                            this.listBoxGameMap.get(this.posYPlay).get(this.posXPlay+2).getBox().setImageResource(R.drawable.box)
                            this.listBoxGameMap.get(this.posYPlay).get(this.posXPlay+2).setType(ListBox.BOX)
                            this.listBoxGameMap.get(this.posYPlay).get(this.posXPlay+1).setType(ListBox.HALL)
                            moverPlay(ListMovePlay.RIGHT)
                        }else{
                            Log.d("Class-Juego_Metodo_moverPlay","No hay espacio")
                        }
                    }else{
                        Log.d("Class-Juego_Metodo_moverPlay","No es una caja")
                    }
                }else{
                    Log.d("Class-Juego_Metodo_moverPlay","no se puede empujar")
                }
            }
            ListMovePlay.PUSH_LEFT->
            {
                if ((this.posXPlay-2) > 0){
                    if (this.listBoxGameMap.get(this.posYPlay).get(this.posXPlay-1).getType()==ListBox.BOX){
                        if(//the box will put in a hall
                            this.listBoxGameMap.get(this.posYPlay).get(this.posXPlay-2).getType()==ListBox.HALL
                            ||//or the box will put in a target
                            this.listBoxGameMap.get(this.posYPlay).get(this.posXPlay-2).getType()==ListBox.TARGET
                        ){
                            if(this.listBoxGameMap.get(this.posYPlay).get(this.posXPlay-2).getType()==ListBox.TARGET){// if is a target
                                this.listBoxGameMap.get(this.posYPlay).get(this.posXPlay-2).getBox().setBackgroundColor(getColor(R.color.box_on_target_color))
                            }else{//if is a hall
                                this.listBoxGameMap.get(this.posYPlay).get(this.posXPlay-2).getBox().setBackgroundColor(getColor(R.color.box_color))
                            }
                            this.listBoxGameMap.get(this.posYPlay).get(this.posXPlay-2).getBox().setImageResource(R.drawable.box)
                            this.listBoxGameMap.get(this.posYPlay).get(this.posXPlay-2).setType(ListBox.BOX)
                            this.listBoxGameMap.get(this.posYPlay).get(this.posXPlay-1).setType(ListBox.HALL)
                            moverPlay(ListMovePlay.LEFT)
                        }else{
                            Log.d("Class-Juego_Metodo_moverPlay","No hay espacio")
                        }
                    }else{
                        Log.d("Class-Juego_Metodo_moverPlay","No es una caja")
                    }
                }else{
                    Log.d("Class-Juego_Metodo_moverPlay","no se puede empujar")
                }
            }
            else ->
            {

            }
        }
    }

    /**
     * change of box
    @befeorePosY
    @befeorePosX
    @nextPosY
    @nextPosx
    * */
    private fun switchBoxGame(beforePosY:Int,beforePosX:Int,nextPosY:Int,nextPosX:Int){
        var before:ListBox = this.listBoxGameMap.get(beforePosY).get(beforePosX).getType()
                    when (this.listBoxGameMap.get(nextPosY).get(nextPosX).getType())
            {
                ListBox.HALL->
                {
                    this.listBoxGameMap.get(beforePosY).get(beforePosX).getBox().setImageResource(R.drawable.hall)
                    this.listBoxGameMap.get(beforePosY).get(beforePosX).getBox().setBackgroundColor(getColor(R.color.hall_color))
                    this.listBoxGameMap.get(beforePosY).get(beforePosX).setType(ListBox.HALL)
                }
                ListBox.BOX->
                {
                    this.listBoxGameMap.get(beforePosY).get(beforePosX).getBox().setImageResource(R.drawable.box)
                    this.listBoxGameMap.get(beforePosY).get(beforePosX).getBox().setBackgroundColor(getColor(R.color.box_color))
                    this.listBoxGameMap.get(beforePosY).get(beforePosX).setType(ListBox.BOX)
                }
                ListBox.TARGET->{
                    this.listBoxGameMap.get(beforePosY).get(beforePosX).getBox().setImageResource(R.drawable.target)
                    this.listBoxGameMap.get(beforePosY).get(beforePosX).getBox().setBackgroundColor(getColor(R.color.target_color))
                    this.listBoxGameMap.get(beforePosY).get(beforePosX).setType(ListBox.TARGET)
                }
                ListBox.BRICK->
                {
                    this.listBoxGameMap.get(beforePosY).get(beforePosX).getBox().setImageResource(R.drawable.brick)
                    this.listBoxGameMap.get(beforePosY).get(beforePosX).getBox().setBackgroundColor(getColor(R.color.brick_color))
                    this.listBoxGameMap.get(beforePosY).get(beforePosX).setType(ListBox.BRICK)
                }
                ListBox.PLAY ->
                {
                    this.listBoxGameMap.get(beforePosY).get(beforePosX).getBox().setImageResource(R.drawable.play)
                    this.listBoxGameMap.get(beforePosY).get(beforePosX).getBox().setBackgroundColor(getColor(R.color.player_color))
                    this.listBoxGameMap.get(beforePosY).get(beforePosX).setType(ListBox.PLAY)
                }
                else -> {
                    Log.d("Class-Juego_Metodo_switchBoxGame","No se puede mover arriba")
                }
            }
        when (before) {
            ListBox.HALL->
            {
                this.listBoxGameMap.get(nextPosY).get(nextPosX).getBox().setImageResource(R.drawable.hall)
                this.listBoxGameMap.get(nextPosY).get(nextPosX).getBox().setBackgroundColor(getColor(R.color.hall_color))
                this.listBoxGameMap.get(nextPosY).get(nextPosX).setType(ListBox.HALL)
            }
            ListBox.BOX->
            {
                this.listBoxGameMap.get(nextPosY).get(nextPosX).getBox().setImageResource(R.drawable.box)
                this.listBoxGameMap.get(nextPosY).get(nextPosX).getBox().setBackgroundColor(getColor(R.color.box_color))
                this.listBoxGameMap.get(nextPosY).get(nextPosX).setType(ListBox.BOX)
            }
            ListBox.TARGET->{
                this.listBoxGameMap.get(nextPosY).get(nextPosX).getBox().setImageResource(R.drawable.target)
                this.listBoxGameMap.get(nextPosY).get(nextPosX).getBox().setBackgroundColor(getColor(R.color.target_color))
                this.listBoxGameMap.get(nextPosY).get(nextPosX).setType(ListBox.TARGET)
            }
            ListBox.BRICK->
            {
                this.listBoxGameMap.get(nextPosY).get(nextPosX).getBox().setImageResource(R.drawable.brick)
                this.listBoxGameMap.get(nextPosY).get(nextPosX).getBox().setBackgroundColor(getColor(R.color.brick_color))
                this.listBoxGameMap.get(nextPosY).get(nextPosX).setType(ListBox.BRICK)
            }
            ListBox.PLAY ->
            {
                this.listBoxGameMap.get(nextPosY).get(nextPosX).getBox().setImageResource(R.drawable.play)
                this.listBoxGameMap.get(nextPosY).get(nextPosX).getBox().setBackgroundColor(getColor(R.color.player_color))
                this.listBoxGameMap.get(nextPosY).get(nextPosX).setType(ListBox.PLAY)
            }
            else -> {
                Log.d("Class-Juego_Metodo_switchBoxGame","No se puede mover arriba")
            }
        }
    }
    /**
     * analyze and move the player
    * */
    fun analisar(view: View){
        val nameTextField:AutoCompleteTextView = findViewById(R.id.TextGameMove)
        var anly:Analyze = Analyze(nameTextField.text.toString(),this)
        findViewById<Button>(R.id.BotonCompiladorGame).setEnabled(false)
        //anly.runAnaly()
        anly.execute()
    }

    fun irReport(){
        table_game.removeAllViews()
        findViewById<AutoCompleteTextView>(R.id.TextGameMove).setVisibility(View.GONE)
        findViewById<Button>(R.id.BotonCompiladorGame).setVisibility(View.GONE)
        inserTableString(this.listadoReprotes)
        inserTableString(this.listReportOperacion)
    }
    fun inserTableString(list : ArrayList<ArrayList<String>>){
        for (item in list){
            val row_one_pruea: TableRow = TableRow(this)
            for(item_intern in item){
                val textView:TextView = TextView(this)
                textView.setText(item_intern)
                row_one_pruea.addView(textView)
            }
            table_game.addView(row_one_pruea)
        }
    }
}


