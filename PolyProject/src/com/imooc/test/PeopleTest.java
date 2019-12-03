package com.imooc.test;

import com.imooc.people.Person;

public class PeopleTest {

    public static void main(String[] args){
        Person lili = new Person();
//        lili.age=12;


    /*
        Person.Heart myheart = new Person().new Heart();
        System.out.println( myheart.beat() );

        myheart=lili.new Heart();
        System.out.println( myheart.beat() );

        myheart=lili.getHeart();
        System.out.println( myheart.beat() );

        */

    //获取静态内部类对象实例
//        Person.Heart myHeart = new Person.Heart();
//        System.out.println( myHeart.beat() );

       System.out.println( lili.getHeart() );




    }
}
