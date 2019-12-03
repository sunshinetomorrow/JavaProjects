package com.imooc.shape;

public class Rectangle extends Shape {
    //属性：矩形的长lenghth、宽wide
    private float lenghth;
    private float wide;

    //创建带参构造方法以及无参构造方法
    public Rectangle(){}

    public Rectangle(float lenghth, float wide) {
        this.lenghth = lenghth;
        this.wide = wide;
    }

    //创建针对长、宽的赋值和取值方法

    public float getLenghth() {
        return lenghth;
    }

    public void setLenghth(float lenghth) {
        this.lenghth = lenghth;
    }

    public float getWide() {
        return wide;
    }

    public void setWide(float wide) {
        this.wide = wide;
    }


    //重写父类的area（）方法

    @Override
    public float area() {
        return this.getLenghth()*this.getWide();
    }
}
