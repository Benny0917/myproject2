package com.two;

public class triangle {
    public  static void printStars(int space, int stars){
        String outStr = "";
        for (int i = 0; i < space; i++) {
            outStr+=" ";
        }

        for (int i = 0; i < stars; i++) {
            outStr+="*";
        }
        System.out.println(outStr);
    }
    public  static void reversePyramid(int n){
        int space = 0;
        int stars = 2*n - 1;
        for (int i = 0; i < n; i++) {
            printStars(space, stars);
            space++;
            stars-=2;
        }
    }

    public static void main(String[] args) {
        reversePyramid(2);
        System.out.println("==============");
        reversePyramid(3);
        System.out.println("==============");
        reversePyramid(4);
        System.out.println("==============");
    }
}
