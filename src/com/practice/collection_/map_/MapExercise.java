package com.practice.collection_.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author Qingyang Du
 * @version 1.0
 */
public class MapExercise {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap<>();
        //添加对象
        hashMap.put(1, new Emp("jack", 300000, 1));
        hashMap.put(2, new Emp("tom", 21000, 2));
        hashMap.put(3, new Emp("milan", 12000, 3));

        //2种方式 遍历
        // 1 keySet() 以及 for
//        Set set = hashMap.keySet();
//        for (Object o :set) {
        // 得到 value
//            Emp o1 = (Emp) hashMap.get(o);
//            if (o1.getSal() > 18000){
//                System.out.println(o1);
//            }
//        }

        // 2 entrySet() 以及 迭代器
        Set set = hashMap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            // 得到value
            Map.Entry entry =  (Map.Entry) next;
            Emp o2 = (Emp) entry.getValue();
            if (o2.getSal() > 18000){
                System.out.println(o2);
            }

        }


    }
}

class Emp {
    private String name;
    private double sal;
    private int id;

    public Emp(String name, double sal, int id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id=" + id +
                '}';
    }
}

