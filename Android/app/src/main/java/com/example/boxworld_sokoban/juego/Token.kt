package com.example.boxworld_sokoban.juego

open class Token(x: Int, y: Int, lexeme: String?)  {
    private var x = 0
    private var y = 0
    private var lexeme: String? = null

    init{
        this.x = x
        this.y = y
        this.lexeme = lexeme
    }

    fun getX(): Int {
        return x
    }

    fun getY(): Int {
        return y
    }

    fun getLexeme(): String? {
        return lexeme
    }

    fun setLexeme(lexeme: String?) {
        this.lexeme = lexeme
    }

}