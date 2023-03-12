package com.cunoc.Converter;

import java.util.ArrayList;

import com.cunoc.Map.Map;

public class ArrayListMapToString {
    private final ArrayList<Map> list;
    private String resultFormatXML = "";

    public ArrayListMapToString(ArrayList<Map> list) {
        this.list = list;
        this.resultFormatXML = formatXML();
    }

    private String formatXML() {
        String returnResult = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n\t<worlds>\n";
        for (Map iterable_element : list) {
            returnResult += "\n" + (new MapToString(iterable_element)).formatXML();
        }
        returnResult += "\n<worlds>";
        return returnResult;
    }

    public String getResultFormatXML() {
        return this.resultFormatXML;
    }
}
