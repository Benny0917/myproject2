package com.two;

public class cat {
    public static void main(String[] args) {
        String inputStr = "was it a cat I saw";
        String newStr = inputStr;
        boolean plaindrome = true;
        inputStr = inputStr.toLowerCase();
        String newStr1 = inputStr.replaceAll("\\s+", "");

        int i = 0;
        int j = newStr1.length()-1;
        while (i <= j){
            if(newStr1.charAt(i) == newStr1.charAt(j)){
                i++;
                j--;
            }else{
                plaindrome = false;
            }
        }





        if (plaindrome){
            System.out.println(newStr + " is plaindrome");
        }else {
            System.out.println(newStr + "is not plaindrome");
        }
    }
}