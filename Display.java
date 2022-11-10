package Cohesion;
class Name{
    String name;
    public String getName(String name){
        this.name =name;
        return name;

    }
}
class Age{
    int age;
    public int getAge(int age){
        this.age=age;
        return age;
    }
}



public class Display {
   public static void main(String[] args) {
        Name n =new Name();
        System.out.println(n.getName("Charmi"));
        Age a =new Age();
        System.out.println(a.getAge(10));

    }
}
