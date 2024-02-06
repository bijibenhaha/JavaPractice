package com.practice.collection_.homework;

import java.util.ArrayList;

/**
 * @author Qingyang Du
 * @version 1.0
 */
public class Home01 {
    public static void main(String[] args) {
        /**
         * 要求实现:
         * 1)封装一个新闻类，包含标题和内容属性，提供get、set方法,
         * ，重写toString方法，打印对象
         * 时只打印标题:
         * 2) 只提供一个带参数的构造器，实例化对象时，只初始化标题;并且实例化两个对象:
         * 新闻一:新冠确诊病例超千万，数百万印度教信徒赴恒河“圣浴”引民众担忧
         * 新闻二:男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生
         * 3)将新闻对象添加到ArrayList集合中，并且进行倒序遍历:
         * 七
         * 在遍历集合过程中，对新闻标题进行处理，超过15字的只保留前15个，然后在后边加
         * 5
         * 在控制台打印遍历出经过处理的新闻标题:
         */

        ArrayList arrayList = new ArrayList();
        arrayList.add(new News("新冠确诊病例超千万，数百万印度教信徒赴恒河“圣浴”引民众担忧"));
        arrayList.add(new News("男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生"));
        //倒序遍历
        for (int i = arrayList.size()-1; i >= 0 ; i--) {
//            System.out.println(arrayList.get(i));
            //根据要求剪切title
            News news = (News)arrayList.get(i);
            System.out.println(cut(news.getTitle()));
        }

    }

    public static String cut(String title){
        if (title == null){
            return "";
        } else if (title.length() <= 15) {
            return title;
        }else {
            return title.substring(0,15) + "...";
        }

    }


}

class News{
    private String title;
    private String cotent;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCotent() {
        return cotent;
    }

    public void setCotent(String cotent) {
        this.cotent = cotent;
    }

    @Override
    public String toString() {
        return title;
    }
}


