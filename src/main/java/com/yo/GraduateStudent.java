package com.yo;

public class GraduateStudent extends Student{
    int thesis;
    public GraduateStudent(String name,int english,int maths,int thesis){
        super(name, english, maths);
        this.thesis=thesis;
    }
    @Override
    public void print() {
        System.out.println(name+"\t"+english+"\t"+maths+"\t"+getAverage()+"\t"+thesis);
    }
}
