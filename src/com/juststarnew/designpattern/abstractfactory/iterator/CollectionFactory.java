package com.juststarnew.designpattern.abstractfactory.iterator;

import java.util.Collection;
import java.util.Map;

/**
 * 描述：具体工厂
 *
 * @author zhangcai at 2020/4/30 17:18
 * @version 1.0.0
 */
public class CollectionFactory<T> implements IFactory<T>{
    @Override
    public Iterator<T> genCollectionIterator(Collection<T> collection) {
        return new CollectionIterator<>(collection);
    }

    @Override
    public Iterator<T> genMapIterator(Map<T,Object> map) {
        return new MapIterator<>(map);
    }
}
