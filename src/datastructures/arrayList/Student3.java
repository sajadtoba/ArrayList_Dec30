package datastructures.arrayList;

public class Student3 {
    private String id;
    private String firstName;
    private String lastName;
    private double goalSalry;

    public Student3(String id, String firstName, String lastName, double goalSalry) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.goalSalry = goalSalry;
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

    public double getGoalSalry() {
        return goalSalry;
    }

    public void setGoalSalry(double goalSalry) {
        this.goalSalry = goalSalry;
    }
}
