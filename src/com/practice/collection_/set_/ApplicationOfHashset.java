package com.practice.collection_.set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author Qingyang Du
 * @version 1.0
 */
public class ApplicationOfHashset {
    public static void main(String[] args) {
        /**
         定义一个Employee类，该类包含：private成员属性name,age 要求:
         创建3个Employee 对象放入 HashSet中
         当 name和age的值相同时，认为是相同员工, 不能添加到HashSet集合中
         */

//        System.out.println(str1 == str2);
//        System.out.println(str1.equals(str2));
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("a",20));
        hashSet.add(new Employee("b",30));
        hashSet.add(new Employee("c",40));
        hashSet.add(new Employee("a",20));
        hashSet.add(new Employee("a",20));
        hashSet.add(null);
        hashSet.add(null); // null重复时，不会调用equals()方法
        hashSet.add(null);
        System.out.println(hashSet);

    }
}

class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Override
//    public boolean equals(Object obj) {
//        Employee anEmployee = (Employee) obj;
//        if (age == anEmployee.getAge() && name.equals(anEmployee.getName())){
//            return true;
//        }else {
//            return false;
//        }
//
//    }

    // 表示name 和 age 都相同时，返回true，否则返回false
    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return age == employee.age && name.equals(employee.name);
        return true;
    }

    // 表示 如果name和age都相同 返回相同的hashcode
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", age=" + age + ";";
    }
}

