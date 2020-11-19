package main;

import Bubble_Sort.Bubble_Sort;
import model.Students;
import studentservice.Studentservice;


public class Main {
    public static void main(String[] args) {
        Studentservice service = new Studentservice();
        Students s1 = service.create();
        Students s2 = service.create();
        Students s3 = service.create();
        Students s4 = service.create();
        Students s5 = service.create();
        Students[] students = {s1, s2, s3, s4, s5};

        System.out.println("----------");
        service.cucakQA(students);
        System.out.println();
        Bubble_Sort sort = new Bubble_Sort();

        sort.create();



    }
}
