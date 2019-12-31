package datastructures.arrayList;

public class Student2 {


    private String id;
    private String first_Name;
    private String last_Name;
    private double goalSalary;

    public Student2(String id, String first_Name, String last_Name, double goalSalary) {
        this.id = id;
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.goalSalary = goalSalary;

    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirst_Name() {
        return first_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public double getGoalSalary() {
        return goalSalary;
    }

    public void setGoalSalary(double goalSalary) {
        this.goalSalary = goalSalary;
    }


}
