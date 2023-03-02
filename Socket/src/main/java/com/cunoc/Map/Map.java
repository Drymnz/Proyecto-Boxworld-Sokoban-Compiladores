package com.cunoc.Map;

import java.util.ArrayList;

public class Map {

    private final String name;
    private final int rows;
    private final int cols;
    private ArrayList<ArrayList<Square>> matrix = new ArrayList();
    private String BOX_COLOR = "#ffff00";
    private String BOX_ON_COLOR = "#fe0002";
    private String TARGET_COLOR = "#d6fe0a";
    private String BRICK_COLOR = "#bdbebf";
    private String HALL_COLOR = "#0001ff";
    private String UNDEFINED_COLOR = "#303030";
    private String PLAY_COLOR = "#ff00f7";

    public Map (String name, int rows , int cols){
        this.name = name;
        this.rows = rows;
        this.cols = cols;
        fillSquareUndefined();
    }

    private void fillSquareUndefined(){
        for (int index = 0; index < this.rows; index++) {
            matrix.add(new ArrayList<Square>());
            for (int i = 0; i < this.cols; i++) {
                matrix.get(index).add(new Square(ListSquare.UNDEFINED,i,index));
            }
        }
    }
    
    public Square getSquarePoss(int posX,int posY){
        if (posY > matrix.size() && matrix.get(posY).size() > posX) {
            return matrix.get(posY).get(posX);
        }
        return null;
    }

    public void setBOX_COLOR(String bOX_COLOR) {
        BOX_COLOR = bOX_COLOR;
    }

    public void setBOX_ON_COLOR(String bOX_ON_COLOR) {
        BOX_ON_COLOR = bOX_ON_COLOR;
    }

    public void setTARGET_COLOR(String tARGET_COLOR) {
        TARGET_COLOR = tARGET_COLOR;
    }

    public void setBRICK_COLOR(String bRICK_COLOR) {
        BRICK_COLOR = bRICK_COLOR;
    }

    public void setHALL_COLOR(String hALL_COLOR) {
        HALL_COLOR = hALL_COLOR;
    }

    public void setUNDEFINED_COLOR(String uNDEFINED_COLOR) {
        UNDEFINED_COLOR = uNDEFINED_COLOR;
    }

    public void setPLAY_COLOR(String pLAY_COLOR) {
        PLAY_COLOR = pLAY_COLOR;
    }

    public String getName() {
        return name;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public ArrayList<ArrayList<Square>> getMatrix() {
        return matrix;
    }

    public String getBOX_COLOR() {
        return BOX_COLOR;
    }

    public String getBOX_ON_COLOR() {
        return BOX_ON_COLOR;
    }

    public String getTARGET_COLOR() {
        return TARGET_COLOR;
    }

    public String getBRICK_COLOR() {
        return BRICK_COLOR;
    }

    public String getHALL_COLOR() {
        return HALL_COLOR;
    }

    public String getUNDEFINED_COLOR() {
        return UNDEFINED_COLOR;
    }

    public String getPLAY_COLOR() {
        return PLAY_COLOR;
    }

    
}
