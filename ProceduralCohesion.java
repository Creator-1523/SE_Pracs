package Cohesion;

public class ProceduralCohesion {
    int m1=24;
    int m2=25;
    int total =0;

    public int TotalNmubers(){
        total=m1+m2;
        return total;
    }
    public int average(){
        int TotalNmubers =TotalNmubers();
        return (TotalNmubers/25)*100;

    }
    public String Status(){
        String s=" ";
        if(average()>50){
            s="Pass";
            System.out.println(s);
        }
        return s;
    }
    
    public static void main(String[] args){
        ProceduralCohesion pc =new ProceduralCohesion();
        // pc.TotalNmubers();
        // pc.average();
        pc.Status();
    }

}
