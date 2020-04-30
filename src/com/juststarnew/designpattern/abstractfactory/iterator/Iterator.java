package com.juststarnew.designpattern.abstractfactory.iterator;

/**
 * 描述：定义抽象产品，可以用来遍历Collection和Map
 *
 * @author zhangcai at 2020/4/30 17:15
 * @version 1.0.0
 */
public interface Iterator<T> {
    boolean hasNext();
    Object next();
}
