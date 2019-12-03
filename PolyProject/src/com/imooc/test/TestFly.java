package com.imooc.test;

import com.imooc.fly.Balloon;
import com.imooc.fly.Bird;
import com.imooc.fly.IFly;
import com.imooc.fly.Plane;

public class TestFly {
    public static void main(String[] args){

//        IFly fly1 = new Plane();
//        IFly fly2= new Bird();
//        IFly fly3= new Balloon();
        Plane fly1 = new Plane();
        Bird fly2= new Bird();
        Balloon fly3= new Balloon();

        fly1.fly();
        fly2.fly();
        fly3.fly();

    }



}
