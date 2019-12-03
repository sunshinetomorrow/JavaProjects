package com.imooc.animal;

public class Cat extends Animal{
    private double weight;

    public Cat(){}


    public Cat(String name, int month, double weight) {
        super(name,month);
        this.setWeight(weight);

    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void eat() {
       System.out.println("猫吃鱼");
    }

    public void run(){
        System.out.println("小猫快乐的奔跑");

    }

    public void playBall(){
        System.out.println("小猫喜欢玩线球");

    }

}
