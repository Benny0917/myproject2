package com.yo.sales;

public class Shopping {
    public static void main(String[] args) {
        Customer james=new Customer("james",5000);
        SilverCustomer jenny=new SilverCustomer("jenny",4000);
        GoldenCustomer curry=new GoldenCustomer("curry",6000);

        james.print();
        jenny.print();
        curry.print();
    }
}
