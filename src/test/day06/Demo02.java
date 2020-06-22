package test.day06;

import test.day04.Singleton4;

public class Demo02 {
    public static void main(String[] args) {
        Singleton4 singleton = Singleton4.getSingleton();
        System.out.println(singleton.toString());
        Singleton4 singleton1 = Singleton4.getSingleton();
        System.out.println(singleton1.toString());
    }
}
