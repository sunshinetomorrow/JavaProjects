package com.imooc.animal;

public class Cat extends Animal {
    //重写父类cry()方法，输出信息为“小猫的叫声：喵喵喵~~~”


    public Cat() {
    }

    @Override
    public void cry() {
        System.out.println("小猫的叫声：喵喵喵~~~~");
    }
}
