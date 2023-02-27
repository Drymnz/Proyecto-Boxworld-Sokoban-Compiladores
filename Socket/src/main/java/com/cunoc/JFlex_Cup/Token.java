package com.cunoc.JFlex_Cup;

public class Token {
    private int x;
    private int y;
    private String lexeme;

    public Token(int x, int y, String lexeme) {
        this.x = x;
        this.y = y;
        this.lexeme = lexeme;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getLexeme() {
        return lexeme;
    }

    public void setLexeme(String lexeme) {
        this.lexeme = lexeme;
    }

}
