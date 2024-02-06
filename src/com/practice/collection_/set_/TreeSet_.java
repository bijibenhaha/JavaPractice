package com.practice.collection_.set_;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author Qingyang Du
 * @version 1.0
 */
public class TreeSet_ {
    public static void main(String[] args) {
//        TreeSet treeSet = new TreeSet();
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                // 注意：当o1和o2 相同时，不添加
                return ((String) o2).compareTo((String) o1);
            }
        });

        treeSet.add("a");
        treeSet.add("b");
        treeSet.add("c");
        treeSet.add("a");
        System.out.println("treeSet = " + treeSet);

    }
}
