package com.example.boxworld_sokoban.juego.JflexYCup.xml.Map

import java.io.Serializable

class Square(type: ListSquare, possX: Int, possY: Int): Serializable {

    private var possX = 0
    private var possY = 0
    private var type: ListSquare = ListSquare.UNDEFINED

    init{
        this.type = type
        this.possX = possX
        this.possY = possY
    }

    fun getType(): ListSquare {
        return type
    }


    fun getPossX(): Int {
        return possX
    }

    fun getPossY(): Int {
        return possY
    }

    fun setType(type: ListSquare) {
        this.type = type
    }

    override fun toString(): String {
        return "PossX: " + possX + " PossY: " + possY + " Tipo : " + type.toString()
    }

}