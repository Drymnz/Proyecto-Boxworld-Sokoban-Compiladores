package com.example.boxworld_sokoban.juego.server.task

import android.os.AsyncTask
import com.example.boxworld_sokoban.juego.server.message.SimpleMessage
import java.io.ObjectInputStream
import java.io.ObjectOutputStream
import java.net.Socket

class MyTask(val ip: String, val port: Int, val message: String) : AsyncTask<Void, Void, String>() {

    var delegate: AsyncResponse? = null

    override fun doInBackground(vararg p0: Void?): String {
        try {
            val socket = Socket(ip, port)
            val outputStream = ObjectOutputStream(socket.getOutputStream())
            val inputStream = ObjectInputStream(socket.getInputStream())

            // sending message
            outputStream.writeObject(message)

            // receiving message
            val response: String = inputStream.readObject() as String;
            // showing message
            return response.toString()
        }catch (e: Exception) {
            System.out.println("Ip incorrecta")
            return ""
        }
    }

    override fun onPostExecute(result: String?) {
        delegate?.processResponse(result)
    }
}
