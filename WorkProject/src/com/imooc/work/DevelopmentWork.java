package com.imooc.work;

public class DevelopmentWork extends Work{
    private int codeNum;
    private int openBug;

    public DevelopmentWork(){}

    public DevelopmentWork(String name,int codeNum, int openBug) {
       this.setName(name);
       this.setCodeNum(codeNum);
       this.setOpenBug(openBug);
    }

    public int getCodeNum() {
        return codeNum;
    }

    public void setCodeNum(int codeNum) {
        this.codeNum = codeNum;
    }

    public int getOpenBug() {
        return openBug;
    }

    public void setOpenBug(int openBug) {
        this.openBug = openBug;
    }

    public String workIntroduction(){
        String str=this.getName()+"工作的日报是：今天编写了"+this.getCodeNum()+"行代码，目前仍然有"+this.getOpenBug()+"个bug没有解决。";
        return str;
    }
}
