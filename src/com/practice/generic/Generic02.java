package com.practice.generic;

import java.util.*;

/**
 * @author Qingyang Du
 * @version 1.0
 */
public class Generic02 {
    public static void main(String[] args) {
        // hashset and hashmap
        Student stu01 = new Student("john",20,90);
        Student stu02 = new Student("marry",22,80);
        Student stu03 = new Student("ama",23,70);
        Student stu04 = new Student("tom",24,60);
        // hashset
        HashSet<Student> students_set = new HashSet<>();
        students_set.add(stu01);
        students_set.add(stu02);
        students_set.add(stu03);
        students_set.add(stu04);
        //增强for遍历
        for (Student o :students_set) {
            System.out.println(o);
        }
        // hashmap
        HashMap<String, Student> stringStudentHashMap = new HashMap<>();
        stringStudentHashMap.put(stu01.getName(),stu01);
        stringStudentHashMap.put(stu02.getName(),stu02);
        stringStudentHashMap.put(stu03.getName(),stu03);
        stringStudentHashMap.put(stu04.getName(),stu04);
        //迭代器
//        Set<String> strings = stringStudentHashMap.keySet();
//        Collection<Student> values = stringStudentHashMap.values();
        Set<Map.Entry<String, Student>> entries = stringStudentHashMap.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next = iterator.next();
            System.out.println(next.getKey() + ":" + next.getValue());
        }
    }
}

class Student{
    private String name;
    private int age;
    private double score;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "得了" + score +"分";
    }
}
