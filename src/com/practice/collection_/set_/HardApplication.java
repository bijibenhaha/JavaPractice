package com.practice.collection_.set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author Qingyang Du
 * @version 1.0
 */
public class HardApplication {
    /**
     * 定义一个Employee类，该类包含：private成员属性name,age,birthday（MyDate类
     * ・型，其中 birthday カ MyDate型（属性包括：year, month, day），要求：
     * 1. 创建3个Employee 放入HashSet中
     * 2. 当 name和birthday的值相同时，认为是相同员工，不能添加到HashSet集合中
     */
    public static void main(String[] args) {
        HashSet<NewEmployee> employeeSet = new HashSet<>();

        // Create MyDate instances
        MyDate birthday1 = new MyDate(1990, 5, 15);
        MyDate birthday2 = new MyDate(1985, 8, 25);
        MyDate birthday3 = new MyDate(1990, 5, 15);
        MyDate birthday4 = new MyDate(1990, 5, 15);

        // Create Employee instances
        NewEmployee employee1 = new NewEmployee("John", 50000, birthday1);
        NewEmployee employee2 = new NewEmployee("Alice", 60000, birthday2);
        NewEmployee employee3 = new NewEmployee("John", 55000, birthday3);
        NewEmployee employee4 = new NewEmployee("John", 55000, birthday4);

        // Add employees to the HashSet
        employeeSet.add(employee1);
        employeeSet.add(employee2);
        employeeSet.add(employee3);
        employeeSet.add(employee4);

        // Display the HashSet
        System.out.println("Employees in the HashSet:");
        for (NewEmployee employee : employeeSet) {
            System.out.println("Name: " + employee.getName() + ", Birthday: " + employee.getBirthday());
        }
    }
}

class NewEmployee{
    private String name;
    private double sal;
    private MyDate birthday;

    public NewEmployee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    // Getter and Setter methods

    @Override
    public int hashCode() {
        // Implement hashCode based on name and birthday
        // 实现：当name 和 birthday 都相同时 返回的hashcode也相同
//        return 31 * name.hashCode() + birthday.hashCode();
        return Objects.hash(name, birthday); // Objects.hash()会最终调用里面元素的hashCode()，所以要重写MyDate类中的hashCode()方法
    }

    @Override
    public boolean equals(Object obj) {
        // Implement equals based on name and birthday
//        if (this == obj) return true;
//        if (obj == null || getClass() != obj.getClass()) return false;
//
//        NewEmployee other = (NewEmployee) obj;
//        System.out.println(name.equals(other.getName()));
//        System.out.println(1);
//        return name.equals(other.getName()) ;
        return true;
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

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }
}

class MyDate{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Getter and Setter methods

    @Override
    public int hashCode() {
        // Implement hashCode based on year, month, and day
        return 31 * year + 31 * month + day;
    }

//    @Override
//    public boolean equals(Object obj) {
//        // Implement equals based on year, month, and day
//        if (this == obj) return true;
//        if (obj == null || getClass() != obj.getClass()) return false;
//
//        MyDate other = (MyDate) obj;
//        return year == other.year && month == other.month && day == other.day;
//    }
}


