package com.imooc.animal;

public class Dog extends Animal{
    private String sex;

    public Dog(){}

    public Dog(String name, int month, String sex) {
        this.setName(name);
        this.setMonth(month);
        this.setSex(sex);
    }


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void eat() {
        System.out.println("狗狗爱吃肉");
    }

    public void sleep(){
        System.out.println("小狗有午睡的习惯");

    }
}
