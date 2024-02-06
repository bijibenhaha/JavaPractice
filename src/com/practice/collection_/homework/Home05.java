package com.practice.collection_.homework;


import java.util.TreeSet;

/**
 * @author Qingyang Du
 * @version 1.0
 */
public class Home05 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        //分析源码
        //add 方法，因为 TreeSet() 构造器没有传入Comparator接口的匿名内部类
        //所以在底层 Comparable<? super K> k = (Comparable<? super K>) key;
        //即 把 Personx转成 Comparable类型
        treeSet.add(new Personx());//ClassCastException.
        treeSet.add(new Personx());//ClassCastException.
        treeSet.add(new Personx());//ClassCastException.

        System.out.println(treeSet);

    }
}

class Personx implements Comparable{

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
