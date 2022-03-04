package com.yo;

public class ScoringNG {
    public static void main(String[] args) {
        String[] names={"Berry","Kenter","Elva","Bronny"};
        int[] maths={86,98,56,32};
        int[] englishs={55,67,87,66};
        for (int i = 0; i <4; i++) {
            if (i !=3) {
                System.out.println(names[i] + "\t" + maths[i] + "\t"+englishs[i] + "\t" + (maths[i] + englishs[i]) / 2);
            }
        }

    }
}
