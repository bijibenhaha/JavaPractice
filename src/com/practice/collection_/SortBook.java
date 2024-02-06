package com.practice.collection_;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * @author Qingyang Du
 * @version 1.0
 */
public class SortBook {
    public static void main(String[] args) {
//        List list = new ArrayList();
//        List list = new LinkedList();
        List list = new Vector();
        list.add(new Book1("红楼梦", "曹雪芹", 100));
        list.add(new Book1("西游记", "吴承恩", 10));
        list.add(new Book1("水浒传", "施耐庵", 19));
        list.add(new Book1("三国", "罗贯中", 80));
        for (Object obj :list) {
            System.out.println(obj);
        }
        System.out.println("------");
        // 排序
        sort(list);
        System.out.println("从小到大排序：");
        for (Object o :list) {
            System.out.println(o);
        }


    }

    public static void sort(List list){
        int length = list.size();
        // 冒泡排序:从小到大
        for (int i = 0; i < length-1; i++) {
            for (int j = 0; j <length-1-i ; j++) {
                Book1 book1 = (Book1) list.get(j);
                Book1 book2 = (Book1) list.get(j+1);
                if (book1.getPrice() > book2.getPrice()){
                    list.set(j,book2);
                    list.set(j+1,book1);
                }
            }
        }
    }

    
}

class Book1{
    private String name;
    private String author;
    private double price;

    public Book1(String name, String author, double price) {
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
        return "名称: "+name+"价格："+price;
    }
}

