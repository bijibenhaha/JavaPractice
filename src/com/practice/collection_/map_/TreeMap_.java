package com.practice.collection_.map_;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author Qingyang Du
 * @version 1.0
 */
public class TreeMap_ {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o2).length() - ((String) o1).length();
            }
        });
        treeMap.put("john",20);
        treeMap.put("mike",30);
        treeMap.put("jimmy",40);
        System.out.println("treeMap = "+treeMap);
    }
}
