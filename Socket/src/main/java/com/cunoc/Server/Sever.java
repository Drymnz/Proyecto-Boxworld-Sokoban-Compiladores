package com.cunoc.Server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cunoc.App;

public class Sever extends Thread {
    private final int port;
    private final String NADA = "error";

    @Override
    public void run() {
        try (ServerSocket server = new ServerSocket(this.port)) {
            // String hostAddress = InetAddress.getLocalHost().getHostAddress();
            while (true) {
                Console.ConsoleText.append("\nEl servidor esta corriendo en el puerto : " + server.getLocalPort());
                printConsole();//view ip
                // modo espera
                Console.ConsoleText.append("\nEstoy a la espera");
                Socket socket = server.accept();
                ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
                ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                Object getCliente = in.readObject();
                String json = interprets(getCliente);
                /* analysis process */
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

    private void printConsole() throws SocketException{
        Enumeration e = NetworkInterface.getNetworkInterfaces();
        while (e.hasMoreElements()) {
            NetworkInterface n = (NetworkInterface) e.nextElement();
            Enumeration ee = n.getInetAddresses();
            while (ee.hasMoreElements()) {
                InetAddress i = (InetAddress) ee.nextElement();
                Pattern pattern = Pattern.compile("^((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)(\\.(?!$)|$)){4}$");
                Matcher verify = pattern.matcher(i.getHostAddress());
                if (verify.find()) {
                    Console.ConsoleText.append("\n: Posible ip para : "+ i.getHostAddress());
                }
            }
        }
    }

    private String interprets(Object get) {
        if (get instanceof String) {
            String text = (String) get;
            if (text.isEmpty()) {
                return "";
            }else{
                return (new ReactionServer(App.file, text)).getResult();
            }
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
