package com.imooc.car;

public class Bicycle extends NonMotor{
    public Bicycle( String color,String brand){
        super(color,brand);

    }

    public String run(){
        String str="这是一辆"+this.getColor()+"颜色的，"+this.getBrand()
                +"牌的自行车。";
        return str;
    }

}
