package com.juststarnew.designpattern.factorymethod;

/**
 * 描述：要遍历的目标，即构造者。它有不同的实现。链表list和数组list
 *
 * @author zhangcai at 2020/4/30 10:42
 * @version 1.0.0
 */
public interface List<E> {
    Iterator<E> iterator();
    boolean add(E e);
}
