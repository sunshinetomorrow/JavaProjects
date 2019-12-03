package com.imooc.test;


import com.imooc.earth.*;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println("第一个地球创建中。。。。");
        Earth one = Earth.getEarth();


        System.out.println("第二个地球创建中。。。。");
        Earth two = Earth.getEarth();

        System.out.println("第三个地球创建中。。。。");
        Earth three = Earth.getEarth();

        System.out.println("问：三个地球是同一个么？");
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);

        System.out.println("=========================");
        SingletonTwo one1 = SingletonTwo.getInstance();
        SingletonTwo two1 = SingletonTwo.getInstance();
        System.out.println(one1);
        System.out.println(two1);


        System.out.println("=========================");
        System.out.println("创建1号皇帝对象");
        Emperor one2 = Emperor.getEmperor();

        System.out.println("创建2号皇帝对象");
        Emperor two2 = Emperor.getEmperor();

        System.out.println("创建3号皇帝对象");
        Emperor three2 = Emperor.getEmperor();

        System.out.println("三个皇帝对象依次是：");
        System.out.println(one2);
        System.out.println(two2);
        System.out.println(three2);

    }
}
