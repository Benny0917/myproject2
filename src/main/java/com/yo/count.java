package com.yo;

import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input year: ");
        int year = scanner.nextInt();
        System.out.println("Input month: ");
        int month = scanner.nextInt();
        System.out.println("Input day: ");
        int day = scanner.nextInt();
        boolean isRen;
        if((year % 4 == 0 && year % 100 != 0)||(year % 400 == 0)){
            isRen = true;
        }else {
            isRen = false;
        }

        int total = 0;
        for (int i = 1; i <= month-1; i++) {
            total+=countDay(year,i);
        }
        total += day;
        System.out.println("total "+total);
        System.out.println(isRen);

    }

    public static int countDay(int year, int x){
        int result = 0;
        boolean isRen;
        if((year % 4 == 0 && year % 100 != 0)||(year % 400 == 0)){
            isRen = true;
        }else {
            isRen = false;
        }
        switch(x) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                result=30;
                break;
            default:
                if(isRen) {
                    result=29;
                } else {
                    result=28;
                }
                break;

        }
        return result;
    }
}
