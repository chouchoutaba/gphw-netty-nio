package com.home.nio.server;

import com.home.nio.client.TimeClientHandle;
import jdk.internal.org.objectweb.asm.Handle;

/**
 * @Author: Jiang
 * @Date: 2019/7/2 16:57
 */
public class TimeServer {
    public static void main(String[] args) {
        int port = 8080;
        if(args!=null&& args.length>0){
            try {
                port = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        new Thread(new MultiplexerTimeServer(port),"Time-Server-001").start();
    }
}
