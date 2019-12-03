package com.imooc.anonymous;

//创建类BallTest  外部类

public class BallTest {


    // 创建成员内部类Inner_m
    public class Inner_m{

        public void play(){
            System.out.println( "成员内部类：" );
            System.out.println( "打篮球" );

        }

    }

    // 创建方法内部类
    public void info(){

//        class Inner_f{
//            public String play(){
////                System.out.println( "*************" );
//                return "方法内部类：" +
//                        "+\n" +
//                        "打乒乓球";
//
//            }
//        }
//
//        return new Inner_f().play();

        class Inner_f{
            public void play(){
                System.out.println( "方法内部类：" );
                System.out.println( "打乒乓球" );

            }
        }

          new Inner_f().play();
    }


    // 定义一个方法void playBall(Ball ball)，调用play()方法
    public void playBall(Ball ball){
        ball.play();

    }


}
