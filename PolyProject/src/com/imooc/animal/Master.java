package com.imooc.animal;

public class Master {

    /*喂养宠物*
      喂猫咪：吃完东西后，主人会带着去玩线球
      喂狗狗：吃完东西后，主人会带着狗狗去睡觉
     */

    public void feed(Cat cat){
        cat.eat();
        cat.playBall();

    }


    public void feed(Dog dog){
        dog.eat();
        dog.sleep();

        }



}
