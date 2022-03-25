package com.yo.ticket;

public class Ticket {
    public static final int TAIPEI_STATION=100;
    public static final int TAICHUNG_STATION=100;
    public static final int KAOHSIUNG_STATION=100;

    Station start;
    Station destination;
    int price;
    public Ticket(Station start,Station destination){
        this.start=start;
        this.destination=destination;
    }
    public void print(){

    }
}
