package com.yo.ticket;

import com.yo.score.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Ticket>list=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("Your start station?(1: Taipei, 2: Taichung, 3: Kaohsiung)");
            int choice=Integer.parseInt(scanner.next());
            if (choice==0){
               break;
            }
            Station begin=null;
            switch(choice){
                case 1:
                    begin=Station.TAIPEI_STATION;
                    break;
                case 2:
                    begin=Station.TAICHUNG_STATION;
                    break;
                case 3:
                    begin=Station.Kaohsiung_STATION;
                    break;
            }
            System.out.println("Your end station?(1: Taipei, 2: Taichung, 3: Kaohsiung)");
            int choice1=Integer.parseInt(scanner.next());
            if (choice1==0){
                break;
            }
            Station end=null;
            switch(choice){
                case 1:
                    end=Station.TAIPEI_STATION;
                    break;
                case 2:
                    end=Station.TAICHUNG_STATION;
                    break;
                case 3:
                    end=Station.Kaohsiung_STATION;
                    break;
            }
            System.out.println("choose type(1: normal, 2: student, 3: old, 4: return)");
            int type=Integer.parseInt(scanner.next());
            System.out.println("how many: ");
            int n=Integer.parseInt(scanner.next());
            switch (type){
                case 1:
                    Ticket ticket=new Ticket(begin, end, n);
                    list.add(ticket);
                    break;
                case 2:
                    StudentTicket studentTicket=new StudentTicket(begin, end, n);
                    list.add(studentTicket);
                    break;
                case 3:
                    ElderTicket ElderTicket=new ElderTicket(begin, end, n);
                    list.add(ElderTicket);
                    break;
                case 4:
                    ReturnTicket returnTicket=new ReturnTicket(begin, end, n);
                    list.add(returnTicket);
            }
        }
        for (Ticket t : list){
            t.print();
        }
    }

}
