package com.juststarnew.designpattern.simplefactory;

/**
 * 描述：简单工厂模式
 *
 * @author zhangcai at 2020/4/29 17:25
 * @version 1.0.0
 */
public class SimpleFactory {
    public static void main(String[] args) throws Exception {
       Factory factory = new Factory();
        Car byd = factory.produceCar("byd");
        Car tesla = factory.produceCar("tesla");
        byd.drive();
        tesla.drive();
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

//工厂
class Factory {
    Car produceCar(String carType) throws Exception {
        if ("tesla".equals(carType)) {
            return new Tesla();
        } else if ("byd".equals(carType)) {
            return new Byd();
        }
        throw new Exception("No such class");
    }
}




