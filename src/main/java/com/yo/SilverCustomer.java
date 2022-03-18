package com.yo;

public class SilverCustomer extends Customer{
    public SilverCustomer(String name,int consumption){
        super(name,consumption);
    }
    @Override
    public void print(){
        int discount=(consumption/1000)*100;
        System.out.println(name+"\t"+consumption+"\t"+discount+"("+backmoney()+")"+"\t"+ "Level"+"\t"+"**");
    }
}
