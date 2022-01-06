package com.company.BeforeSolid;

public class Student {
    public void addStudent()
    {
        System.out.println("adds Student Details");
    }

    public void printStudentDetails()
    {
        System.out.println("print student details");
    }
    /*
        adding new functionality to the existing class i.e calculatingStudentPercentage
        which is against open closed principle
     */
    public void calculateStudentPercentage()
    {
        System.out.println("calculates Student percentage");
    }
}
