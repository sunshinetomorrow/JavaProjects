package com.imooc.fly;

public class Balloon implements IFly{
    @Override
    public void fly() {
        System.out.println( "气球飞上天空" );
    }
}
