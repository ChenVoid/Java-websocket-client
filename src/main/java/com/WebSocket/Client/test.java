package com.WebSocket.Client;

import org.java_websocket.WebSocket;

import java.net.URI;

public class test {
    // 根据实际websocket地址更改
    private static String url = "ws://localhost:3000";

    public static void main(String[] args){
        try {
            WsClient myClient = new WsClient(new URI(url));
            myClient.connect();
            // 判断是否连接成功，未成功后面发送消息时会报错
            while (!myClient.getReadyState().equals(WebSocket.READYSTATE.OPEN)) {
                System.out.println("Connecting...");
                Thread.sleep(1000);
            }
            myClient.send("MyClient");
            System.out.println("Message sent successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
