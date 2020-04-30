package com.juststarnew.designpattern.abstractfactory.iterator;

import java.util.Collection;
import java.util.Map;

/**
 * 描述：定义工厂,定义多个产品群。这里即返回遍历Collection
 * 又返回Map的iterator
 *
 * @author zhangcai at 2020/4/30 17:13
 * @version 1.0.0
 */
public interface IFactory<T> {
    public Iterator<T> genCollectionIterator(Collection<T> collection);

    public Iterator<T> genMapIterator(Map<T,Object> map);
}
