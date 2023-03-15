package com.cunoc.Server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import com.cunoc.App;

public class Sever extends Thread {
    private final int port;
    private final String NADA = "error";

    @Override
    public void run() {
        try(ServerSocket server = new ServerSocket(this.port)) {
            while (true) {
                String hostAddress = InetAddress.getLocalHost().getHostAddress();
                Console.ConsoleText.append("\nEl servidor esta corriendo en el puerto : " + this.port);
                //modo espera
                Console.ConsoleText.append("\nEstoy a la espera");
                Socket socket = server.accept();

                ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
                ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                Object getCliente = in.readObject();
                String json = interprets(getCliente);
                 /*analysis process */
                out.writeObject(json);
                Console.ConsoleText.append("\nle envie esto:\n" + json);
                // TODO: read message
                out.writeObject(json);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace(System.out);
            Console.ConsoleText.append(e.getMessage());
            Console.ConsoleText.append("\nERROR-> class:SERVER " + e.getMessage());
        }
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
