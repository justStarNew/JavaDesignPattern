package com.juststarnew.designpattern.factorymethod;

import com.anxpp.designpattern.iterator.MyIterator;

/**
 * 描述：数组实现的简单list实例
 *
 * @author zhangcai at 2020/4/30 10:50
 * @version 1.0.0
 */
public class ArrayList<E> implements List<E> {
    //目前list的大小
    private int size;
    //存储数组list的实际数组
    private Object[] array;
    //最大可以存储的大小
    private static final int MAX_ARRAYLIST_SIZE = 10;

    public ArrayList() {
        array = new Object[MAX_ARRAYLIST_SIZE];
    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator();
    }

    @Override
    public boolean add(E e) {
        if (MAX_ARRAYLIST_SIZE > size) {
            array[size++] = e;
            return true;
        }
        return false;
    }

    /*
    利用内部类属性可以访问外部类特性
     */
    private class MyIterator<T> implements Iterator<T> {
        //目前在第几个项了
        private int index;
        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public T next() {
            return (T) array[index++];
        }
    }

}
