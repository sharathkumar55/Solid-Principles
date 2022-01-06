package com.company.BeforeSolid;

class ExamDetails
{
    public void getExamDetails()
    {

        System.out.println("gets exam details");
    }
    public void getExamLocation()
    {

        System.out.println("This method gets student exam location");
    }
}
class StudentExam extends ExamDetails
{
    public void getExamDetails()
    {

        System.out.println("gets exam details");
    }
    public void getExamLocation()
    {

        System.out.println("This method gets student exam location");
    }
    public void studentExamOnlineDetails()
    {
        System.out.println("you cannot write Exam Online and behaviour is not same with parent");
    }

}
