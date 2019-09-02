package com.pattern.V3prototype;

import java.io.*;

public class PrototypeTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        CustBenas custBenas = new CustBenas();
        custBenas.setCustName("alice");
        custBenas.setSex(0);
        custBenas.setAge(20);
        custBenas.setAddress("beijing");
        custBenas.setEmail("12345678@qq.com");
        CustBenas copyBeans = null;
        try {
            copyBeans =  (CustBenas)custBenas.clone();
            System.out.println(copyBeans==custBenas);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
