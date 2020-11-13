package studentservice;

import model.Students;

import java.util.Scanner;

public class Studentservice {
    public Students create() {
        Scanner mms = new Scanner(System.in);
        System.out.println("Enter first name!");
        String firstName = mms.next();
        System.out.println("Enter last name!");
        String lastName = mms.next();
        System.out.println("Write your facultary.");
        String facultary = mms.next();
        System.out.println("Write your grade.");
        int grade = mms.nextInt();

        Students student = new Students(firstName, lastName, facultary, grade);
        return student;
    }

    public void cucakQA(Students[] students) {
        for (Students s : students) {
            if (s.getFacultary() == "QA") {
                System.out.println(s.getFirstName() + s.getLastName() + "-" + s.getGrade());
            }
        }
    }
}
