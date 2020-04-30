package com.anxpp.designpattern.factorymethod;
//只是需要遍历一堆数据，那么只需要2个方法就可以了
//抽象产品，定义如何遍历。如果有多个不同的数据结构需要遍历，
//我们就需要一种用于遍历不同结构的工具，首先我们就需要为这个工具定义一个接口(抽象产品)，
//描述如何来遍历。
public interface Iterator<T> {
	boolean hasNext();	//是否还有下一个元素
	T next();			//得到下一个元素
}
