package com.company.AfterSolid;

public class AfterSolidMain {
    public static void main(String[] args)
    {
        //Single Responsibility Principle
        Student obj = new Student();
        obj.addStudent();

        //Open-Closed Principle
        CalculateStudentPercentage obj2 = new CalculateStudentPercentage();
        obj2.calculateStudentPercentage();
        obj2.addStudent();


        //Liskov Substitution Principle
        ExamOnlineMode obj5 = new studentOnlineExamDetails();
        obj5.studentExamOnlineDetails();

        //Interface Segregation Principle
        StudentAcademicPerformance obj3 = new StudentAcademicPerformance();
        obj3.studentSubjectsEnrolled();
        obj3.studentMarks();




        //Dependency Inversion Principle
        StudentProject projectObj = new StudentProject();
        projectObj.implement(new StudentWebDevelopmentProject());

    }
}
