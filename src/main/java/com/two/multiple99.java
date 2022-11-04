package com.two;

public class multiple99 {
    public static void main(String[] args) {
        for (int i = 0; i <3; i++) {
            for (int j =1; j <=9; j++) {
                for (int k = 1; k <=3; k++) {
                    int f = k + i*3;
                    int r = f*j;
                    if (k == 1){
                        System.out.print(f +"*" + j +"=" + r +"\t");
                    }
                    else {
                        System.out.printf("|"+f +"*" + j +"=" + r +"\t");
                    }
                }
                System.out.println();
            }
                System.out.println("-----------------------");
        }
    }
}
