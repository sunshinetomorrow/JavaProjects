package com.imooc.anonymous;

//测试类
public class Test {

    public static void main(String[] args) {
        //完成成员内部类内部测试
        BallTest ballTest = new BallTest();
        BallTest.Inner_m test = ballTest.new Inner_m();
        test.play();

        System.out.println( "*************" );


        //完成方法内部类测试
        ballTest.info();

        System.out.println( "*************" );


        //完成匿名内部类测试
       ballTest.playBall( new Ball() {
           @Override
           public void play() {
               System.out.println( "匿名内部类："+"\n"+
                       "打排球" );
           }
       } );


    }

}
