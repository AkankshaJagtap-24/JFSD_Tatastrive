package Tata_Strive;

import java.util.Scanner;

//class Attendance{
//    void SupportMenu(){
//        Scanner Sc = new Scanner(System.in);
//        int choice ;
//        do{
//            System.out.println("\n TATA STRIVE learner support----");
//            System.out.println("1.Attendance issue");
//            System.out.println("2.Assignment Submission");
//            System.out.println("3.Placement Query");
//            System.out.println("4.Certification Status");
//            System.out.println("5.Exit");
//            System.out.println("Enter your choice");
//            choice = Sc.nextInt();
//            switch(choice){
//                case 1:
//                    System.out.println("your attendance issue has been recorded");
//                    break;
//                case 2:
//                    System.out.println("Your Assignment is submitted");
//                    break;
//                case 3:
//                    System.out.println("Your palcement query has been recorded");
//                    break;
//                case 4:
//                    System.out.println("your certification status has been recorded");
//                    break;
//                case 5 :
//                    System.out.println("Exit");
//                    break;
//                default:
//                    System.out.println("Invalid choice");
//            }
//
//        }while(choice != 5);
//
//    Sc.close();
//
//
//    }
//}
//public class Object2 {
//    public static void main(String[] args) {
//        Attendance a = new Attendance();
//        a.SupportMenu();
//    }
//}


class LearnerSystem{
    int learnerID;
    int marks;
    String result;
    String remarks;
    void details(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your learner id: ");
        learnerID = sc.nextInt();

        switch (learnerID) {
            case 101:
                marks = 85;
                result = "Pass";
                remarks = "Very good";
                break;
            case 102:
                marks = 67;
                result = "Pass";
                remarks = "Good job!";
                break;
            case 103:
                marks = 45;
                result = "Pass";
                remarks = "Needs a more focus.";
                break;
            case 104:
                marks = 30;
                result = "Fail";
                remarks = "Please work hard.";
                break;
            default:
                System.out.println("Invalid Learner ID!");

        }
    }
    void resultmenu() {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n Learner's performance ");
            System.out.println("1. View Marks");
            System.out.println("2. View Result");
            System.out.println("3. View Remarks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("Your Marks: " + marks);
                    break;

                case 2:
                    System.out.println("Your Result: " + result);
                    break;

                case 3:
                    System.out.println("Your Remarks: " + remarks);
                    break;

                case 4:
                    System.out.println("Exiting the system");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

    }
}
public class Object2 {
    public static void main(String[] args) {
        LearnerSystem learner = new LearnerSystem();
        learner.details();
        learner.resultmenu();
    }
}


