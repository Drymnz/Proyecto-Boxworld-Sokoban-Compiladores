package com.example.boxworld_sokoban.juego

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

class Juego : AppCompatActivity() {

    private lateinit var table_game:TableLayout

    private val arrayList = ArrayList<ArrayList<View>>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_juego)

        //variable assignment
        table_game = findViewById<TableLayout>(R.id.table_game)

        testFillInBox()//test
        loadMap()//load map
    }
    //code for load map
    fun loadMap(){
        for (item in this.arrayList){
            val row_one_pruea:TableRow = TableRow(this)
            for(item_intern in item){
                row_one_pruea.addView(item_intern)
            }
            table_game.addView(row_one_pruea)
        }
    }

    //enter an int to select type of image to load
    fun createBox(type:Int): View {
        var returnBox:View = View(this)
        when (type) {
            1 -> // hall
                {
                    returnBox = ImageView(this)
                    returnBox.setImageResource(R.drawable.hall)
                    returnBox.setBackgroundColor(getColor(R.color.hall_color))
                }
            2 -> // box
                {
                    returnBox = ImageView(this)
                    returnBox.setImageResource(R.drawable.box)
                    returnBox.setBackgroundColor(getColor(R.color.box_color))
                }
            3 ->// target
                {
                    returnBox = ImageView(this)
                    val bitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_4444)
                    val canvas = Canvas(bitmap)
                    var paint = Paint()

                    // canvas background color
                    paint.setColor((getColor(R.color.undefined_color)))
                    // draw rect
                    canvas.drawRect(0F,0F,25F, 25F, paint)
                    //color circle
                    paint.setColor((getColor(R.color.target_color)))
                    // draw circle
                    canvas.drawCircle(25F, 25F, 20F, paint)
                    // set bitmap as background to ImageView
                    returnBox.background = BitmapDrawable(getResources(), bitmap)
                }
            4->//play
                {
                    returnBox = ImageView(this)
                    returnBox.setImageResource(R.drawable.play)
                    returnBox.setBackgroundColor(getColor(R.color.player_color))
                }
            5 -> // brick
                {
                    returnBox = ImageView(this)
                    returnBox.setImageResource(R.drawable.brick)
                    returnBox.setBackgroundColor(getColor(R.color.brick_color))
                }
            6 -> // undefined
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
        return returnBox
    }

    fun testFillInBox(){
        //test in draw
        // first row
        val row = ArrayList<View>()
        for (i in 0..9) {
            row.add(createBox(6))
        }
        //second row
        val row_one =ArrayList<View>()
        for (i in 0..2) {
            row_one.add(createBox(6))
        }
        for (i in 0..2) {
            row_one.add(createBox(5))
        }
        for (i in 0..3) {
            row_one.add(createBox(6))
        }
        //third row
        val row_tres = ArrayList<View>()
        for (i in 0..2) {
            row_tres.add(createBox(6))
        }
        row_tres.add(createBox(5))
        row_tres.add(createBox(3))
        row_tres.add(createBox(5))
        for (i in 0..3) {
            row_tres.add(createBox(6))
        }
        //fourth row
        val row_fiyrth = ArrayList<View>()
        for (i in 0..2) {
            row_fiyrth.add(createBox(6))
        }
        row_fiyrth.add(createBox(5))
        row_fiyrth.add(createBox(1))
        for (i in 0..3) {
            row_fiyrth.add(createBox(5))
        }
        row_fiyrth.add(createBox(6))
        //fifth row
        val row_fifth = ArrayList<View>()
        row_fifth.add(createBox(6))
        for (i in 0..2) {
            row_fifth.add(createBox(5))
        }
        row_fifth.add(createBox(2))
        row_fifth.add(createBox(1))
        row_fifth.add(createBox(2))
        row_fifth.add(createBox(3))
        row_fifth.add(createBox(5))
        row_fifth.add(createBox(6))

        //sixth row
        val row_sixth = ArrayList<View>()
        row_sixth.add(createBox(6))
        row_sixth.add(createBox(5))
        row_sixth.add(createBox(3))
        row_sixth.add(createBox(1))
        row_sixth.add(createBox(2))
        row_sixth.add(createBox(4))
        row_sixth.add(createBox(5))
        row_sixth.add(createBox(5))
        row_sixth.add(createBox(5))
        row_sixth.add(createBox(6))
        //siventh row
        val row_siventh = ArrayList<View>()
        row_siventh.add(createBox(6))
        for (i in 0..3) {
            row_siventh.add(createBox(5))
        }
        row_siventh.add(createBox(2))
        row_siventh.add(createBox(5))
        for (i in 0..2) {
            row_siventh.add(createBox(6))
        }
        //eighth row
        val row_eighth = ArrayList<View>()
        for (i in 0..3) {
            row_eighth.add(createBox(6))
        }
        row_eighth.add(createBox(5))
        row_eighth.add(createBox(3))
        row_eighth.add(createBox(5))
        for (i in 0..2) {
            row_eighth.add(createBox(6))
        }
        //ninth row
        val row_ninth = ArrayList<View>()
        for (i in 0..3) {
            row_ninth.add(createBox(6))
        }
        for (i in 0..2) {
            row_ninth.add(createBox(5))
        }
        for (i in 0..2) {
            row_ninth.add(createBox(6))
        }
        //tenth row
        val row_tenth = ArrayList<View>()
        for (i in 0..9) {
            row_tenth.add(createBox(6))
        }

        this.arrayList.add(row)
        this.arrayList.add(row_one)
        this.arrayList.add(row_tres)
        this.arrayList.add(row_fiyrth)
        this.arrayList.add(row_fifth)
        this.arrayList.add(row_sixth)
        this.arrayList.add(row_siventh)
        this.arrayList.add(row_eighth)
        this.arrayList.add(row_ninth)
        this.arrayList.add(row_tenth)
    }
}