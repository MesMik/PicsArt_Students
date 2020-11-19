package model;

public class Students {
    private String firstName;
    private String lastName;
    private String facultary;
    private int grade;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFacultary() {
        return facultary;
    }

    public void setFacultary(String facultary) {
        this.facultary = facultary;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


    public Students() {

    }

    public Students(String firstName, String lastName, String facultary, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.facultary = facultary;
        this.grade = grade;
    }

    public void printInfo() {
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Grade is - " + grade);
    }
}
