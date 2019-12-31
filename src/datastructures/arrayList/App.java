package datastructures.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // We create a Student Arraylist
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of students to be enrolled");
        //sc.nextInt(); // we can say with the size
        int size = sc.nextInt();
        // Ask number of users to enter in their information2
        for (int i = 0; i < size; i++) {
            System.out.println("Please enter student" + i + "'s id:");
            String id = sc.next();
            System.out.println("Please enter student" + i + "'s firstname");
            String firstName = sc.next();
            System.out.println("Please enter student" + i + "'s lastname");
            String lastName = sc.next();
            System.out.println("Please enter student" + i + "'s desired Salary");
            double goalSalary = sc.nextDouble();
            Student st = new Student(id, firstName, lastName, goalSalary);
            students.add(st);         // Until Now Runs good }

        }
        // inside the Main Method I need to create
        // Calculate the average goal salary for the student class
        //double average = findAverage(students);
        double average = findAverage(students);
        System.out.println("Average Goal Salary" + average);

        findStudentWithHighestSalary(students);
    }

    //public static double findAverage(ArrayList<Student> studentList) {
    public static double findAverage(ArrayList<Student>studentList) {
        // get the number of students
        int count = studentList.size();
        double total = 0;

        for (Student st : studentList) {
            // grab each student goal salary and then add it to the total
            //st.getGoalSalary(); // we need to add to total so for we can say
            total = total + st.getGoalSalary();
            // Now we need to divide total into count that will return the average

        }
        return total / count;
    }
    // This part has done successfully.

    // How to get the firstStudent along his highest salaray
    public static void findStudentWithHighestSalary(ArrayList<Student> studentList) {
        //double highestSalary = studentList.get(0).getGoalSalary();

        Student highestSalaryStudent = studentList.get(0);
        for (int i = 1; i < studentList.size(); i ++){

            if (highestSalaryStudent.getGoalSalary() < studentList.get(i).getGoalSalary()) {
                highestSalaryStudent = studentList.get(i); } }

        System.out.println(highestSalaryStudent.getId()+ "_"+highestSalaryStudent.getFirstName()+"_"
                +highestSalaryStudent.getLastName()+"_"+ "has the biggest goal salary of"
                + highestSalaryStudent.getGoalSalary());

    }
}





