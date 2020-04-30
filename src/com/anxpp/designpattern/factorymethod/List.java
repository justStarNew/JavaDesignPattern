package com.anxpp.designpattern.factorymethod;

//便于介绍，不做多的操作
//这里就是我们要遍历的目标，而这些目标此处我们暂定为列表，这就是构造者
public interface List<T> {
	Iterator<T> iterator();	//返回一个遍历器
	boolean add(T t);		//添加元素到列表
}
