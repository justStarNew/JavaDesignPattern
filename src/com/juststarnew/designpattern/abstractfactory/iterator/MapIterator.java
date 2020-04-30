package com.juststarnew.designpattern.abstractfactory.iterator;

import java.util.Map;

/**
 * 描述：具体产品
 *
 * @author zhangcai at 2020/4/30 17:21
 * @version 1.0.0
 */
public class MapIterator<T> implements Iterator<T> {
    private java.util.Iterator<Map.Entry<T, Object>> iterator;

    public MapIterator(Map<T,Object> map) {
        this.iterator = map.entrySet().iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public Object next() {
        return iterator.next().getValue();
    }
}
