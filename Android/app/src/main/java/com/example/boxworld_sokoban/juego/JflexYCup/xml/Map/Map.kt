package com.example.boxworld_sokoban.juego.JflexYCup.xml.Map

import java.io.Serializable

class Map(name: String, rows: Int, cols: Int) : Serializable {
    private var name: String? = null
    private var rows = 0
    private var cols = 0
    private var matrix: ArrayList<ArrayList<Square>> = ArrayList()
    private var BOX_COLOR = "#ffff00"
    private var BOX_ON_COLOR = "#fe0002"
    private var TARGET_COLOR = "#d6fe0a"
    private var BRICK_COLOR = "#bdbebf"
    private var HALL_COLOR = "#0001ff"
    private var UNDEFINED_COLOR = "#303030"
    private var PLAY_COLOR = "#ff00f7"

    init {
        this.name = name
        this.rows = rows
        this.cols = cols
        fillSquareUndefined()
    }

    private fun fillSquareUndefined() {
        for (index in 0 until rows) {
            matrix.add(ArrayList<Square>())
            for (i in 0 until cols) {
                matrix[index].add(Square(ListSquare.UNDEFINED, i, index))
            }
        }
    }

    fun setBOX_COLOR(bOX_COLOR: String) {
        BOX_COLOR = bOX_COLOR
    }

    fun setBOX_ON_COLOR(bOX_ON_COLOR: String) {
        BOX_ON_COLOR = bOX_ON_COLOR
    }

    fun setTARGET_COLOR(tARGET_COLOR: String) {
        TARGET_COLOR = tARGET_COLOR
    }

    fun setBRICK_COLOR(bRICK_COLOR: String) {
        BRICK_COLOR = bRICK_COLOR
    }

    fun setHALL_COLOR(hALL_COLOR: String) {
        HALL_COLOR = hALL_COLOR
    }

    fun setUNDEFINED_COLOR(uNDEFINED_COLOR: String) {
        UNDEFINED_COLOR = uNDEFINED_COLOR
    }

    fun setPLAY_COLOR(pLAY_COLOR: String) {
        PLAY_COLOR = pLAY_COLOR
    }

    fun getName(): String? {
        return name
    }

    fun getRows(): Int {
        return rows
    }

    fun getCols(): Int {
        return cols
    }

    fun getMatrix(): ArrayList<ArrayList<Square>> {
        return matrix
    }

    fun getBOX_COLOR(): String? {
        return BOX_COLOR
    }

    fun getBOX_ON_COLOR(): String? {
        return BOX_ON_COLOR
    }

    fun getTARGET_COLOR(): String? {
        return TARGET_COLOR
    }

    fun getBRICK_COLOR(): String? {
        return BRICK_COLOR
    }

    fun getHALL_COLOR(): String? {
        return HALL_COLOR
    }

    fun getUNDEFINED_COLOR(): String? {
        return UNDEFINED_COLOR
    }

    fun getPLAY_COLOR(): String? {
        return PLAY_COLOR
    }

}