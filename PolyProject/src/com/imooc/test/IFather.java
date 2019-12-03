package com.imooc.test;

public interface IFather {
    void say();

    default void connet(){
        System.out.println( "IFather中的connet" );
    }
}
