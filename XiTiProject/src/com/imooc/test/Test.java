package com.imooc.test;

import com.imooc.animal.Animal;
import com.imooc.animal.Dog;
import com.imooc.animal.Sheep;
import com.imooc.animal.Cat;

import java.util.Random;

public class Test {

    public static void main(String[] args) {
        //生成父类对象数组,数组长度为5
        Animal animal[] = new Animal[5];


        //产生随机数，随机产生三种具体子类的实例
        for(int i =0;i<5;i++){
            int temp = (int)(Math.random()*3);
//            int temp= new Random().nextInt(3);
            if(temp==0){
                animal[i]=new Cat();
            }else if(temp==1){
                animal[i]=new Dog();
            }else if(temp==2){
                animal[i]=new Sheep();
            }

        }

        //循环输出，循环体中每个对象分别调用cry()方法。
        for(int i=0;i<5;i++){
            animal[i].cry();
        }



    }

}

