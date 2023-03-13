package com.example.boxworld_sokoban.juego.server

import android.widget.Button
import java.io.ObjectInputStream
import java.io.ObjectOutputStream
import java.net.InetAddress
import java.net.Socket


class Connection(port:Int,button:Button,textJson:String) {

    private val port:Int
    private val button:Button
    private val textJson:String
    private val SERVER_IP = "10.0.2.2"

    init{
        this.port = port
        this.button = button
        this.textJson = textJson
    }

    public fun sendJSon():String{
        //button.setEnabled(false)
        var result: String? = ""
        try {
            val serverAddr: InetAddress = InetAddress.getByName(SERVER_IP)
            val socket = Socket(serverAddr, port)
            val send = ObjectOutputStream(socket.getOutputStream())
            val in2 = ObjectInputStream(socket.getInputStream())
            send.writeObject(textJson)
            val resivido = in2.readObject() as String
            result = resivido
            send.close()
            in2.close()
            socket.close()
        } catch (e: Exception) {
            println("NO SE CONNECTO AL ASERVER")
        }
        return result!!
        this.button.setEnabled(true)
    }
}