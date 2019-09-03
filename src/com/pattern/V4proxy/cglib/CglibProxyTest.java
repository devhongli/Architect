package com.pattern.V4proxy.cglib;

import com.pattern.V4proxy.staticed.Person;

public class CglibProxyTest {

    public static void main(String[] args) throws Exception {
        LiuBei liuBei = (LiuBei)new CglibBoss().getInstance(LiuBei.class);
        liuBei.findJob();

    }
}
