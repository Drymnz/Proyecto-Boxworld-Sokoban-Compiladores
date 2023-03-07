package com.cunoc.Server;

import java.io.Reader;
import java.io.StringReader;

import com.cunoc.Converter.SicJSonToMap;
import com.cunoc.JFlex_Cup.Json.LexicoJson;
import com.cunoc.JFlex_Cup.Json.SicJSon;
import com.cunoc.Map.Map;

public class ReactionServer {

    private final String solicitud;
    private String result;

    public ReactionServer(String solicitud) {
        this.solicitud = solicitud;
        analysis();
    }

    private void analysis() {
        Reader reader = new StringReader(this.solicitud);
        LexicoJson lexema = new LexicoJson(reader);
        SicJSon sic = new SicJSon(lexema);
        try {
            sic.parse();
            System.out.println(lexema.getReport());
        } catch (Exception e) {
            Console.ConsoleText.append("\nError al analizar");
        }
        realizar(sic);
    }

    private void realizar(SicJSon sic) {
        switch (sic.getReaction()) {
            case ADD_WORD:// add word data base
                SicJSonToMap pep = new SicJSonToMap(sic);
                Map t4en = pep.getMap();
                break;

            case WORD:// get word in data base

                break;
            case ALL_WORDS:// get list word in data base
//gfssgfd
                break;
            case ERROR:// return string error

                break;
            default:
                break;
        }
    }

}
