package com.practice.collection_;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Qingyang Du
 * @version 1.0
 */
public class LinkedListCRUD {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println("linkedList=" + linkedList);

        // 删除
        linkedList.remove();//删除第一个 ==> removeFirst()
        System.out.println("linkedList=" + linkedList);

        //修改
        linkedList.set(0,99);
        System.out.println("linkedList=" + linkedList);

        // 查找
        Object o = linkedList.get(0);
        System.out.println("得到的值是："+ o);

        //遍历
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("next="+next);
        }

        for (Object o1 :linkedList) {
            System.out.println("next1="+o1);
        }
    }
}
