package com.yo;

public class Student {
    String name;
    int english;
    int maths;
    public Student(String name){
        this.name=name;
    }
    public Student(String name,int english,int maths){
        this(name);
        // this.name=name;
        this.english=english;
        this.maths=maths;
    }
    public Student(){
        this("John Doe",45,61);
        /*name="John Doe";
         english=45;
         maths=61;*/
    }
    public void print(){
        int average=(english+maths)/2;
        System.out.print(name+"\t"+english+"\t"+maths+"\t"+getAverage());
        if (getAverage()<60){
            System.out.print("*");
        }
        System.out.println();
    }
    public int getAverage(){
        return(english+maths)/2;
    }
}
