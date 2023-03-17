package com.cunoc;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.Reader;
import java.io.StringReader;

import org.junit.Test;

import com.cunoc.File_Manger.FileConverter;
import com.cunoc.JFlex_Cup.ReportError;
import com.cunoc.JFlex_Cup.HTML.LexicoHTML;
import com.cunoc.JFlex_Cup.HTML.SicHTML;
import com.cunoc.JFlex_Cup.Json.LexicoJson;
import com.cunoc.JFlex_Cup.Json.SicJSon;

public class TestErrorCupJFlex {

    private String ruta_json_error = "/home/drymnz/dowgit/Proyecto-Boxworld-Sokoban-Compiladores/Socket/src/test/java/com/cunoc/test_error.json";
    //private String ruta_json_error = "D:/Mis documentos/Proyect/Proyecto compiladores/Socket/src/test/java/com/cunoc/test_error.json";


    /**
     * Rigorous Test :-)
     */
    @Test
    public void emptyTextJson() {
        assertTrue(lexicoSicJSon(""));
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void emptyTextXml() {
        assertTrue(lexicoSicHTML(""));
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void writeErrorsJson() {
        assertTrue(lexicoSicJSon(archivo(ruta_json_error)));
    }

    /**
     * @return
     * json example one
     */
    private String archivo(String ruta){
        return new FileConverter().upLoadTextFile(new File(ruta));
    }


    private boolean lexicoSicJSon(String prueva){
        Reader reader = new StringReader(prueva);
        LexicoJson lexema = new LexicoJson(reader);
        SicJSon sic = new SicJSon(lexema);
        try {
            sic.parse();
            //System.out.println(lexema.getReport());
        } catch (Exception e) {
            return false;
            /* Symbol s = sic.getSymbol();
            e.printStackTrace();
            System.out.println(e.getMessage()); */
        } 
        ReportError verificacion = new ReportError(lexema,sic);
        System.out.println(verificacion.getResul());
        return true;
    }
    private boolean lexicoSicHTML(String prueva){
        Reader reader = new StringReader(prueva);
        LexicoHTML lexema = new LexicoHTML(reader);
        SicHTML sic = new SicHTML(lexema);
        try {
            sic.parse();
            System.out.println(lexema.getReport());
        } catch (Exception e) {
            e.printStackTrace(System.out);
            return false;
        } 
        //
        return true;
    }
    
}
