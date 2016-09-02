package com.db.javaschool2016.client;

import java.io.*;
import java.net.Socket;

public class Sender{
    private DataOutputStream out;

    public Sender(DataOutputStream dataOutputStream) throws IOException{
            this.out = dataOutputStream;
    }

    /**
     * Send message to socket's OutputStream.
     * @param message Message to send.
     */

    public void sendMessage(String message) throws IOException{
            out.writeUTF(message);
            out.flush();
    }

    public void close() throws IOException {
        out.close();
    }
}
