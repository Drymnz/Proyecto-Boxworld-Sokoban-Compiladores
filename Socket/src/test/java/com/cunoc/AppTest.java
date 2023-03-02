package com.cunoc;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.Reader;
import java.io.StringReader;
import com.cunoc.Map.Map;

import org.junit.Test;

import com.cunoc.Converter.MapToString;
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
    public void pruevaSimpleCrearMapa()
    {
        assertTrue( lexicoSicJSon(
            "{\n"
        +"\"name\": \"tatoine\" \n,"
        +"\"rows\": \"5 * 5 - 20\"\n,"
        +"\"cols\": \"10 / 5 + 2\"\n,"
        +"\"config\": {\n"
        +"\"target_color\": \"#d6fe0a\","
        +"\"box_color\": \"#ffff00\","
        +"\"box_on_target_color\": \"#fe0002\","
        +"\"brick_color\": \"#bdbebf\","
        +"\"undefined_color\": \"#303030\","
        +"\"hall_color\": \"#0001ff\","
        +"\"player_color\": \"#ff00f7\""
        +"},"
        +"\"board\" : ["
        //primera fila
        +"{\"posX\": 0,\"posY\": \"2/2 +1\",\"type\": \"BRICK\"},"
        +"{\"posX\": 0,\"posY\": \"3 / 3\",\"type\": \"BRICK\"},"
        +"{\"posX\": 0,\"posY\": \"2 * 1\",\"type\": \"BRICK\"},"
        +"{\"posX\": 0,\"posY\": \"9 / 3 * 1\",\"type\": \"BRICK\"},"
        //segunda fila
        +"{\"posX\": \"10 - 3 * 3\",\"posY\": \"0\",\"type\": \"BRICK\"},"
        +"{\"posX\": 1,\"posY\": \"3 / 3\",\"type\": \"HALL\"},"
        +"{\"posX\": 1,\"posY\": \"2 * 1\",\"type\": \"HALL\"},"
        +"{\"posX\": 1,\"posY\": \"3\",\"type\": \"BRICK\"},"
        //tercera fila
        +"{\"posX\": 2,\"posY\": \"2 - 2\",\"type\": \"BRICK\"},"
        +"{\"posX\": 2,\"posY\": \"3 / 3\",\"type\": \"HALL\"},"
        +"{\"posX\": 2,\"posY\": \"2 * 1\",\"type\": \"HALL\"},"
        +"{\"posX\": 2,\"posY\": \"9 / 3 * 1\",\"type\": \"HALL\"},"
        //cuarta fila
        +"{\"posX\": 3,\"posY\": \"2 - 2\",\"type\": \"BRICK\"},"
        +"{\"posX\": 3,\"posY\": \"3 / 3\",\"type\": \"HALL\"},"
        +"{\"posX\": 3,\"posY\": \"2 * 1\",\"type\": \"HALL\"},"
        +"{\"posX\": 3,\"posY\": \"9 / 3 * 1\",\"type\": \"BRICK\"}"
        +"],"
        //cajas
        +"\"boxes\" : ["
        +"{"
        +"\"posX\": 2,"
        +"\"posY\": 1"
        +"},"
        +"{"
        +"\"posX\": 2,"
        +"\"posY\": \"1 + 1\""
        +"}"
        +"],"
        //target
        +"\"targets\" : ["
        +"{"
        +"\"posX\": \"4 / 2 + 1\","
        +"\"posY\": 1"
        +"},"
        +"{"
        +"\"posX\": \"4 / 2 + 1\","
        +"\"posY\": \"1 * 1 + 1\""
        +"}"
        +"],"
        //jugador
        +"\"player\" : "
        +"{"
        +"\"posX\": 1,"
        +"\"posY\": \"1\""
        +"}"
        +"}") 
        );
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
        assertTrue( lexicoSicHTML(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
            +"<worlds>"
            +"<world>"
            +"<name>tatoine</name>"
            +"<rows>5</rows>"
            +"<cols>4</cols>"
            +"<config>"
            +"<box_color>#ffff00</box_color>"
            +"<box_on_target_color>#fe0002</box_on_target_color>"
            +"<target_color>#d6fe0a</target_color>"
            +"<brick_color>#bdbebf</brick_color>"
            +"<hall_color>#0001ff</hall_color>"
            +"<undefined_color>#303030</undefined_color>"
            +"<player_color>#ff00f7</player_color>"
            +"</config>"
            +"<board> <posX>0</posX> <posY>0</posY> <type>BRICK</type></board>"
            +"<board> <posX>0</posX> <posY>0</posY> <type>BRICK</type></board>"
            +"<board> <posX>0</posX> <posY>0</posY> <type>HALL</type></board>"

            +"<boxes> <posX>0</posX> <posY>0</posY></boxes>"
            +"<boxes> <posX>0</posX> <posY>0</posY></boxes>"
            +"<boxes> <posX>0</posX> <posY>0</posY></boxes>"

            +"<targets> <posX>0</posX> <posY>0</posY></targets>"
            +"<targets> <posX>0</posX> <posY>0</posY></targets>"
            +"<targets> <posX>0</posX> <posY>0</posY></targets>"

            +"<player> <posX>0</posX> <posY>0</posY></player>"
            
            +"</world>"
            
            +"</worlds>") );
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
    public void convertidor(){
        Reader reader = new StringReader(archivo());
        LexicoJson lexema = new LexicoJson(reader);
        SicJSon sic = new SicJSon(lexema);
        try {
            sic.parse();
            System.out.println(lexema.getReport());
        } catch (Exception e) {
            assertTrue(false);
            /* Symbol s = sic.getSymbol();
            e.printStackTrace();
            System.out.println(e.getMessage()); */
        } 
        SicJSonToMap pep = new SicJSonToMap(sic);
        Map ten = pep.returnMap();
        System.out.println(new MapToString(ten).toString());
        assertTrue(true);
    }
}
