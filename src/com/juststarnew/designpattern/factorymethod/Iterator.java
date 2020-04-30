package com.juststarnew.designpattern.factorymethod;

/**
 * 描述：定义遍历的接口方法,遍历iterator方法，可以看成是工厂方法
 * 也就是定义要的产品规则的意思
 *
 * @author zhangcai at 2020/4/30 10:40
 * @version 1.0.0
 */
public interface Iterator<T> {
    boolean hasNext();
    T next();
}
