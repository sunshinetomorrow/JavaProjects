package com.imooc.animal;

import com.imooc.animal.Animal;

public class Cat extends Animal {
    private double weight;

    public static int st3=44;

    static {
        System.out.println("我的子类的静态代码块");

    }

    {
        System.out.println("我是子类的构造代码块");
    }


    public Cat(){
//        this.month=23;
        System.out.println("我是子类的无参代码方法");


    }

    public Cat(String name,int month){
        /*子类构造默认调用父类无参构造方法，
        可以用过super()调用父类允许被访问的其他构造方法
        super()必须放在子类构造方法有效代码第一行
         */

        super(name,month);
        System.out.println("我是子类的带参构造");

    }

    public double getWeight() {

        return weight;
    }

    public void setWeight(double weight) {

        this.weight = weight;
    }

    public void run(){


        System.out.println(this.getName()+"是一只"+this.getSpecies()+",它在快乐的奔跑");
    }
}
