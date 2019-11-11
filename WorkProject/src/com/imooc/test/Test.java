package com.imooc.test;

import com.imooc.work.DevelopmentWork;
import com.imooc.work.TestWork;
import com.imooc.work.Work;

public class Test {

    public static void main(String[] args){
        Work work = new Work();
        System.out.println("父类信息测试:"+work.workIntroduction());

        TestWork testWork = new TestWork("测试",10,5);
        System.out.println("测试工作类信息测试:"+testWork.workIntroduction());

        DevelopmentWork developmentWork = new DevelopmentWork("研发",1000,10);
        System.out.println("研发工作类信息测试:"+developmentWork.workIntroduction());
    }




}
