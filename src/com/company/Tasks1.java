package com.company;

public class Tasks1 {
    //НЕ правильно, нужно написать без static
    private static String s="world";
    public String toString(){
        return s;
    }
    public static void main(String[] args) {
        //Вот правильное решение!
        Tasks1 tasks = new Tasks1();
        System.out.println(tasks);

    }
}
