package com.imooc.test;
import com.imooc.anonymous.Man;
import com.imooc.anonymous.Person;
import com.imooc.anonymous.Woman;


public class PersonTest {

//    //方案1
//    public void getRead(Man man){
//       man.read();
//
//    }
//    public void getRead(Woman woman){
//        woman.read();
//
//    }


    //方案2
    public void getRead(Person person){
        person.read();

    }


    public static void main(String[] args){
        PersonTest test = new PersonTest();
        Man one = new Man();
        Woman two = new Woman();
        test.getRead( one );
        test.getRead( two );




//        test.getRead( new Person() {
//            @Override
//            public void read() {
//                System.out.println( "男生喜欢看科幻类书籍" );
//            }
//        } );
//
//        test.getRead( new Person() {
//            @Override
//            public void read() {
//                System.out.println( "女生喜欢看小说" );
//            }
//        } );




    }
}
