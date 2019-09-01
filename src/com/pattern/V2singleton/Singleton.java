package com.pattern.V2singleton;

/**
 * 单例模式
 */
public class Singleton {

    //类加载实例化顺序：先静态，后动态  先属性，后方法  先上后下

    //1。饿汉式 静态常量（饿汉式是在类装载的时候就完成实例化，造成内存的浪费。线程安全）
    public static final Singleton INSTANCE = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return INSTANCE;
    }

    //2。饿汉式 静态代码块
    public static Singleton instance;

    static {
        instance = new Singleton();
    }

    public static Singleton getInstance1(){
        return instance;
    }

    //3。懒汉式(线程不安全)
    public static Singleton singleton;
    public static Singleton getInstance2(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
    //4。同步方法，线程安全（锁影响性能）
    public static synchronized Singleton getInstance3(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
    //5。同步代码块，线程安全（锁影响性能）
    public static Singleton getInstance4(){
        if (singleton == null){
            synchronized (Singleton.class) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }
    //6。双重检查
    public static Singleton getInstance5(){
        if (singleton == null){
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    //7。注册登记式/静态类部内
    public static class SingletonHolder{
        public static final Singleton INSTANCE = new Singleton();
    }
    //private Singleton(){}
    public static final Singleton getInstance6(){
        return SingletonHolder.INSTANCE;
    }

    //8。枚举


}
