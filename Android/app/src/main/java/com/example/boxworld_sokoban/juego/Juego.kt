package com.example.boxworld_sokoban.juego

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TableLayout
import android.widget.TableRow
import androidx.appcompat.app.AppCompatActivity
import com.example.boxworld_sokoban.R

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.drawable.BitmapDrawable
import android.util.Log

class Juego : AppCompatActivity() {

    private lateinit var table_game:TableLayout
    private lateinit var play_game:View
    private var posXPlay:Int = 5
    private var posYPlay:Int = 5

    private val listBoxGameMap = ArrayList<ArrayList<BoxGame>>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_juego)

        //variable assignment
        this.table_game = findViewById<TableLayout>(R.id.table_game)


        testFillInBox()//test
        loadMap()//load map
        //moverPlay(ListMovePlay.PUSH_DOWN)
        moverPlay(ListMovePlay.TOP)
        moverPlay(ListMovePlay.DOWN)
        moverPlay(ListMovePlay.LEFT)
        moverPlay(ListMovePlay.RIGHT)
        moverPlay(ListMovePlay.PUSH_DOWN)
    }
    //code for load map
    fun loadMap(){
        for (item in this.listBoxGameMap){
            val row_one_pruea:TableRow = TableRow(this)
            for(item_intern in item){
                row_one_pruea.addView(item_intern.getBox())
            }
            table_game.addView(row_one_pruea)
        }
    }

    //enter an int to select type of image to load
    @SuppressLint("SuspiciousIndentation")
    fun createBox(type:ListBox): BoxGame {
        var returnBox:ImageView = ImageView(this)
            when (type) {
            ListBox.HALL -> // hall
                {
                    returnBox = ImageView(this)
                    returnBox.setImageResource(R.drawable.hall)
                    returnBox.setBackgroundColor(getColor(R.color.hall_color))
                }
            ListBox.BOX -> // box
                {
                    returnBox = ImageView(this)
                    returnBox.setImageResource(R.drawable.box)
                    returnBox.setBackgroundColor(getColor(R.color.box_color))
                }
            ListBox.TARGET ->// target
                {
                    returnBox = ImageView(this)
                    returnBox.setImageResource(R.drawable.target)
                    returnBox.setBackgroundColor(getColor(R.color.target_color))
                }
            ListBox.PLAY->//play
                {
                    returnBox = ImageView(this)
                    returnBox.setImageResource(R.drawable.play)
                    returnBox.setBackgroundColor(getColor(R.color.player_color))
                    this.play_game = returnBox
                }
            ListBox.BRICK -> // brick
                {
                    returnBox = ImageView(this)
                    returnBox.setImageResource(R.drawable.brick)
                    returnBox.setBackgroundColor(getColor(R.color.brick_color))
                }
            ListBox.UNDEFINED -> // undefined
                {
                    returnBox = ImageView(this)
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
        }
        var newBoxGame = BoxGame(type,returnBox)
        return newBoxGame
    }

    fun testFillInBox(){
        //test in draw
        // first row
        val row = ArrayList<BoxGame>()
        for (i in 0..9) {
            row.add(createBox(ListBox.UNDEFINED))
        }
        //second row
        val row_one =ArrayList<BoxGame>()
        for (i in 0..2) {
            row_one.add(createBox(ListBox.UNDEFINED))
        }
        for (i in 0..2) {
            row_one.add(createBox(ListBox.BRICK))
        }
        for (i in 0..3) {
            row_one.add(createBox(ListBox.UNDEFINED))
        }
        //third row
        val row_tres = ArrayList<BoxGame>()
        for (i in 0..2) {
            row_tres.add(createBox(ListBox.UNDEFINED))
        }
        row_tres.add(createBox(ListBox.BRICK))
        row_tres.add(createBox(ListBox.TARGET))
        row_tres.add(createBox(ListBox.BRICK))
        for (i in 0..3) {
            row_tres.add(createBox(ListBox.UNDEFINED))
        }
        //fourth row
        val row_fiyrth = ArrayList<BoxGame>()
        for (i in 0..2) {
            row_fiyrth.add(createBox(ListBox.UNDEFINED))
        }
        row_fiyrth.add(createBox(ListBox.BRICK))
        row_fiyrth.add(createBox(ListBox.HALL))
        for (i in 0..3) {
            row_fiyrth.add(createBox(ListBox.BRICK))
        }
        row_fiyrth.add(createBox(ListBox.UNDEFINED))
        //fifth row
        val row_fifth = ArrayList<BoxGame>()
        row_fifth.add(createBox(ListBox.UNDEFINED))
        for (i in 0..2) {
            row_fifth.add(createBox(ListBox.BRICK))
        }
        row_fifth.add(createBox(ListBox.BOX))
        row_fifth.add(createBox(ListBox.HALL))
        row_fifth.add(createBox(ListBox.BOX))
        row_fifth.add(createBox(ListBox.TARGET))
        row_fifth.add(createBox(ListBox.BRICK))
        row_fifth.add(createBox(ListBox.UNDEFINED))

        //sixth row
        val row_sixth = ArrayList<BoxGame>()
        row_sixth.add(createBox(ListBox.UNDEFINED))
        row_sixth.add(createBox(ListBox.BRICK))
        row_sixth.add(createBox(ListBox.TARGET))
        row_sixth.add(createBox(ListBox.HALL))
        row_sixth.add(createBox(ListBox.BOX))
        row_sixth.add(createBox(ListBox.PLAY))
        row_sixth.add(createBox(ListBox.BRICK))
        row_sixth.add(createBox(ListBox.BRICK))
        row_sixth.add(createBox(ListBox.BRICK))
        row_sixth.add(createBox(ListBox.UNDEFINED))
        //siventh row
        val row_siventh = ArrayList<BoxGame>()
        row_siventh.add(createBox(ListBox.UNDEFINED))
        for (i in 0..3) {
            row_siventh.add(createBox(ListBox.BRICK))
        }
        row_siventh.add(createBox(ListBox.BOX))
        row_siventh.add(createBox(ListBox.BRICK))
        for (i in 0..2) {
            row_siventh.add(createBox(ListBox.UNDEFINED))
        }
        //eighth row
        val row_eighth = ArrayList<BoxGame>()
        for (i in 0..3) {
            row_eighth.add(createBox(ListBox.UNDEFINED))
        }
        row_eighth.add(createBox(ListBox.BRICK))
        row_eighth.add(createBox(ListBox.TARGET))
        row_eighth.add(createBox(ListBox.BRICK))
        for (i in 0..2) {
            row_eighth.add(createBox(ListBox.UNDEFINED))
        }
        //ninth row
        val row_ninth = ArrayList<BoxGame>()
        for (i in 0..3) {
            row_ninth.add(createBox(ListBox.UNDEFINED))
        }
        for (i in 0..2) {
            row_ninth.add(createBox(ListBox.BRICK))
        }
        for (i in 0..2) {
            row_ninth.add(createBox(ListBox.UNDEFINED))
        }
        //tenth row
        val row_tenth = ArrayList<BoxGame>()
        for (i in 0..9) {
            row_tenth.add(createBox(ListBox.UNDEFINED))
        }

        this.listBoxGameMap.add(row)
        this.listBoxGameMap.add(row_one)
        this.listBoxGameMap.add(row_tres)
        this.listBoxGameMap.add(row_fiyrth)
        this.listBoxGameMap.add(row_fifth)
        this.listBoxGameMap.add(row_sixth)
        this.listBoxGameMap.add(row_siventh)
        this.listBoxGameMap.add(row_eighth)
        this.listBoxGameMap.add(row_ninth)
        this.listBoxGameMap.add(row_tenth)
    }

    fun moverPlay (type:ListMovePlay){
        when (type) {
            ListMovePlay.TOP->//top
            {
                if(this.posYPlay>0 ){
                    switchBoxGame(this.posYPlay,this.posXPlay,this.posYPlay-1,this.posXPlay)
                    this.posYPlay--
                }else {
                    Log.d("Class-Juego_Metodo_moverPlay","No se puede mover arriba")
                }
            }
            ListMovePlay.LEFT->//top
            {
                if(this.posXPlay>0 ){
                    switchBoxGame(this.posYPlay,this.posXPlay,this.posYPlay,this.posXPlay-1)
                    this.posXPlay--
                }else {
                    Log.d("Class-Juego_Metodo_moverPlay","No se puede mover arriba")
                }
            }
            ListMovePlay.DOWN ->
            {
                if(this.posYPlay < this.listBoxGameMap.size){
                    switchBoxGame(this.posYPlay,this.posXPlay,this.posYPlay+1,this.posXPlay)
                    this.posYPlay++
                }else {
                    Log.d("Class-Juego_Metodo_moverPlay","No se puede mover abajo")
                }
            }
            ListMovePlay.RIGHT->
            {
                if(this.posXPlay<this.listBoxGameMap.get(this.posYPlay).size ){
                    switchBoxGame(this.posYPlay,this.posXPlay,this.posYPlay,(this.posXPlay+1))
                    this.posXPlay++
                }else {
                    Log.d("Class-Juego_Metodo_moverPlay","No se puede mover arriba")
                }
            }
            ListMovePlay.PUSH_DOWN->
            {
                if ((this.posYPlay+1) < this.listBoxGameMap.size){
                    if (this.listBoxGameMap.get(this.posYPlay+1).get(this.posXPlay).getType()==ListBox.BOX){
                        if(//the box will put in a hall
                            this.listBoxGameMap.get(this.posYPlay+2).get(this.posXPlay).getType()==ListBox.HALL
                            ||//or the box will put in a target
                            this.listBoxGameMap.get(this.posYPlay+2).get(this.posXPlay).getType()==ListBox.TARGET
                        ){
                            if(this.listBoxGameMap.get(this.posYPlay+2).get(this.posXPlay).getType()==ListBox.TARGET){// if is a target
                                this.listBoxGameMap.get(this.posYPlay+2).get(this.posXPlay).getBox().setImageResource(R.drawable.box)
                                this.listBoxGameMap.get(this.posYPlay+2).get(this.posXPlay).getBox().setBackgroundColor(getColor(R.color.box_on_target_color))
                                this.listBoxGameMap.get(this.posYPlay+2).get(this.posXPlay).setType(ListBox.BOX)
                                this.listBoxGameMap.get(this.posYPlay+1).get(this.posXPlay).setType(ListBox.HALL)
                            }else{//if is a hall
                                this.listBoxGameMap.get(this.posYPlay+2).get(this.posXPlay).getBox().setImageResource(R.drawable.hall)
                                this.listBoxGameMap.get(this.posYPlay+2).get(this.posXPlay).getBox().setBackgroundColor(getColor(R.color.hall_color))
                                this.listBoxGameMap.get(this.posYPlay+2).get(this.posXPlay).setType(ListBox.HALL)
                                this.listBoxGameMap.get(this.posYPlay+1).get(this.posXPlay).setType(ListBox.HALL)
                            }
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
            else ->
            {

            }
        }
    }

    fun switchBoxGame(beforePosX:Int,beforePosY:Int,nextPosY:Int,nextPosX:Int){
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
}

