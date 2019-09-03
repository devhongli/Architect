package com.pattern.V4proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Jdk51Job implements InvocationHandler {
    //拿到对象
    private GuanYu guanyu;

    public Object getInstance(GuanYu guanyu){
        this.guanyu = guanyu;

        Class<?> clazz = guanyu.getClass();

        //用字节码重组的形式生产新的Java代码并编译解析加载到jvm执行。
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("帮你找到工作");
        method.invoke(this.guanyu,args);

        System.out.println("安排面试");
        return null;
    }
}
