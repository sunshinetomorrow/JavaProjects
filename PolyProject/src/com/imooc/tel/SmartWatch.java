package com.imooc.tel;

public class SmartWatch implements INet,IPhone{
//    public static final int TEMP=30;

    public void call(){
        System.out.println("智能手表可以打电话");
    }

    public void message(){
        System.out.println("智能手表可以发短信");
    }
//    public void network(){
//        System.out.println( "智能手表可以上网" );
//    }

    @Override
    public void netWork() {
        System.out.println( "智能手表可以上网" );

    }
//
//    @Override
//    public void connect() {
//
//    }



    public void connect() {
        System.out.println( "SmartWath中的connet" );

    }

    @Override
    public void photo() {

    }
}
