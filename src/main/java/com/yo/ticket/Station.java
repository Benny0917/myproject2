package com.yo.ticket;

public class Station {
    int id;
    String name;
    public Station(int id,String name){
        this.id=id;
        this.name=name;
    }
    public static final Station TAIPEI_STATION=new Station(100,"Taipei");
    public static final Station TAICHUNG_STATION=new Station(100,"Taichung");
    public static final Station Kaohsiung_STATION=new Station(100,"Kaohsiung");
}
