package com.pattern.V3prototype;


import com.sun.xml.internal.ws.developer.Serialization;

import java.io.*;
import java.lang.annotation.Annotation;

/**
 * @author Administrator
 */
public class CustBenas implements Cloneable,Serializable {
    public String custName;
    public int age;
    public int sex;
    public String address;
    public String email;

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        CustBenas cb = null;

        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            ObjectOutputStream osw = new ObjectOutputStream(baos);
            osw.writeObject(this);

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            cb = (CustBenas)ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return cb;
    }

}
