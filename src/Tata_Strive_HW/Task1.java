package Tata_Strive_HW;
// Task
//🧾 Tata STRIVE Java Case Study – 02
//🧠 Case Study Title:
//
//Student Result Management System
//
//🎯 Learning Objectives
//
//By the end of this activity, learners should be able to:
//
//Apply concepts of class and object
//
//Use constructors for initialization
//
//Work with static and final keywords
//
//Perform calculations using loops and arrays
//
//Display formatted output using methods
//
//🏫 Case Study Description
//
//Tata STRIVE wants to develop a simple Result Management System for their learners.
//The system should display each learner’s details and calculate their total marks, average, and grade.
//
//You are required to write a Java program to manage and display learner results.
//
//🧩 Functional Requirements
//
//Create a class named Learner with the following:
//
//Instance variables: id, name, marks1, marks2, marks3
//
//Static variable: institute = "Tata STRIVE"
//
//Constructor: To initialize all values
//
//Methods:
//
//void displayDetails() – to print learner details
//
//double calculateTotal() – returns total marks
//
//double calculateAverage() – returns average marks
//
//char calculateGrade() – returns grade based on average:
//
//90+ → A
//
//75–89 → B
//
//60–74 → C
//
//below 60 → D
//
//Create a final class ResultSystem:
//
//Has a method void displayResult(Learner l) that prints total, average, and grade.
//
//In the main class (ResultDemo):
//
//Create 3 learner objects.
//
//Store them in an array.
//
//Use a loop to display results for all learners.
//
//💻 Expected Output Format
//Welcome to Tata STRIVE Result Management System
//-----------------------------------------
//Learner ID: 101
//Name: Pooja
//Total Marks: 250.0
//Average: 83.33
//Grade: B
//-----------------------------------------
//Learner ID: 102
//Name: Rahul
//Total Marks: 280.0
//Average: 93.33
//Grade: A
//-----------------------------------------
//Learner ID: 103
//Name: Shweta
//Total Marks: 210.0
//Average: 70.00
//Grade: C
//-----------------------------------------
//Thank you for using Tata STRIVE Result Management System



class Learner {
    int id;
    String name;
    double marks1;
    double marks2;
    double marks3;
    static String institute = "TATA STRIVE ";

    Learner(int i, String n, double m1, double m2, double m3) {
        id = i;
        name = n;
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    void displayDetails() {
        System.out.println("Learner id : " + id
            + "\n"+"Learner name : " + name + "\n" + "Marks1 : " + marks1 + "\n" +"Marks2: " + marks2 + "\n" +  "Marks3 : " + marks3);

    }

    double calculateTotal() {
        return marks1 + marks2 + marks3;

    }

    double calculateAverage() {
        return calculateTotal() / 3;

    }

    char calculateGrade() {
        double avg = calculateAverage();
        if (avg >= 90) {
            return 'A';
        } else if (avg >= 75) {
            return 'B';
        } else if (avg >= 60) {
            return 'C';
        } else {
            return 'D';
        }


    }


}
final class ResultSystem {

        void displayResult(Learner l){

            l.displayDetails();
            System.out.println("Total marks  " +  l.calculateTotal()) ;
            System.out.println("total avg : " + l.calculateAverage());
            System.out.println("total grade : " + l.calculateGrade());

            System.out.println("--------------------------");

        }

    }




public class Task1 {

    public static void main(String[] args) {
        System.out.println("Welcome to Tata strive " + Learner.institute + "result System");
        System.out.println("-----------");

        Learner l1 = new Learner(101,"Sumit",23,78,90);
        Learner l2 = new Learner(102,"Sunil",56,78,98);
        Learner l3 = new Learner(103,"Aman",75,85,92);

        Learner learner [] ={ l1,l2,l3 };
        ResultSystem rs = new ResultSystem();

        for(Learner l : learner){

            rs.displayResult(l);
        }
        System.out.println("Thank you for using  " + Learner.institute + "Result management System !!!");



    }
}
