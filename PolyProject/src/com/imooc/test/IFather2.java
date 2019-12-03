package com.imooc.test;

public interface IFather2 {
    void fly();
    default void connet(){
        System.out.println( "IFather2中的connet" );
    }
}
