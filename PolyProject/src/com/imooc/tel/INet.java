package com.imooc.tel;

public interface INet {
    public void netWork();


    int TEMP=20;
    //int static final temp=20;

    default void connect(){
        System.out.println( "我是接口中的默认链接" );
    }

    static void stop(){

        System.out.println( "我是接口中的静态方法" );
    }
}
