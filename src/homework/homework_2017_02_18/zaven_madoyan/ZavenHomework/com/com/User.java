package com;

import java.util.HashSet;

/**
 * Created by Zaven on 15.02.2017.
 */
public class User {
    private String name;
    private String surname;
    private int age;

    public User(String name,String surname,int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public static void main(String[] args) {
        HashSet<User> hs = new HashSet<User>();
        hs.add(new User("Zaven","Madoyan",28));
        hs.add(new User("Karen","Madoyan",27));
        for(User user:hs){
            System.out.println(user.surname+" "+user.name+" "+user.age);
        }
    }

}
