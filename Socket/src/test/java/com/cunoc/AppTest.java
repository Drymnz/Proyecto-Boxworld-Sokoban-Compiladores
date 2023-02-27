package com.cunoc;

import static org.junit.Assert.assertTrue;

import java.io.Reader;
import java.io.StringReader;

import org.junit.Test;

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
        +"\"config\": {\n"
        +"\"box_color\": \"#ffff00\","
        +"\"box_on_target_color\": \"#fe0002\","
        +"\"target_color\": \"#d6fe0a\","
        +"\"brick_color\": \"#bdbebf\","
        +"\"hall_color\": \"#0001ff\","
        +"\"undefined_color\": \"#303030\","
        +"\"player_color\": \"#ff00f7\""
        +"},"
        +"\"board\" : ["
        +"{"
        +"\"posX\": 0,"
        +"\"posY\": \"2 - 2\","
        +"\"type\": \"BRICK\""
        +"},"
        +"{"
        +"\"posX\": 0,"
        +"\"posY\": \"3 / 3\","
        +"\"type\": \"HALL\""
        +"},"
        +"{"
        +"\"posX\": 0,"
        +"\"posY\": \"2 * 1\","
        +"\"type\": \"BRICK\""
        +"}"
        +"],"
        +"\"boxes\" : ["
        +"{"
        +"\"posX\": 0,"
        +"\"posY\": \"2 - 2\""
        +"},"
        +"{"
        +"\"posX\": 0,"
        +"\"posY\": \"2 - 2\""
        +"}"
        +"],"
        +"\"targets\" : ["
        +"{"
        +"\"posX\": 0,"
        +"\"posY\": \"2 - 2\""
        +"},"
        +"{"
        +"\"posX\": 0,"
        +"\"posY\": \"2 - 2\""
        +"}"
        +"],"
        +"\"player\" : "
        +"{"
        +"\"posX\": 0,"
        +"\"posY\": \"2 - 2\""
        +"}"
        +"}") 
        );
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
}
