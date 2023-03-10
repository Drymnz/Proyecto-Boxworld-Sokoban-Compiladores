package com.cunoc.Server;

import java.io.Reader;
import java.io.StringReader;

import com.cunoc.App;
import com.cunoc.Converter.ArrayListMapToString;
import com.cunoc.Converter.MapToString;
import com.cunoc.Converter.SicJSonToMap;
import com.cunoc.File_Manger.FileConverter;
import com.cunoc.File_Manger.FileWriteManager;
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

        } else {// if there is a request to make
            String listWords = new FileConverter().upLoadTextFile(App.file);// get data base
            Reader reader = new StringReader(listWords);
            LexicoHTML lexema = new LexicoHTML(reader);
            SicHTML dataBaseSic = new SicHTML(lexema);
            try {
                dataBaseSic.parse();
                System.out.println(lexema.getReport());
            } catch (Exception e) {
                Console.ConsoleText.append("\nError al analizar");
            }
            // actions with the database
            switch (sic.getReaction()) {
                case ADD_WORD:// add word data base
                    SicJSonToMap pep = new SicJSonToMap(sic);
                    Map t4en = pep.getMap();
                    Boolean notRepeated = (dataBaseSic.getListMap().isEmpty())? true : false;
                    for (Map iterable_element : dataBaseSic.getListMap()) {
                        if (iterable_element.getName().equals(t4en.getName())) {
                            notRepeated = true;
                        }
                    }
                    if (!notRepeated) {// unique id
                        dataBaseSic.getListMap().add(t4en);// add map
                        FileWriteManager writerFila = new FileWriteManager();
                        if (writerFila.waitText(App.file, (new ArrayListMapToString(dataBaseSic.getListMap())).getResultFormatXML())) {
                            //yes write
                        }else{
                            //error
                        }
                        
                    }else {
                        //not add
                    }
                    break;
                case ALL_WORDS:// get list name words
                    this.result = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n\t<worlds>\n";
                    for (Map iterable_element : dataBaseSic.getListMap()) {
                        this.result += "\t\t<world>"+iterable_element.getName()+"</world>\n";
                    }
                    this.result += "\n\t<worlds>";
                    break;
                case WORD:// get list word in data base
                    Map match = null;
                    for (Map iterable_element : dataBaseSic.getListMap()) {
                        if (iterable_element.getName().equals(sic.getName())) {
                            match = iterable_element;
                        }
                    }
                    if (match == null) {

                    } else {
                        this.result = (new MapToString(match)).formatXML();
                    }
                    break;
                default:
                    break;
            }
        }

    }

    public String getResult() {
        return this.result;
    }

}
