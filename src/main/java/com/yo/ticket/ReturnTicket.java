package com.yo.ticket;

public class ReturnTicket extends StudentTicket{
    public ReturnTicket(Station start, Station destination, int amount){
        super(start, destination, amount);
        off=0.9f;
    }
    @Override
    public void print(){
        System.out.println("student ticket"+"\t"+start.name+"to"+destination.name+"\t"+amount+"\t"+price()*amount);
    }
}
