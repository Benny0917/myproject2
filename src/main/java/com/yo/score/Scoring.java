package com.yo.score;

import java.util.ArrayList;
import java.util.List;

public class Scoring {
    public static void main(String[] args) {
        Student jack=new Student("jack",70,88);
        Student bronny=new Student("bronny",43,69);
        GraduateStudent jane=new GraduateStudent("jane",67,82,75);
        List<Student>students=new ArrayList<>();
        jane.name="jane";

            jack.print();
            bronny.print();
            jane.print();
    }
}
