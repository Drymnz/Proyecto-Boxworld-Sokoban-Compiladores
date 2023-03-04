package com.cunoc;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.Reader;
import java.io.StringReader;
import com.cunoc.Map.Map;

import org.junit.Test;

import com.cunoc.Converter.MapToString;
import com.cunoc.Converter.SicHTMLToListMap;
import com.cunoc.Converter.SicJSonToMap;
import com.cunoc.File_Manger.FileConverter;
import com.cunoc.JFlex_Cup.HTML.LexicoHTML;
import com.cunoc.JFlex_Cup.HTML.SicHTML;
import com.cunoc.JFlex_Cup.Json.LexicoJson;
import com.cunoc.JFlex_Cup.Json.SicJSon;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void pruevaSimpleAll()
    {
        assertTrue( lexicoSicJSon("{\n"+"\"worlds\": \"all\"\n"+"}") );
    }
        /**
     * Rigorous Test :-)
     */
    @Test
    public void pruevaSimpleId()
    {
        assertTrue( lexicoSicJSon("{\n"+"\"world\": \"elpepe\"\n"+"}") );
    }
     
 /**
     * Rigorous Test :-)
     */
    @Test
    public void pruevaArchivo(){
        assertTrue(lexicoSicJSon(archivo()));
    }
    /**
     * @return
     */
    private String archivo(){
        //linux
        return new FileConverter().upLoadTextFile(new File("/mnt/Archivo/Mis documentos/Proyect/Proyecto compiladores/Socket/src/test/java/com/cunoc/test.json"));
        //windows
        //return new FileConverter().upLoadTextFile(new File("D:/Mis documentos/Proyect/Proyecto compiladores/Socket/src/test/java/com/cunoc/test.json"));
    }

    /**
     * @return
     */
    private String archivoHtml(){
        //linux
        return new FileConverter().upLoadTextFile(new File("/mnt/Archivo/Mis documentos/Proyect/Proyecto compiladores/Socket/src/test/java/com/cunoc/test.xml"));
        //windows
        //return new FileConverter().upLoadTextFile(new File("D:/Mis documentos/Proyect/Proyecto compiladores/Socket/src/test/java/com/cunoc/test.xml"));
    }
    private boolean lexicoSicJSon(String prueva){
        Reader reader = new StringReader(prueva);
        LexicoJson lexema = new LexicoJson(reader);
        SicJSon sic = new SicJSon(lexema);
        try {
            sic.parse();
            System.out.println(lexema.getReport());
        } catch (Exception e) {
            return false;
            /* Symbol s = sic.getSymbol();
            e.printStackTrace();
            System.out.println(e.getMessage()); */
        } 
        return true;
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void listadoVacioMundos()
    {
        assertTrue( lexicoSicHTML(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
            +"<worlds></worlds>") );
    }
     /**
     * Rigorous Test :-)
     */
    @Test
    public void listadoUnMundo()
    {
        assertTrue( lexicoSicHTML(archivoHtml()) );
    }

     /**
     * Rigorous Test :-)
     */
    @Test
    public void convertidoFileToMap()
    {
        Reader reader = new StringReader(archivoHtml());
        LexicoHTML lexema = new LexicoHTML(reader);
        SicHTML sic = new SicHTML(lexema);
        try {
            sic.parse();
            System.out.println(lexema.getReport());
        } catch (Exception e) {
            assertTrue(false);
        } 
        for (Map iterable_element : sic.getListMap()) {
            System.out.println(new MapToString(iterable_element).formatXML());
        }
        assertTrue(true);
    }
   
    private boolean lexicoSicHTML(String prueva){
        Reader reader = new StringReader(prueva);
        LexicoHTML lexema = new LexicoHTML(reader);
        SicHTML sic = new SicHTML(lexema);
        try {
            sic.parse();
            System.out.println(lexema.getReport());
        } catch (Exception e) {
            return false;
        } 
        //
        return true;
    }
    /**
     * Rigorous Test :-)
     */
    @Test
    public void convertidor(){
        Reader reader = new StringReader(archivo());
        LexicoJson lexema = new LexicoJson(reader);
        SicJSon sic = new SicJSon(lexema);
        try {
            sic.parse();
            System.out.println(lexema.getReport());
        } catch (Exception e) {
            assertTrue(false);
        } 
        SicJSonToMap pep = new SicJSonToMap(sic);
        Map ten = pep.getMap();
        System.out.println(new MapToString(ten).formatXML());
        assertTrue(true);
    }
}
