package com.cunoc.Converter;

import com.cunoc.JFlex_Cup.Json.SicJSon;
import com.cunoc.Map.ListSquare;
import com.cunoc.Map.Map;
import com.cunoc.Map.Square;

public class SicJSonToMap {

    private final SicJSon converter;
    private Map returnFinal;

    public SicJSonToMap(SicJSon converter) {
        this.converter = converter;
        this.returnFinal = this.returnMap();
    }

    public Map getMap() {
        return this.returnFinal;
    }

    private Map returnMap() {
        if (this.converter.getCols() > 0) {
            Map returnMap = new Map(this.converter.getName(), this.converter.getRows(), this.converter.getCols());
            // canbiar color si son diferentes
            returnMap.setBOX_COLOR((returnMap.getBOX_COLOR().equals(this.converter.getBOX_COLOR())
                    || this.converter.getBOX_COLOR().isEmpty()) ? returnMap.getBOX_COLOR()
                            : this.converter.getBOX_COLOR());
            returnMap.setBOX_ON_COLOR((returnMap.getBOX_ON_COLOR().equals(this.converter.getBOX_ON_COLOR())
                    || this.converter.getBOX_ON_COLOR().isEmpty()) ? returnMap.getBOX_ON_COLOR()
                            : this.converter.getBOX_ON_COLOR());
            returnMap.setTARGET_COLOR((returnMap.getTARGET_COLOR().equals(this.converter.getTARGET_COLOR())
                    || this.converter.getTARGET_COLOR().isEmpty()) ? returnMap.getTARGET_COLOR()
                            : this.converter.getTARGET_COLOR());
            returnMap.setBRICK_COLOR((returnMap.getBRICK_COLOR().equals(this.converter.getBRICK_COLOR())
                    || this.converter.getBRICK_COLOR().isEmpty()) ? returnMap.getBRICK_COLOR()
                            : this.converter.getBRICK_COLOR());
            returnMap.setHALL_COLOR((returnMap.getHALL_COLOR().equals(this.converter.getHALL_COLOR())
                    || this.converter.getHALL_COLOR().isEmpty()) ? returnMap.getHALL_COLOR()
                            : this.converter.getHALL_COLOR());
            returnMap.setUNDEFINED_COLOR((returnMap.getUNDEFINED_COLOR().equals(this.converter.getUNDEFINED_COLOR())
                    || this.converter.getUNDEFINED_COLOR().isEmpty()) ? returnMap.getUNDEFINED_COLOR()
                            : this.converter.getUNDEFINED_COLOR());
            returnMap.setPLAY_COLOR((returnMap.getPLAY_COLOR().equals(this.converter.getPLAY_COLOR())
                    || this.converter.getPLAY_COLOR().isBlank()) ? returnMap.getPLAY_COLOR()
                            : this.converter.getPLAY_COLOR());

            for (Square item : this.converter.getListSquare()) {
                if (item.getPossY() >= 0 && item.getPossY() < returnMap.getRows() && item.getPossX() >= 0
                        && item.getPossX() < returnMap.getCols()) {
                    if ((returnMap.getMatrix().get(item.getPossY()).get(item.getPossX()).getType() == ListSquare.HALL ||
                            returnMap.getMatrix().get(item.getPossY()).get(item.getPossX())
                                    .getType() == ListSquare.UNDEFINED)) {
                        switch (item.getType()) {
                            case BOX:
                                returnMap.getMatrix().get(item.getPossY()).get(item.getPossX()).setType(ListSquare.BOX);
                                break;
                            case BRICK:
                                returnMap.getMatrix().get(item.getPossY()).get(item.getPossX())
                                        .setType(ListSquare.BRICK);
                                break;
                            case TARGET:
                                returnMap.getMatrix().get(item.getPossY()).get(item.getPossX())
                                        .setType(ListSquare.TARGET);
                                break;
                            case HALL:
                                returnMap.getMatrix().get(item.getPossY()).get(item.getPossX())
                                        .setType(ListSquare.HALL);
                                break;
                            case PLAY:
                                returnMap.getMatrix().get(item.getPossY()).get(item.getPossX())
                                        .setType(ListSquare.PLAY);
                                break;
                            default:
                                break;
                        }
                    } else {

                    }
                }

            }
            return returnMap;
        }
        return null;
    }
}
