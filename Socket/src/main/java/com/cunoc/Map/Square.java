package com.cunoc.Map;

public class Square {

    private final int possX;
    private final int possY;
    private ListSquare type;

    public Square (ListSquare type,int possX,int possY){
        this.type = type;
        this.possX = possX;
        this.possY = possY;
    }

    public ListSquare getType() {
        return type;
    }

    
    public int getPossX() {
        return possX;
    }

    public int getPossY() {
        return possY;
    }

    public void setType(ListSquare type){
        this.type = type;
    }
    @Override
    public String toString() {
        return "PossX: "+this.possX+" PossY: "+this.possY + " Tipo : " +this.type.toString();
    }
    
}
