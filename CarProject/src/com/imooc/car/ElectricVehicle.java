package com.imooc.car;

public class ElectricVehicle extends NonMotor{

    private String electricBrand;
    public ElectricVehicle(String electricBrand){
        this.setElectricBrand(electricBrand);
    }

    public String getElectricBrand() {
        return electricBrand;
    }

    public void setElectricBrand(String electricBrand) {
        this.electricBrand = electricBrand;
    }

    public String run(){
        String str="这是一辆使用"+this.getElectricBrand()+"牌电池的电动车。";
        return str;
    }





}
