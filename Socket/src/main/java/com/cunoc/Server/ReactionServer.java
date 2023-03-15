package com.cunoc.Server;

import java.io.File;
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
    private File dataBase;

    public ReactionServer(File dataBase,String solicitud) {
        this.solicitud = solicitud;
        this.dataBase = dataBase;
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
            if (dataBase == null || !dataBase.exists()) {
                dataBase = (new FileConverter()).addressExists(dataBase);
            }
            String listWords = new FileConverter().upLoadTextFile(dataBase);// get data base
            Reader reader = new StringReader(listWords);
            LexicoHTML lexema = new LexicoHTML(reader);
            SicHTML dataBaseSic = new SicHTML(lexema);
            if (!listWords.isBlank()) {
                try {
                    dataBaseSic.parse();
                    System.out.println(lexema.getReport());
                } catch (Exception e) {
                    System.out.print(e);
                    Console.ConsoleText.append("\nError al analizar");
                }
            }
            // actions with the database
            switch (sic.getReaction()) {
                case ADD_WORD:// add word data base
                    SicJSonToMap pep = new SicJSonToMap(sic);
                    Map t4en = pep.getMap();
                    Boolean notRepeated =  false;
                    if (dataBaseSic.getListMap().isEmpty()) {
                        addWord(dataBaseSic,t4en);
                    }else{
                        for (Map iterable_element : dataBaseSic.getListMap()) {
                            if (iterable_element.getName().equals(t4en.getName())) {
                                notRepeated = true;
                                this.result = "Esta repetido";
                                break;
                            }
                        }
                        if (!notRepeated) {
                            addWord(dataBaseSic,t4en);
                        }
                    }
                    break;
                case ALL_WORDS:// get list name words
                    this.result = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n\t<worlds>\n";
                    for (Map iterable_element : dataBaseSic.getListMap()) {
                        this.result += "\t\t<world>"+iterable_element.getName()+"</world>\n";
                    }
                    this.result += "\t</worlds>";
                    break;
                case WORD:// get list word in data base
                    Map match = null;
                    for (Map iterable_element : dataBaseSic.getListMap()) {
                        if (iterable_element.getName().equals(sic.getName())) {
                            match = iterable_element;
                            break;
                        }
                    }
                    if (match == null) {
                        this.result = "no existe el map";
                    } else {
                        this.result = (new MapToString(match)).formatXML();
                    }
                    break;
                default:
                    break;
            }
        }

    }

    private void addWord(SicHTML dataBaseSic,Map t4en){
        dataBaseSic.getListMap().add(t4en);// add map
        FileWriteManager writerFila = new FileWriteManager();
        String returnServer =  (new ArrayListMapToString(dataBaseSic.getListMap())).getResultFormatXML();
        if (writerFila.waitText(App.file,returnServer)) {
            //yes write
            this.result = (new MapToString(t4en)).formatXML(); 
        }else{
            //error
        }
    }

    public String getResult() {
        return this.result;
    }

}
