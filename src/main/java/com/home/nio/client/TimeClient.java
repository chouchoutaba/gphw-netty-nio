package com.home.nio.client;

/**
 * @Author: Jiang
 * @Date: 2019/7/2 15:35
 */
public class TimeClient {
    private static int port=8080;
    public static void main(String[] args) {
        if(args!=null&& args.length>0){
            try {
                port = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        new Thread(new TimeClientHandle("127.0.0.1",port),"Time-Client-001").start();
    }


}
