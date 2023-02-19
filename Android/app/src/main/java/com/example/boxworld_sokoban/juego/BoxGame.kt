package com.example.boxworld_sokoban.juego

import android.widget.ImageView

class BoxGame {

    private var type:ListBox = ListBox.UNDEFINED
    private lateinit var box:ImageView

    constructor(box:ImageView){
        this.box = box
    }

    constructor(type:ListBox,box:ImageView){
        this.box = box
        this.type = type
    }

    fun getType():ListBox {
        return this.type
    }

    fun getBox():ImageView{
        return this.box
    }

    fun setType(type:ListBox){
        this.type=type
    }

    fun setBox(box:ImageView){
        this.box=box
    }
}