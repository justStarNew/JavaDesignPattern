package com.juststarnew.designpattern.abstractfactory;

/**
 * 描述：抽象工厂模式
 *
 * @author zhangcai at 2020/4/30 15:57
 * @version 1.0.0
 */
public class AbstractFactory {
    public static void main(String[] args) {
        IFactory factory1 = new AppleFactory();
        IFactory factory2 = new EditableAppleFactory();
        editableApple e1 = factory1.produceAppleEatable();
        e1.eat();
        apple a1 = factory1.produceApplePhone();
        a1.dial();
        apple a2 = factory2.produceApplePhone();
        a2.dial();
        editableApple e2 = factory2.produceAppleEatable();
        e2.eat();
    }



}

//抽象产品,苹果手机
interface apple {
    void dial();
}
//抽象产品*2,真实苹果
interface editableApple {
    void eat();
}
//工厂,原来的抽象工厂只生产一种产品，现在的工厂生产多种产品
interface IFactory {
    apple produceApplePhone();
    editableApple produceAppleEatable();
}

//具体产品
class a08Apple implements apple{

    @Override
    public void dial() {
        System.out.println("我是a08");
    }
}

class a09Apple implements apple {

    @Override
    public void dial() {
        System.out.println("我是a09");
    }
}

class redApple implements editableApple {

    @Override
    public void eat() {
        System.out.println("我是红苹果");
    }
}

class greenApple implements editableApple {

    @Override
    public void eat() {
        System.out.println("我是青苹果");
    }
}



//具体工厂
class AppleFactory implements IFactory{

    @Override
    public apple produceApplePhone() {
        return new a09Apple();
    }

    @Override
    public editableApple produceAppleEatable() {
        return new redApple();
    }
}

//具体工厂
class EditableAppleFactory implements IFactory {

    @Override
    public apple produceApplePhone() {
        return new a08Apple();
    }

    @Override
    public editableApple produceAppleEatable() {
        return new greenApple();
    }
}





