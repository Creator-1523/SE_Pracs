package Cohesion;

public class LogicalCohesion {

    public void PrintStudentDetails(){
System.out.println("charmi");
    }
    public void PrintTeacherDetails(){
        System.out.println("charmi");
    }
    public void PrintAdministratorDetails(){
        System.out.println("charmi");
    }
    public static void main(String[] args){
        LogicalCohesion lc = new LogicalCohesion();
        lc.PrintAdministratorDetails();
        lc.PrintTeacherDetails();
        lc.PrintStudentDetails();
    }
}
