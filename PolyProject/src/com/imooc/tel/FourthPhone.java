package com.imooc.tel;

public class FourthPhone extends ThirdPhone implements INet,IPhone{

    public void game(){
        System.out.println( "手机可以玩游戏" );
    }

    @Override
    public void netWork() {
        System.out.println( "手机可以上网" );
    }

    @Override
    public void photo() {
        System.out.println( "手机可以拍照" );

    }

    public void connect() {
        System.out.println( "FourthPhone中的connet" );

    }


}
