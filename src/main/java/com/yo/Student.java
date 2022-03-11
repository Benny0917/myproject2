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

    }
    public void print(){
        System.out.println(name+"\t"+english+"\t"+maths+"\t");
    }
}
