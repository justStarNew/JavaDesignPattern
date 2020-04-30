package com.juststarnew.designpattern.factorymethod;

/**
 * 描述：
 *
 * @author zhangcai at 2020/4/30 11:26
 * @version 1.0.0
 */
public class TestList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> linkedList = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
            linkedList.add(i);
        }
        Iterator<Integer> iterator = list.iterator();
        Iterator<Integer> linkedIterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("---------------------");
        while (linkedIterator.hasNext()) {
            System.out.println(linkedIterator.next());
        }

        System.out.println("---------------------");
    }
}
