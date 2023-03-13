package com.cunoc.Converter;

import java.util.ArrayList;

import com.cunoc.Map.ListSquare;
import com.cunoc.Map.Map;
import com.cunoc.Map.Square;

public class MapToString {

    private final Map converter;
    private String resultFianal;

    public MapToString(Map converter) {
        this.converter = converter;
        converter();
    }

    private void converter() {
        this.resultFianal = "\t<world>\n";
        this.resultFianal += this.waxSimple(this.converter.getName(), "name");
        this.resultFianal += this.waxSimple(this.converter.getRows() + "", "rows");
        this.resultFianal += this.waxSimple(this.converter.getCols() + "", "cols");
        this.resultFianal += "\t\t<config>\n";
        this.resultFianal += "\t\t"+this.waxSimple(this.converter.getBOX_COLOR(), "box_color");
        this.resultFianal += "\t\t"+this.waxSimple(this.converter.getBOX_ON_COLOR(), "box_on_target_color");
        this.resultFianal += "\t\t"+this.waxSimple(this.converter.getTARGET_COLOR(), "target_color");
        this.resultFianal += "\t\t"+this.waxSimple(this.converter.getBRICK_COLOR(), "brick_color");
        this.resultFianal += "\t\t"+this.waxSimple(this.converter.getHALL_COLOR(), "hall_color");
        this.resultFianal += "\t\t"+this.waxSimple(this.converter.getUNDEFINED_COLOR(), "undefined_color");
        this.resultFianal += "\t\t"+this.waxSimple(this.converter.getPLAY_COLOR(), "player_color");
        this.resultFianal += "\t\t</config>";
        this.resultFianal += this.listSquare();
        this.resultFianal += "\n\t</world>";
    }

    private String waxSimple(String between, String sides) {
        return "\t\t<" + sides + ">" + between + "</" + sides + ">"+ "\n";
    }

    private String listSquare() {
        String returnFinal = "\n";
        for (ArrayList<Square> item_list : this.converter.getMatrix()) {
            for (Square item_Square : item_list) {
                returnFinal += startTypeBox(item_Square.getType());
                returnFinal += "\t"+this.waxSimple(item_Square.getPossX() + "", "posX");
                returnFinal += "\t"+this.waxSimple(item_Square.getPossY() + "", "posY");
                returnFinal += endTypeBox(item_Square.getType());
            }
        }
        return returnFinal;
    }

    private String startTypeBox(ListSquare type) {
        switch (type) {
            case BRICK:
                return "\t\t<board>\n";
            case HALL:
                return "\t\t<board>\n";
            case TARGET:
                return "\t\t<targets>\n";
            case PLAY:
                return "\t\t<player>\n";
                case BOX:
                return "\t\t<boxes>\n";
            default:
                return "";
        }
    }
    private String endTypeBox(ListSquare type) {
        switch (type) {
            case BRICK:
                return "\t\t\t<type>BRICK</type>\n\t\t</board>\n";
            case HALL:
                return "\t\t\t<type>HALL</type>\n\t\t</board>\n";
            case TARGET:
                return "\t\t</targets>\n";
            case PLAY:
                return "\t\t</player>\n";
            case BOX:
                return "\t\t</boxes>\n";
            default:
                return "";
        }
    }

    public String formatXML(){
        if (resultFianal == null) {
            return "null";
        } else {
            return this.resultFianal;
        }
    }
    @Override
    public String toString() {
        if (resultFianal == null) {
            return "null";
        } else {
            return this.resultFianal;
        }
    }
}
