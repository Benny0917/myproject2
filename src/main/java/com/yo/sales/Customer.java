package com.yo.sales;

public class Customer {
    String name;
    int consumption;
    public Customer(String name){this.name=name;}
    public Customer(String name,int consumption){
        this(name);
        this.consumption=consumption;
    }
    public Customer(){

    }
    public  float backmoney(){
        return(consumption/1000)*100;
    }
    public void print(){
        int discount=(consumption/1000)*100;
        System.out.println(name+"\t"+consumption+"\t"+discount+"\t"+ "Level"+"\t"+"*");
    }
}
