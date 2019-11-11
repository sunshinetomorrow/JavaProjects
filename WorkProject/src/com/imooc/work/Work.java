package com.imooc.work;

public class Work {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Work(){}

    public Work(String name) {
        this.setName(name);
    }

    public String workIntroduction(){
        String str="开心工作";
        return str;
    }
}
