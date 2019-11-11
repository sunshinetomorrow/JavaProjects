package com.imooc.car;

public class Tricycle extends NonMotor{

    public Tricycle(){
        super.setWheel(3);

    }

    public String run(){
        String str="三轮车是一款有"+this.getWheel()+"个轮子的非机动车。";
        return str;

    }



}
