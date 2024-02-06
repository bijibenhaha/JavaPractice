package com.practice.collection_.homework;

import com.sun.prism.impl.shape.BasicRoundRectRep;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Qingyang Du
 * @version 1.0
 */
public class Home02 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Car car1 = new Car("xiaopeng",20000);
        Car car2 = new Car("jike",10000);
        Car car3 = new Car("lixiang",30000);
        Car car4 = new Car("weilai",40000);
        // 添加元素
        arrayList.add(car1);
        arrayList.add(car2);
        arrayList.add(car3);
        arrayList.add(car4);
        System.out.println(arrayList);
        //删除元素
//        arrayList.remove(car1);
//        System.out.println(arrayList);
        // 查找元素是否存在
        System.out.println(arrayList.contains(car2));
        // 获取元素个数
        System.out.println(arrayList.size());
        // 判断是否为空
        System.out.println(arrayList.isEmpty());
        // 清空
//        arrayList.clear();
//        System.out.println(arrayList);
        // 添加多个元素
        ArrayList arrayList1 = new ArrayList();
        arrayList1.addAll(arrayList);
        System.out.println(arrayList1);
        // 查找多个元素是否都存在
        System.out.println(arrayList1.containsAll(arrayList));
        // 删除多个元素
        arrayList1.removeAll(arrayList);
        System.out.println(arrayList1);
        // 遍历
        // 增强for
        for (Object o :arrayList) {
            System.out.println(o);
        }
        // 迭代器
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

    }
}

class Car{
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name;
    }
}
