package Tata_Strive;
import java.util.Scanner;

class Attendance {
        boolean isPresent; // to store attendance status
        int presentCount = 0;
        int absentCount = 0;

        void startSystem() {
            Scanner sc = new Scanner(System.in);
            int choice;
            int learnerId;

            System.out.print("Enter Learner ID: ");
            learnerId = sc.nextInt();

            do {
                System.out.println("\n--- TATA STRIVE ATTENDANCE SYSTEM ----");
                System.out.println("1. Mark Attendance");
                System.out.println("2. View Present Learners");
                System.out.println("3. View Absent Learners");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Mark attendance for Learner ID " + learnerId + " (P/A): ");
                        char status = sc.next().toUpperCase().charAt(0);
                        if (status == 'P') {
                            isPresent = true;
                            presentCount++;
                            System.out.println("Attendance marked as Present ");
                        } else if (status == 'A') {
                            isPresent = false;
                            absentCount++;
                            System.out.println("Attendance marked as Absent ");
                        } else {
                            System.out.println("Invalid input! Use P or A only.");
                        }
                        break;

                    case 2:
                        System.out.println("Total Present Learners: " + presentCount);
                        break;

                    case 3:
                        System.out.println("Total Absent Learners: " + absentCount);
                        break;

                    case 4:
                        System.out.println("Exiting system... Thank you!");
                        break;

                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            } while (choice != 4);

            sc.close();
        }
    }

    public class Object3 {
        public static void main(String[] args) {
            Attendance att = new Attendance();
            att.startSystem();
        }
    }





