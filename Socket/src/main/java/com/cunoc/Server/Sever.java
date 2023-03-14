package com.cunoc.Server;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.cunoc.App;

public class Sever extends Thread {
    private final int port;
    private final String NADA = "error";

    @Override
    public void run() {
        int attempts = 0;
        while (attempts < 10) {
            try {
                ServerSocket severt = new ServerSocket(this.port);
                Console.ConsoleText.append("\nEl servidor esta corriendo en el puerto : " + this.port);
                Console.ConsoleText.append("\nEstoy a la espera");
                Socket socketClient = severt.accept();
                Console.ConsoleText.append("\nse conecto alguien");
                ObjectInputStream in = new ObjectInputStream(socketClient.getInputStream());
                ObjectOutputStream out = new ObjectOutputStream(socketClient.getOutputStream());
                Object getCliente = in.readObject();
                String json = interprets(getCliente);
                 /*analysis process */
                out.writeObject(json);
                Console.ConsoleText.append("\nle envie esto:\n" + json);
                socketClient.close();
            } catch (Exception e) {
                e.printStackTrace();
                attempts++;
                Console.ConsoleText.append("\nERROR-> class:SERVER " + e.getMessage());
            }
        }
        // System.exit(0);
    }

    private String interprets(Object get) {
        if (get instanceof String) {
            String text = (String) get;
            return (new ReactionServer(App.file,text)).getResult();
        }
        return NADA;
    }

    public Sever(int port) {
        this.port = port;
    }

    public int getPort() {
        return port;
    }
}
