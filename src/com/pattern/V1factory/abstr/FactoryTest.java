package com.pattern.V1factory.abstr;

public class FactoryTest {

    public static void main(String[] args) {
        //原始做法，有钱不用自己做
        //System.out.println(new BlevelCar().getName());

        //简单工厂，new一个需要传参数
        //System.out.println(new SimpleFactory().getCar("B"));

        //工厂模型，new一个自己想要的，然后获取
        //Factory factory = new AlevelCarFactory();
        //System.out.println(factory.getCar());

        //抽象工厂，全部统一new一个方法，然后选择。
        //优点：对外统一接口 内部修改方便不影响外层代码
        CarFactory factory = new CarFactory();
        System.out.println(factory.getSUVclassCar());
    }
}
