package datastructures.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {

        ArrayList<Student2> shakiir = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of students to be enrolled:");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("please enter the name" + i + "id");
            String id = sc.next();
            System.out.println("Please enter the first_Name" + i + "id");
            String firstName = sc.next();
            System.out.println("Please enter the last_Name" + i + "last_Name");
            String lastName = sc.next();
            System.out.println("Please enter the desired salary" + i + "desired salaray");
            double goalSalary = sc.nextDouble();

            Student2 st = new Student2(id, firstName, lastName, goalSalary);
            shakiir.add(st);
            // To calculate the Average it must out side the Main Method
        }

        // inside the Maind Method

        double average = findAverage(shakiir);
        System.out.println("Average Goal Salar"+average);
        //findStudentWithHighestSalary(students);
        findStudentWithHighestSalary(shakiir);



    }

    public static double findAverage(ArrayList<Student2> studentListSamina){
        int count = studentListSamina.size();
        double total = 0;

        for(Student2 st : studentListSamina) {
            total = total + st.getGoalSalary();
        }
        return total /count;
        }
        // outside the Main Method
    //System.out.println(highestSalaryStudent.getId()+ "_"+highestSalaryStudent.getFirstName()+"_"
    //                +highestSalaryStudent.getLastName()+"_"+ "has the biggest goal salary of"
    //                + highestSalaryStudent.getGoalSalary());


    public static void findStudentWithHighestSalary(ArrayList<Student2>studentListAfsana){
        double highestSalary = studentListAfsana.get(0).getGoalSalary();
        Student2 highestSalaryStudent= studentListAfsana.get(0);
        for (int i = 1; i < studentListAfsana.size(); i++) {
            if(highestSalaryStudent.getGoalSalary() <studentListAfsana.get(i).getGoalSalary()) {
                highestSalaryStudent =studentListAfsana.get(i); }

            }
        // after the for loop
        System.out.println(highestSalaryStudent.getId() + "_"+ highestSalaryStudent.getFirst_Name()+"_"+highestSalaryStudent.getLast_Name()
                +"_"+ highestSalaryStudent.getGoalSalary());
        // Now we go the inside The Main Method Class to print out the information

        }

    }










