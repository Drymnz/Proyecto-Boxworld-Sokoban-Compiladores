package com.example.boxworld_sokoban.juego.server

import java.io.ObjectInputStream
import java.io.ObjectOutputStream
import java.net.Socket


class Connection(port:Int,textJson:String,severIp:String) {

    private val port:Int
    private val textJson:String
    private val SERVER_IP:String

    init{
        this.port = port
        this.textJson = textJson
        this.SERVER_IP = severIp
    }

    public fun sendJSon():String{
        var result: String = ""
        try {
            val socket = Socket("localhost", this.port)
            val send = ObjectOutputStream(socket.getOutputStream())
            val in2 = ObjectInputStream(socket.getInputStream())
            send.writeObject(this.sendJSon())
            val resivido = in2.readObject() as String
            result = resivido
            send.close()
            in2.close()
            socket.close()
        } catch (e: Exception) {
            println("NO SE CONNECTO AL ASERVER")
        }
        return result
    }
}