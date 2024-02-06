package com.practice.generic;

import java.util.ArrayList;

/**
 * @author Qingyang Du
 * @version 1.0
 */
public class Generic01 {
    public static void main(String[] args) {

        ArrayList<Dog> arrayDogs = new ArrayList<>();
        arrayDogs.add(new Dog("a",5));
        arrayDogs.add(new Dog("b",6));
        for(Dog dog :arrayDogs) {
            System.out.println(dog.getName());
        }

    }
}

class Dog {
    private String name;
    private int age;
    public Dog(String name, int age) {
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
}