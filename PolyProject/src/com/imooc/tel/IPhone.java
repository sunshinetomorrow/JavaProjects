package com.imooc.tel;

public interface IPhone {

    public void photo();

    default void connect(){
        System.out.println( "我是IPhoto的connection" );
    }
}
