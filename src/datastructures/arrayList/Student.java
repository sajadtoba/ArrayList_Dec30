package datastructures.arrayList;

public class Student {
    private String id;
    private String firstName;
    private String lastName;
    private double goalSalary;


    public Student(String id, String firstName, String lastName, double goalSalary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.goalSalary = goalSalary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGoalSalary() {
        return goalSalary;
    }

    public void setGoalSalary(double goalSalary) {
        this.goalSalary = goalSalary;
    }
}
