package com.imooc.test;

public class Truck extends Car {
  double weight;

  public Truck(){}

  public Truck(String color,String motor,double weight){
      super(color,motor);
      this.weight=weight;
  }

  public void display(){
      System.out.println("颜色："+color+"\t发动机的型号："+motor+"\t载重量："+weight);
  }

  public static void main(String[] args){
      Truck truck= new Truck("红色","玉柴",1.5);
      truck.display();
  }
}
