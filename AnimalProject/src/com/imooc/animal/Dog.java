package com.imooc.animal;

public class Dog extends Animal {
    private String sex;

    public Dog(){}

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void sleep(){
        super.eat();
        super.species="犬科";
        System.out.println(this.getName()+"现在"+this.getMonth()+"个月大的，它在睡觉~~");
    }

    //子类重写父类吃东西方法
    @Override
    protected void eat(){
        System.out.println(this.getName()+"最近没有食欲~~~");
    }

    @Override
    public void eat(
            String month){
        System.out.println(month+"最近没有食欲~~~");
    }
}
