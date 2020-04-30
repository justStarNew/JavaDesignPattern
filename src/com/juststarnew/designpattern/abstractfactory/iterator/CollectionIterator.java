package com.juststarnew.designpattern.abstractfactory.iterator;

import java.util.Collection;

/**
 * 描述：具体产品,使用了代理模式
 *
 * @author zhangcai at 2020/4/30 17:19
 * @version 1.0.0
 */
public class CollectionIterator<T> implements Iterator<T>{
    private java.util.Iterator<T> iterator;

    public CollectionIterator(Collection<T> collection) {
        this.iterator = collection.iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public T next() {
        return iterator.next();
    }
}
