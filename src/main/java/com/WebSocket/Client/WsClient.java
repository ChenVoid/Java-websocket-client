package com.WebSocket.Client;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;

public class WsClient extends WebSocketClient {

    public WsClient(URI serverUri) {
        super(serverUri);
    }

    @Override
    public void onOpen(ServerHandshake arg0) {
        System.out.println("Succeed in shaking hands!");

    }

    @Override
    public void onClose(int arg0, String arg1, boolean arg2) {
        System.out.println("Connection closed!");
    }

    @Override
    public void onError(Exception arg0) {
        System.out.println("Error!");
    }

    @Override
    public void onMessage(String arg0) {
        System.out.println("Receive message: " + arg0);
    }
}
