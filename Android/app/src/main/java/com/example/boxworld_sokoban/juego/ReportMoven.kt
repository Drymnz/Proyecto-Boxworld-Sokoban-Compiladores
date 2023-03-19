package com.example.boxworld_sokoban.juego

class ReportMoven (x: Int, y: Int, lexeme: String?,type:ListMovePlay) : Token (x, y, lexeme) {

    private var x = 0
    private var y = 0
    private var lexeme: String? = null
    private var type:ListMovePlay

    init{
        this.x = x
        this.y = y
        this.lexeme = lexeme
        this.type = type
    }

    fun getType():ListMovePlay{
        return this.type
    }
}