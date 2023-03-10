package com.cunoc.Converter;

import java.util.ArrayList;

import com.cunoc.JFlex_Cup.HTML.SicHTML;
import com.cunoc.Map.Map;

public class SicHTMLToListMap {

    private final SicHTML converter;
    private ArrayList<Map> listMap = new ArrayList<>();

    public SicHTMLToListMap(SicHTML converter) {
        this.converter = converter;

    }

    private void makeListMap() {

    }

    public ArrayList<Map> getListMap() {
        return this.listMap;
    }
}
