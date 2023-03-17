package com.cunoc.JFlex_Cup;

import com.cunoc.JFlex_Cup.Json.ErroSic;
import com.cunoc.JFlex_Cup.Json.LexicoJson;
import com.cunoc.JFlex_Cup.Json.SicJSon;

public class ReportError {

    private final LexicoJson lexic;
    private final SicJSon sic;
    private String resul;
    private String formatXML;

    public ReportError(LexicoJson lexic, SicJSon sic){
        this.lexic = lexic;
        this.sic = sic;
        this.resul = result();
    }

    private String result(){
        String erturnString = "";
        if (!this.lexic.getListError().isEmpty() || !sic.getListError().isEmpty()) {
            formatXML="<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
            formatXML+="\n<errors>";
            erturnString = "\n---------------------------------------------------------";
            erturnString += "\n|Lexema  |  Línea  |  Columna  |  Tipo  |  Descripción  |";
            for (Token iterable_element : this.lexic.getListError()) {
                formatXML+="\n<error>";
                formatXML+="\n<lexema>"+iterable_element.getLexeme()+"</lexema>";
                formatXML+="\n<line>"+iterable_element.getY()+"</line>";
                formatXML+="\n<column>"+iterable_element.getX()+"</column>";
                formatXML+="\n<type>LEXICO</type>";
                formatXML+="\n<description>Símbolo no existe en el lenguaje</description>";
                erturnString+="\n|"+iterable_element.getLexeme()+"|"+iterable_element.getY()+"|"+iterable_element.getX()+"|Léxico"+"| Símbolo no existe en el lenguaje |";
                formatXML+="\n</error>";
            } 
            erturnString += "\n";
            erturnString += "---------------------------------------------------------";
            erturnString += "\n|Lexema  |  Línea  |  Columna  |  Tipo  |  Descripción  |";
            for (ErroSic iterable_element : sic.getListError()) {
                formatXML+="\n<error>";
                formatXML+="\n<lexema>"+iterable_element.getLexeme()+"</lexema>";
                formatXML+="\n<line>"+iterable_element.getY()+"</line>";
                formatXML+="\n<column>"+iterable_element.getX()+"</column>";
                formatXML+="\n<type>SINTAC</type>";
                formatXML+="\n<description>"+iterable_element.getType()+"</description>";
                erturnString+="\n|"+iterable_element.getLexeme()+"|"+iterable_element.getY()+"|"+iterable_element.getX()+"|Sintáctico"+"| Se esperaba "+iterable_element.getType()+"|";
                formatXML+="\n</error>";
            }
            erturnString += "\n----------------------------------------------------------";
            formatXML+="\n</errors>";
        }
        return erturnString;
    }

    public String getResul() {
        return resul;
    }

    public String getFormatXML() {
        return formatXML;
    }

}
