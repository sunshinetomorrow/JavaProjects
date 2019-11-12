package com.imook.fruit;

public class Fruits {
    // 私有属性：水果的形状（shape）和口感（taste）
    private String shape;
    private String taste;


    public Fruits() {

    }

    // 带参构造函数（参数为shape和taste）

    public Fruits(String shape, String taste) {
        this.setShape(shape);
        this.setTaste(taste);
    }


    //通过封装实现对私有属性的get/set访问

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }


    // 创建无参无返回值得方法eat（描述内容为：水果可供人们食用！）
    public void eat(){
        System.out.println("水果可供人们食用！");
    }




    // 重写equals方法，比较两个对象是否相等（比较shape，taste）



    public boolean equals(Fruits fruit) {
        if(this.getShape()==fruit.getShape() && this.getTaste()== fruit.getTaste()) {
            return true;
        }
        else {
            return false;
        }

    }
}
