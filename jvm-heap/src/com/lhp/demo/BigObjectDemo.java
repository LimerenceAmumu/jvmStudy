package com.lhp.demo;

import java.util.concurrent.TimeUnit;

/**
 * @author Amumu
 * @create 2021/2/28 14:51
 * 大对象直接放入老年代
 * -Xms60m -Xmx60m -XX:NewRatio=2 -XX:SurvivorRatio=8 -XX:+PrintGCDetails
 */
public class BigObjectDemo {
    public static void main(String[] args) {
        try {
            TimeUnit.SECONDS.sleep(600);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        byte[] bytes=new  byte[1024*1024*20];
    }

}
