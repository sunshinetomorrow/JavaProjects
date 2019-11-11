package com.imooc.work;


public class TestWork extends Work{
    private int testCaseNum;
    private int bugNum;

    public TestWork(){}

    public TestWork(String name,int testCaseNum, int bugNum) {
        this.setName(name);
        this.setTestCaseNum(testCaseNum);
        this.setBugNum(bugNum);
    }

    public int getTestCaseNum() {
        return testCaseNum;
    }

    public void setTestCaseNum(int testCaseNum) {
        this.testCaseNum = testCaseNum;
    }

    public int getBugNum() {
        return bugNum;
    }

    public void setBugNum(int bugNum) {
        this.bugNum = bugNum;
    }

    public String workIntroduction(){
        String str=this.getName()+"工作的日报是：今天编写了"+this.getTestCaseNum()+"个测试用例，发现了"+this.getBugNum()+"个bug。";
        return str;
    }


}
