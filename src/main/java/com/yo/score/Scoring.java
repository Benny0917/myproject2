package com.yo.score;

public class Scoring {
    public static void main(String[] args) {
        Student jack=new Student("jack",70,88);
        Student bronny=new Student("bronny",43,69);
        GraduateStudent jane=new GraduateStudent("jane",67,82,75);
        jane.name="jane";

            jack.print();
            bronny.print();
            jane.print();
    }
}