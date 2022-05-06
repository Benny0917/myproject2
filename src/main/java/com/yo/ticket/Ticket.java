package com.yo.ticket;

import java.lang.invoke.SwitchPoint;

public class Ticket {

    public static final int TAIPEI_STATION=100;
    public static final int TAICHUNG_STATION=100;
    public static final int KAOHSIUNG_STATION=100;

    Station start;
    Station destination;
    int amount;
    public Ticket(Station start,Station destination,int amount){
        this.start=start;
        this.destination=destination;
        this.amount=amount;
        int diff=Math.abs(start.id-destination.id);
        int price;
        System.out.printf("diff: "+diff);
        switch(diff){
            case 100:
                price = 500;
                break;
            case 200:
                price = 600;
                break;
            case  300:
                price = 1100;
                break;
        }
    }
    public float price(){
        int distance=destination.id-start.id;
        if (destination.id==200&&start.id==100||start.id==200&&destination.id==100){
            return 600;
        }else if (destination.id==300&&start.id==200||start.id==300&&destination.id==200){
            return 900;
        }else if (Math.abs(distance)==200){
            return 1500;
        }
        return 0;
    }
    public void print(){
        System.out.println("normal ticket"+"\t"+start.name+"to"+destination.name+"\t"+amount+"\t"+price()*amount);

    }
}
