package com.imooc.test;

import com.imooc.animal.Animal;

public class TestThree extends Animal {

    public static  void main(String[] args){
        Animal one = new Animal("花花",2);
        Animal two = new Animal("花花",2);

        String str1 = new String("hello");
        String str2 = new String("hello");

        //1、输出对象名时，默认会直接调用类中的toString

        System.out.println(one.toString());
        System.out.println(one);

        System.out.println("==================");

        System.out.println(str1);



    }
}
