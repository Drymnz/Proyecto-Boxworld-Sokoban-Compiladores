package com.cunoc.Server;

import java.io.Reader;
import java.io.StringReader;

import com.cunoc.App;
import com.cunoc.Converter.SicHTMLToListMap;
import com.cunoc.Converter.SicJSonToMap;
import com.cunoc.File_Manger.FileConverter;
import com.cunoc.JFlex_Cup.HTML.LexicoHTML;
import com.cunoc.JFlex_Cup.HTML.SicHTML;
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
        if (sic.getReaction() == ListReactionServer.ERROR) {

        } else {//if there is a request to make
            String listWords = new FileConverter().upLoadTextFile(App.file);//get data base
            Reader reader = new StringReader(listWords);
            LexicoHTML lexema = new LexicoHTML(reader);
            SicHTML dataBaseSic = new SicHTML(lexema);
            try {
                dataBaseSic.parse();
                System.out.println(lexema.getReport());
            } catch (Exception e) {
                Console.ConsoleText.append("\nError al analizar");
            }
            SicHTMLToListMap list = new SicHTMLToListMap(dataBaseSic);//data Base in list
            // actions with the database
            switch (sic.getReaction()) {
                case ADD_WORD:// add word data base
                    SicJSonToMap pep = new SicJSonToMap(sic);
                    Map t4en = pep.getMap();
                    Boolean notRepeated = false;
                    for (Map iterable_element : list.getListMap()) {
                        if (iterable_element.getName().equals(t4en.getName())) {
                            notRepeated = true;
                        }
                    }
                    if (!notRepeated) {//unique id
                        list.getListMap().add(t4en);
                    }
                    break;
                case ALL_WORDS:
                    
                    break;
                case WORD:// get list word in data base

                    break;
                default:
                    break;
            }
        }

    }

}
