package com.imooc.fly;

public class Plane implements IFly {
    @Override
    public void fly() {
        System.out.println( "飞机在天上飞" );
    }
}
