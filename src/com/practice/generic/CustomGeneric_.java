package com.practice.generic;

/**
 * @author Qingyang Du
 * @version 1.0
 */
public class CustomGeneric_ {
    public static void main(String[] args) {

    }
}

class ImAA implements IUSB<String,Integer>{

    @Override
    public void hi(String s, Integer integer) {

    }

    @Override
    public String say(Integer integer) {
        return null;
    }
}


interface IUSB<T,U>{
    void hi(T t,U u);
    T say(U u);
    //default 方法也可以用泛型
    default Object pose(T t){
        return null;
    }

}
