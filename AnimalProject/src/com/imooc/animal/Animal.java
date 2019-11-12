package com.imooc.animal;

// final class   dev test
final public  class Animal {
    /**
     * private:只允许在本类中进行访问
     * public:允许在任意位置访问
     */
    private  String name="妮妮";
    protected int month=2;
    String species="动物";
    public static final  int temp=15;


    static {
        System.out.println("我的父类的静态代码块");
    }
    public static int st2=23;
    private static int st1=22;




    {
        System.out.println("我是父类的构造代码块");
    }


     public Animal(String name,int month){
        this.setName(name);
        this.setMonth(month);
        System.out.println("我是父类的带参构造");
    }

    //父类的构造方法不允许被继承，不允许被重写，但是会影响子类对象的实例化过程
    public  Animal(){
        System.out.println("我是父类的无参构造方法");

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    //吃东西
    public void  eat(){

        System.out.println(this.getName()+"在吃东西");

        final Animal animal = new Animal("凡凡",1);
//        animal = new Animal();
        animal.month=12;
        animal.name="豆豆";


    }

    public void eat(String name){
        System.out.println(name+"在吃东西");
    }


    public String toString(){
        return "昵称："+this.getName()+";年龄："+this.getMonth();
    }


    public Animal create(){
        return  new Animal();
    }

}













