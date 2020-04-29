package com.juststarnew.designpattern.factorymethod;

/**
 * 描述：工厂方法模式
 * 总结:就是工厂定义为接口。
 * 不同的工程继承这个工厂抽象类。然后需要什么产品就到哪个具体的工厂里去取。
 * 与简单工厂的区别是简单工厂啥都生产。而现在就是工厂分工了，单一职责。。
 * 一个工厂只生产一种产品。
 *
 * @author zhangcai at 2020/4/29 17:49
 * @version 1.0.0
 */
public class FactoryMethod {

    public static void main(String[] args) {
        IFactory teslaFactory = new TeslaFactory();
        IFactory bydFactory = new BydFactory();
        Car tesla = teslaFactory.produce();
        Car byd = bydFactory.produce();
        tesla.drive();
        byd.drive();
    }


}

//抽象产品
interface Car {
    void drive();
}
//具体产品
class Tesla implements Car {

    @Override
    public void drive() {
        System.out.println("tesla auto drive");
    }
}

//具体产品*2
class Byd implements Car {

    @Override
    public void drive() {
        System.out.println("Byd drive");
    }
}
//抽象工厂
interface IFactory {
    Car produce();
}
//具体工厂
class TeslaFactory implements IFactory {

    @Override
    public Car produce() {
        return new Tesla();
    }
}
//具体工厂*2
class BydFactory implements IFactory {

    @Override
    public Car produce() {
        return new Byd();
    }
}
