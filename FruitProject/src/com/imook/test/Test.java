package com.imook.test;

import com.imook.fruit.Banana;
import com.imook.fruit.Fruits;
import com.imook.fruit.Waxberry;

public class Test {
    public static void main(String[] args) {
        // 实例化2个父类对象，传入两组相同的参数值
        Fruits fruit1 = new Fruits("圆形","甜");
        Fruits fruit2 = new Fruits("圆形","甜");


        // 调用父类eat方法
        fruit1.eat();


        // 测试重写equals方法，判断两个对象是否相等
        System.out.println("frui1和frui2的引用比较："+fruit1.equals(fruit2));


        System.out.println("————————————————————————————————————————");
        // 实例化子类对象，并传入相关参数值
        Waxberry waxberry = new Waxberry("圆形","酸甜适中","紫红色");

        // 调用子类face方法和eat方法
        waxberry.face();
        waxberry.eat();


        // 测试重写toString方法，输出子类对象的信息
        System.out.println(waxberry.toString());


        System.out.println("——————————————————————————————————————————————");
        // 实例化Banana类对象，并传入相关参数值
        Banana banana = new Banana("形短而稍圆","香甜","仙人蕉");


        // 调用子类的advantage和它的重载方法
        banana.advantage();
        banana.advantage("黄色");



    }
}

