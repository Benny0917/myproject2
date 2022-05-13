package com.yo.parking;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.DoubleStream;

public class Runner {
    public static void main(String[] args) {
        String id="ABC-1234";
        String enterTime ="08:00";
        String exitTime ="11:00";
        SimpleDateFormat sdf=new SimpleDateFormat("HH:mm");
        //Exception例外 vs Error錯誤
        Date d = null;
        try{
            d = sdf.parse(enterTime);
        }catch (Exception e){
            System.out.println("wrong Format");
        }
        System.out.println(d);
        System.out.println(d.getTime());
        long ms = 3*60*60*1000;
        try{
        Date d2 = sdf.parse(exitTime);
        System.out.println(d2);
        System.out.println(d2.getTime());
        int mins = (int)((d2.getTime()-d.getTime())/100/60);
            System.out.println(mins);
            int fee = 30*(mins/60);
            System.out.println("Fee:"+fee);
            //Homework  3:14 => NTD$90 , 3:15 => NTD$120
            //3:15-3:30 => NTD$105
        }catch(Exception e){
            System.out.println("wrong Format");
        }
    }
}
