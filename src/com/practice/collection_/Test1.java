package com.practice.collection_;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Qingyang Du
 * @version 1.0
 */
public class Test1 {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add(new Book("语文","aa",12.88));
        arrayList.add(new Book("数学","bb",15.88));
        arrayList.add(new Book("英语","cc",20.88));
        // 方式一：普通
        // 首先，得到arrayList对应的迭代器
//        Iterator iterator = arrayList.iterator();
//        while (iterator.hasNext()) {
//            Object next =  iterator.next();
//            System.out.println(next);
//        }
        //注意：当退出while循环后 , 这时iterator迭代器，指向最后的元素
        //   iterator.next();//NoSuchElementException
        //如果希望再次遍历，需要重置我们的迭代器
//        iterator = arrayList.iterator();

        // 方式二：增强for
        for (Object o :arrayList) {
            System.out.println(o);
        }


    }
}

class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
