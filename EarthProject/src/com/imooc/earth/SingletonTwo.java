package com.imooc.earth;

public class SingletonTwo {

    private SingletonTwo(){}

    private static SingletonTwo instance=null;

    public  static  SingletonTwo getInstance(){
        if(instance==null){
            instance=new SingletonTwo();
        }

        return instance;
    }


}
