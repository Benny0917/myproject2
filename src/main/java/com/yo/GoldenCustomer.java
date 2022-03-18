package com.yo;

public class GoldenCustomer extends Customer{
    public GoldenCustomer(String name,int consumption){
        super(name,consumption);
    }
    @Override
    public void print() {
        int discount = (consumption / 1000) * 800;
        System.out.println(name+"\t"+consumption+"\t"+discount+"\t"+ "Level"+"\t"+"***");
    }
}
