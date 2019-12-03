package com.imooc.people;

public class Person {

    public static int age;

    public Object getHeart() {
//        new Heart().temp=12;
//
//        return new Heart();
        class Heart {


            public int age = 13;
            int temp = 22;


            public void say() {
                System.out.println( "hello" );
            }


            public void eat() {
                System.out.println( "人会吃东西" );
            }

            public String beat() {
                new Person().eat();
                return Person.age + "岁的心脏在跳动";
            }

        }

        return new Heart().beat();
    }



    public void eat() {
        System.out.println( "人会吃东西" );
    }


//    public static class  Heart{
//
//
//            int age=13;
//            int temp=22;
//
//        public String beat(){
//            new Person().eat();
//            return new Person().age+"岁的心脏在跳动";
//            }
//
//    }

    /*
    public class  Heart{


        int age=13;
        int temp=22;

        public void eat(){
            System.out.println( "我是内部类的eat" );
        }

        public String beat(){
            eat();
            Person.this.eat();
            return Person.this.age+"岁的心脏在跳动";
        }


    */


}
