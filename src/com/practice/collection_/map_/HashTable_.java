package com.practice.collection_.map_;

import java.util.Hashtable;

/**
 * @author Qingyang Du
 * @version 1.0
 */
public class HashTable_ {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("john",20);
        hashtable.put("mike",25);
        System.out.println("john = " + hashtable.get("john"));

    }
}
