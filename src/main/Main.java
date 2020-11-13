package main;
import model.Students;
import studentservice.Studentservice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Studentservice service = new Studentservice();
        Students s1 =service.create();
        Students s2 =service.create();
        Students s3 =service.create();
        Students s4 =service.create();
        Students s5 =service.create();
        Students s6 =service.create();
        Students s7 =service.create();
        Students s8 =service.create();
        Students s9 =service.create();
        Students s10 =service.create();
        Students[] students = (s1, s2, s3, s4, s5,s6, s7, s8, s9, s10);
        System.out.println("----------");
        System.out.println(service.cucakQA(students));

    }
}
