package com.pattern.V4proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkJinDong implements InvocationHandler {
    private GuanYu guanYu;

    public Object getInstance(GuanYu guanYu){
        this.guanYu = guanYu;

        Class<?> clazz =  guanYu.getClass();

        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("已购买，正在快递中");
        method.invoke(this.guanYu,args);
        System.out.println("等待签收");


        return null;
    }
}
