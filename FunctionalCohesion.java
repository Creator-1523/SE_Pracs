package Cohesion;

public class FunctionalCohesion {
    private String name;
    private int age;
    private String course;
    private String year;
    private String section;

    public FunctionalCohesion(String name, int age, String course, String year, String section) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.year = year;
        this.section = section;
    }

    public String getName() {
        return name;

    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public String getYear() {
        return year;
    }

    public String getSection() {
        return section;
    }

    public static void main(String[] args) {
        FunctionalCohesion s = new FunctionalCohesion("Charmi", 20, "computers", "2024", "A");

        System.out.println(s.getName() + s.getAge() + s.getCourse()
                + s.getYear() + s.getSection());

    }

}
