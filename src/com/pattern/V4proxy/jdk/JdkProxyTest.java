package com.pattern.V4proxy.jdk;

import com.pattern.V4proxy.staticed.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;

public class JdkProxyTest {

    public static void main(String[] args) {
        try {

            //通过代理类的实例获取字节码重组后的对象来进行调用
            Person p = (Person) new Jdk51Job().getInstance(new GuanYu());
            System.out.println(p.getClass());
            p.findJob();

            //输出字节码文件到本地
            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});

            FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
            os.write(bytes);
            os.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
