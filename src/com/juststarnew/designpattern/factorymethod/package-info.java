/**
 * 描述：工厂方法
 * FactoryMethod 是一个工厂方法定义为一个接口,然后由多个具体工厂具体实现,生产具体产品
 * 下面简单实现一种java集合框架Collection.Collection是实现类里都实现了不同的iterator方法，
 * 所以，可以看成Iterator接口是抽象产品，而Collection的子类对Iterator的实现则可以
 * 理解为具体产品。工厂方法的意思就是定义一个参数规范，其中不同的实现由不同的工厂实现
 *
 * @author zhangcai at 2020/4/29 17:48
 * @version 1.0.0
 */
package com.juststarnew.designpattern.factorymethod;