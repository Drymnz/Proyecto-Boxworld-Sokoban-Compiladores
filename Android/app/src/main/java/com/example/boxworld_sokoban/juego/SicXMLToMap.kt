package com.example.boxworld_sokoban.juego

import com.example.boxworld_sokoban.juego.JflexYCup.xml.Map.ListSquare
import com.example.boxworld_sokoban.juego.JflexYCup.xml.Map.Map
import com.example.boxworld_sokoban.juego.JflexYCup.xml.SicXML


class SicXMLToMap constructor(converter: SicXML) {
    private var converter: SicXML
    private var returnFinal: Map

    init {
        this.converter = converter
        returnFinal = this.returnMap()
    }

    public fun  getReturnFinal() : Map{
        return  this.returnFinal
    }

    private fun returnMap(): Map {
        val returnMap:Map = Map(this.converter.getName(),this.converter.getRows(),this.converter.getCols())
        // canbiar color si son diferentes
        returnMap.setBOX_COLOR((if (returnMap.getBOX_COLOR() == converter.boX_COLOR || converter.boX_COLOR.isEmpty()) returnMap.getBOX_COLOR() else converter.boX_COLOR)!!)
        returnMap.setBOX_ON_COLOR((if (returnMap.getBOX_ON_COLOR() == converter.boX_ON_COLOR || converter.boX_ON_COLOR.isEmpty()) returnMap.getBOX_ON_COLOR() else converter.boX_ON_COLOR)!!)
        returnMap.setTARGET_COLOR((if (returnMap.getTARGET_COLOR() == converter.targeT_COLOR || converter.targeT_COLOR.isEmpty()) returnMap.getTARGET_COLOR() else converter.targeT_COLOR)!!)
        returnMap.setBRICK_COLOR((if (returnMap.getBRICK_COLOR() == converter.bricK_COLOR || converter.bricK_COLOR.isEmpty()) returnMap.getBRICK_COLOR() else converter.bricK_COLOR)!!)
        returnMap.setHALL_COLOR((if (returnMap.getHALL_COLOR() == converter.halL_COLOR || converter.halL_COLOR.isEmpty()) returnMap.getHALL_COLOR() else converter.halL_COLOR)!!)
        returnMap.setUNDEFINED_COLOR((if (returnMap.getUNDEFINED_COLOR() == converter.undefineD_COLOR || converter.undefineD_COLOR.isEmpty()) returnMap.getUNDEFINED_COLOR() else converter.undefineD_COLOR)!!)
        returnMap.setPLAY_COLOR((if (returnMap.getPLAY_COLOR() == converter.plaY_COLOR || converter.plaY_COLOR.isBlank()) returnMap.getPLAY_COLOR() else converter.plaY_COLOR)!!)


        for (item in converter.listSquare) {
            val primera = item.getPossY() >= 0
            val segundo = item.getPossY() < returnMap.getRows()
            val tercero = item.getPossX() >= 0
            val cuarto = item.getPossX() < returnMap.getCols()
            if (item.getPossY() >= 0 && item.getPossY() < returnMap.getRows() && item.getPossX() >= 0 && item.getPossX() < returnMap.getCols()) {
                if (returnMap.getMatrix()!![item.getPossY()][item.getPossX()].getType() === ListSquare.HALL ||
                    returnMap.getMatrix()!![item.getPossY()][item.getPossX()].getType() === ListSquare.UNDEFINED
                ) {
                    when (item.getType()) {
                        ListSquare.BOX -> returnMap.getMatrix()!![item.getPossY()][item.getPossX()].setType(
                            ListSquare.BOX
                        )
                        ListSquare.BRICK -> returnMap.getMatrix()!![item.getPossY()][item.getPossX()].setType(
                            ListSquare.BRICK
                        )
                        ListSquare.TARGET -> returnMap.getMatrix()!![item.getPossY()][item.getPossX()].setType(
                            ListSquare.TARGET
                        )
                        ListSquare.HALL -> returnMap.getMatrix()!![item.getPossY()][item.getPossX()].setType(
                            ListSquare.HALL
                        )
                        ListSquare.PLAY -> returnMap.getMatrix()!![item.getPossY()][item.getPossX()].setType(
                            ListSquare.PLAY
                        )
                        else -> {

                        }
                    }
                }
            }
        }
        return returnMap
    }


}