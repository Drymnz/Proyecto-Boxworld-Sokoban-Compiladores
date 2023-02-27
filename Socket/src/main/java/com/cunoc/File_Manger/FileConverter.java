package com.cunoc.File_Manger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileConverter {
    
    private FileInputStream entry;

    

    public FileConverter() {
    }

    public String upLoadTextFile(File file) {
        String extract = "";
        try {
            entry = new FileInputStream(file);
            int valor;
            while ((valor = entry.read()) != -1) {
                char caracter = (char) valor;
                extract += caracter;
            }
            entry.close();
        } catch (FileNotFoundException ex) {
            System.out.println( "error en lectura");
        } catch (IOException ex) {
            System.out.println("error en lectura");
        }
        return extract;
    }

    public File addressExists(File check) {
        if (check.exists()) {
            return check;
        } else {
            if (check.mkdirs()) {
                System.out.println("FUE CREADO " + check.getName());
                return check;
            } else {
                System.out.println("NO SE PUDO CREAR " + check.getName());
            }
        }
        return null;
    }
}