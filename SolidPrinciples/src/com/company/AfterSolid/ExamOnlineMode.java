package com.company.AfterSolid;

class ExamOnlineMode extends StudentExamDetails{
    public void studentExamOnlineDetails(){
        System.out.println("OnlineExam");
    }
}
class studentOnlineExamDetails extends ExamOnlineMode
{
    @Override
    public void studentExamOnlineDetails() {

        super.studentExamOnlineDetails();
    }
}
