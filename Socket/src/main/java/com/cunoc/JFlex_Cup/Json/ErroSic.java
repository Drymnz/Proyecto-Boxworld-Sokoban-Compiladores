package com.cunoc.JFlex_Cup.Json;

import com.cunoc.JFlex_Cup.Token;

public class ErroSic extends Token{

    private ListError type ;

    public ErroSic(int x, int y, String lexeme,ListError type) {
        super(x, y, lexeme);
        this.type = type;
        //TODO Auto-generated constructor stub
    }

    public ListError getType() {
        return type;
    }
    
}
