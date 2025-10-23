package Tata_Strive_HW;

public class Assi5 {
 /*   public static void main ( String[] args){

        // Oct 8 Task
        //Patient record
        String p_name = "Pratibha";
        char bill_status = 'Y';
        int age = 47;
        double bill = 23456.7899;
        byte days = 23;
        System.out.println("Patient name is " + p_name);
        System.out.println("Patient billstatus " + bill_status);
        System.out.println("Patient age is " + age);
        System.out.println("Patient total bill is " + bill);
        System.out.println("Patient stays  " + days + "day");
    }


  */


//
//
//    int number;
//    Assi5(){
//        number = 10;
//        System.out.println("default param " + number);
//    }
//
//    Assi5(int n){
//        number = n;
//        System.out.println("parameterized param num  " + number);
//    }
//
//    void display(){
//        System.out.println("use of break and continue");
//        for(int i = 1; i<number;i++){
//            if(i==3){
//
//                continue;
//            }
//            if(i==5){
//
//                break;
//
//            }
//            System.out.println("number" + i);
//
//        }
//    }
//    public static void main(String[] args) {
//        Assi5 num1 = new Assi5();
//        num1.display();
//
//        Assi5 num2 = new Assi5(7);
//        num2.display();
//
//    }
//
//

    public static void main(String[] args) {
        System.out.println("Attendance of all 18 learners ");


        for (int i = 1; i <18;i++){
            if(i==3){
                System.out.println("Skipping learner  " + i + "  by use of continue");
                continue;
            }
            if(i==5){
                System.out.println("Stop attendance at  " + i + "  by use of break");
                break;
            }
            System.out.println("attendance " + i);


        }
        System.out.println("Attendance is stopped!!  ");
    }


}
