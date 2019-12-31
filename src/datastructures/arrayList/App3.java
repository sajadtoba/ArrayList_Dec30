package datastructures.arrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        ArrayList<Student3> afsana = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of students to be enrolled:");
        int size = sc.nextInt();
        for(int i = 0; i < size; i++){
            System.out.println("Please enter the Student"+ i+ "id");
            String id = sc.next();

            System.out.println("Please enter the Student" + i +"firstname");
            String firstname = sc.next();

            System.out.println("Please enter the Student" + i+ "lastName");
            String lastname = sc.next();

            System.out.println("Please enter the Student"+i+ "desiredSalary");
            double goalSalary = sc.nextDouble();

            Student3 st = new Student3(id,firstname,lastname,goalSalary);
            afsana.add(st);
        }
        double average = findAverage(afsana);
        System.out.println("Average Goal Salary" +average);
        findStudentWithHighestSalary(afsana);

    }

    public static double findAverage (ArrayList<Student3>studentListMarjan) {
        int count = studentListMarjan.size();
        double total = 0;
        for(Student3 st: studentListMarjan) {
            total = total + st.getGoalSalry();
        }
        return  total/count;
    }

    public static void findStudentWithHighestSalary(ArrayList<Student3>studentListRobin){
        double highestSalary = studentListRobin.get(0).getGoalSalry();
        Student3 highestSalaryStudent = studentListRobin.get(0);
        for(int i = 1; i < studentListRobin.size(); i++){
            if (highestSalaryStudent.getGoalSalry() < studentListRobin.get(1).getGoalSalry()){
                highestSalaryStudent = studentListRobin.get(i);
            }
        }
        System.out.println( highestSalaryStudent.getId()+"_"+ highestSalaryStudent.getFirstName()+"_"+highestSalaryStudent.getLastName()+"_"+highestSalaryStudent.getGoalSalry());
    }









}
