package com.juststarnew.designpattern.factorymethod;

/**
 * 描述：链表实现的简单list
 *
 * @author zhangcai at 2020/4/30 11:33
 * @version 1.0.0
 */
public class LinkedList<E> implements List<E> {
    //第一个元素,链表的第一个节点
    Node<E> first;

    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator();
    }

    @Override
    public boolean add(E e) {
        Node<E> newNode = new Node<>(e,null);
        if(first == null) {
            first = newNode;
            return true;
        }
        //找到最后一个节点
        Node<E> lastNode = first;
        while (lastNode.nextPoint != null) {
            lastNode = lastNode.nextPoint;
        }
        lastNode.nextPoint = newNode;
        return true;
    }

    private class Node<E> {
        E data;
        Node<E> nextPoint;

        private Node(E data, Node<E> nextPoint) {
            this.data = data;
            this.nextPoint = nextPoint;
        }
    }


    private class LinkedListIterator implements Iterator<E> {
        //下一个元素
        private Node<E> next;

        public LinkedListIterator() {
            next = first;
        }

        @Override
        public boolean hasNext() {
            return next != null;
        }

        @Override
        public E next() {
            E e = next.data;
            next = next.nextPoint;
            return e;
        }
    }
}
