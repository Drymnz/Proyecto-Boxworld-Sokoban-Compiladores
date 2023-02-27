package com.cunoc;

import com.cunoc.Server.Console;
import com.cunoc.Server.Sever;

public class App {
    public static final int PORT = (8086);
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Console().setVisible(true);
                Sever server = new Sever(PORT);
                server.start();
            }
        });
    }


}
