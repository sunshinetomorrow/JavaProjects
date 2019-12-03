package com.imooc.test;

import com.imooc.tel.FourthPhone;
import com.imooc.tel.INet;
import com.imooc.tel.IPhone;
import com.imooc.tel.SmartWatch;

import java.net.Inet4Address;

public class PhoneTest {
    public static void main(String[] args){
        System.out.println(INet.TEMP);

        INet net = new SmartWatch();
        net.connect();
        INet.stop();

        System.out.println("=====================");

        INet net2 = new SmartWatch();
        net2.connect();

        IPhone ip2 = new SmartWatch();
        ip2.connect();

        System.out.println("=====================");
        INet net3 = new FourthPhone();
        net3.connect();

        IPhone ip3 = new FourthPhone();
        ip3.connect();







    }
}
