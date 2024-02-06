package com.practice.generic;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author Qingyang Du
 * @version 1.0
 */
public class exercise01 {
    public static void main(String[] args) {
        // 泛型关键词：类、接口 申明、实例化

        ArrayList<Employee> employees = new ArrayList<>();
        Date date01 = new Date(2001,2,14);
        Date date02 = new Date(2001,2,14);
        Date date03 = new Date(2003,2,14);
        Date date04 = new Date(2004,2,14);
        Employee john = new Employee("john", 100000, date01);
        Employee john1 = new Employee("john", 200000, date02);
        Employee mike = new Employee("mike", 300000, date03);
        Employee marry = new Employee("marry", 400000, date04);

        employees.add(john1);
        employees.add(john);
        employees.add(mike);
        employees.add(marry);

        System.out.println("employees是"+ employees);
        // 排序
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                // 字符串比较大小 用compareTo()
                int com = o1.getName().compareTo(o2.getName());
                if (com == 0) {
                    // 这里是对Date类中的比较，比较乱，应该放到Date类中
                    // 根据生日先后
                    return o1.getBirtday().compareTo(o2.getBirtday());
                } else {
                    return com;
                }
            }
        });

        System.out.println("new employees是  "+ employees);
    }
}

class Employee{
    private String name;
    private double sal;
    private Date birtday;

    public Employee(String name, double sal, Date birtday) {
        this.name = name;
        this.sal = sal;
        this.birtday = birtday;
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

    public Date getBirtday() {
        return birtday;
    }

    public void setBirtday(Date birtday) {
        this.birtday = birtday;
    }

    @Override
    public String toString() {
        return name + "--"+sal + "--"+ birtday;
    }
}

// public interface Comparator<T>中的int compare(T o1, T o2); 有两个参数
// public interface Comparable<T>中的public int compareTo(T o); 只有一个参数

class Date implements Comparable<Date>{
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return year+":"+month+":"+day;
    }

    @Override
    public int compareTo(Date o) {
        int y = this.year - o.getYear();
        int m = this.month - o.getMonth();
        int d = this.day - o.getDay();
        if (y != 0){
            return y;
        }else if (m !=0){
            return m;
        }else if (d !=0){
            return d;
        }else {
            return 0;//表示不比了
        }
    }

}


