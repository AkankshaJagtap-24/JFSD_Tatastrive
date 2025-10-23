package Tata_Strive;

public class Basic2 {

    String name ; // instance variable
    int age; // instance variable
    double score;
    boolean isPlaced;
    static String institute = "TataStrive"; // static

    // constructor -- same name as class name (Special type of method used in java )
    // no return type
    // it calls automatically at the time of object creation
    //Two type of constructor
    //default, parameterized
    // why : to access the value

    //default
    Basic2(){
        String message = "default value of data member  !";
        System.out.println(message);
        System.out.println("learner name : " + name);
        System.out.println("learner age :  " + age);
        System.out.println("learner score :  " + score);
        System.out.println("learner is_placed :  " + isPlaced);
    }
    //parameterized constructor
    Basic2(String n , int ag){
        name = n;
        age = ag;

    }

    //method
    void display(){
        //local variable
        String message = "hello welcome to all !";
        System.out.println(message);
        System.out.println("learner name : " + name);
        System.out.println("learner age :  " + age);


    }


    public static void main(String args[])
    {
//        //object
//        Basic2 b = new Basic2();
//        Basic2 b1 = new Basic2("Akanksha", 22);
//        Basic2 b2 = new Basic2("Riya",23);
//        //display object
//        b1.display();
//        b2.display();
//        //accepting static variable without objects
//        System.out.println(Basic2.institute);
//




    }
}
