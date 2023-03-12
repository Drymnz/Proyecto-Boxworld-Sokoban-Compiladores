package com.cunoc;

import java.io.File;

import com.cunoc.File_Manger.FileConverter;
import com.cunoc.Server.Console;
import com.cunoc.Server.Sever;

public class App {
    public static final int PORT = (8086);
    public static final String DATA_BASE = "DATA-BASE.XML";
    public static File file = null;
    public static void main(String[] args) {

        file = new File(DATA_BASE);
        file = (new FileConverter()).addressExists(file);

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Console().setVisible(true);
                Sever server = new Sever(PORT);
                server.start();
            }
        });
    }


}
