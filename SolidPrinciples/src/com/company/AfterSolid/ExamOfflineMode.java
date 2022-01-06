package com.company.AfterSolid;

class ExamOfflineMode extends StudentExamDetails{
    public void getStudentOfflineExamLocation(){
        System.out.println("Offline Exam");
    }
}
class StudentOfflineExamDetails extends ExamOfflineMode
{
    @Override
    public void getStudentOfflineExamLocation() {
        super.getStudentOfflineExamLocation();
    }
}
