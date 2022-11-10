package Cohesion;

public class SequentialCohesion {
    public double ResultChecker(int obtainmarks , int Totalmarks)
    {
        double percentage= (obtainmarks/Totalmarks)*100;
        return percentage;
    }
    public String GardeDecider()
    {
        double percentage = ResultChecker(100, 100);
        String grade= "";
        if(percentage>80){
            grade="A";
        }
        return grade;
    }
    public void Remarks(){
        String grade =GardeDecider();
        String Remarks;
        if(grade=="A"){
            Remarks ="Excellent Work";
            System.out.println(Remarks);
        }

    }
    public static void main(String[] args){
         SequentialCohesion sc =new SequentialCohesion();
         sc.GardeDecider();
         sc.Remarks();
    }
}
