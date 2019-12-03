package com.imooc.test;

public interface ISon extends IFather,IFather2 {
    void run();

    default void connet(){
        System.out.println( "ISon中的connect" );
    }
}
