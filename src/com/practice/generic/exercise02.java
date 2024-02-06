package com.practice.generic;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @author Qingyang Du
 * @version 1.0
 */
public class exercise02 {
    public static void main(String[] args) {

    }
    @Test
    public void testList(){
        DAO<User> userDAO = new DAO<>();
        userDAO.save("01",new User(1,10,"jack"));
        userDAO.save("02",new User(2,18,"king"));
        userDAO.save("03",new User(3,20,"tom"));
        userDAO.save("04",new User(4,22,"marry"));
        List<User> list = userDAO.list();
        System.out.println(list);

        System.out.println("=====修改后：======");
        userDAO.update("04",new User(4,22,"!!!!!"));
        List<User> list1 = userDAO.list();
        System.out.println(list1);

    }

}

class DAO<T>{
    private Map<String,T> map = new HashMap<>();

    public void save(String id,T entity){
        map.put(id,entity);

    }
    public T get(String id){
        return map.get(id);
    }

    public void update(String id,T entity){
        map.put(id,entity);
    }

    public List<T> list(){
        Collection<T> values = map.values();
        ArrayList<T> ts = new ArrayList<>();
        for (T o :values) {
            ts.add(o);
        }
        return ts;

    }
    public void delete(String id){
        map.remove(id);
    }
}


class User{
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

