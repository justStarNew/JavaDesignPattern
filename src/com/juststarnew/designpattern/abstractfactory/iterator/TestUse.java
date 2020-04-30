package com.juststarnew.designpattern.abstractfactory.iterator;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 描述：
 *
 * @author zhangcai at 2020/4/30 17:25
 * @version 1.0.0
 */
public class TestUse {

    public static void main(String[] args) {
        Collection<Integer> collection = new HashSet<>();
        Map<Integer,Object> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            collection.add(i);
            map.put(i, i+"哈哈");
        }
        CollectionFactory<Integer> collectionFactory = new CollectionFactory<>();
        Iterator<Integer> integerIterator = collectionFactory.genCollectionIterator(collection);
        Iterator<Integer> integerIterator1 = collectionFactory.genMapIterator(map);
        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());
        }
        System.out.println("----------------");
        while (integerIterator1.hasNext()) {
            System.out.println(integerIterator1.next());
        }


    }

}
