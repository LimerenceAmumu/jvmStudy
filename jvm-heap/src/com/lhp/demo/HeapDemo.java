package com.lhp.demo;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @author Amumu
 * -Xms100m -Xmx100m  -XX:+PrintGCDetails
 * @create 2021/2/27 15:24
 */
public class HeapDemo {
     private byte[] ba  =new byte[ 1024*1024*10];

    public static void main(String[] args) throws InterruptedException {
        ArrayList<byte[]> bytes = new ArrayList<>();
        while (true){
            TimeUnit.MILLISECONDS.sleep(50);
            HeapDemo heapDemo = new HeapDemo();
        }
    }
}
