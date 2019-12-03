package com.imooc.test;

import com.imooc.animal.*;

public class MasterTest {
    public static void main(String[] args){
        Master master = new Master();
        Cat one = new Cat();
        Dog two = new Dog();

        master.feed(one);
        master.feed(two);

    }
}
