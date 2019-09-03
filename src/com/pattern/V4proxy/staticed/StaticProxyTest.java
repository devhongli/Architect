package com.pattern.V4proxy.staticed;

public class StaticProxyTest {

    public static void main(String[] args) {

        Proxys proxys = new Proxys(new Som());

        proxys.findJob();
    }
}
