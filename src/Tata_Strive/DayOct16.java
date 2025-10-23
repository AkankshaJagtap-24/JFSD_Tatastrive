package Tata_Strive;
//Inheritance --
/*
class Parent{

 }
 class Child extends Parent{

 }
 // single level inheritance
 A
 |
 |
 B
// Multilevel Inheritance
 A
 |
 |
 B
 |
 |
 C
 //tree/hierarchial inheritance
     A
    |   |
    B   C
 // Multiple inheritance
 A     B
 |      |
    C
   // Hybrid inheritance ( diamonds problem )- combination of two or more inheritance
        A
     B     C
        D

 */


//keyword used: extends
//Parent class ( Super class or Base class)
//Child class ( Sub class or deriver class)
// helps in code reusability
// Private member -- they are no inherited
//Constructor are not inherited but can be called using super( ) keyword .
//
//class Product{
//    String brand = "Tata Strive Mart ";
//    double price;
//    void displayProduct(){
//        System.out.println("Brand : "+ brand);
//        System.out.println("Price : " + price);
//    }
//
//}
//class ElectronicProduct extends Product{
//    String model;
//    void showDetails(){
//        System.out.println(" Electronic Product : ");
//        System.out.println("model : " + model);
//        // accessing parent method
//        displayProduct();
//    }
//
//}
//class ClothingProduct extends Product{
//    String size;
//    void showDetails(){
//        System.out.println("Clothing Product : ");
//        System.out.println("size : " + size);
//        displayProduct();
//    }
//
//}
//public class DayOct16 {
//    public static void main(String[] args) {
//        ElectronicProduct laptop = new ElectronicProduct();
//        laptop.model = "dell";
//        laptop.price =60000;
//        laptop.showDetails();
//        System.out.println("---------------------");
//        ClothingProduct tshirt = new ClothingProduct();
//        tshirt.size = "Large";
//        tshirt.price = 800;
//        tshirt.showDetails();
//    }
//
//}


/// /******** Task - 1 ************//

// single level inheritance
//class Animal{
//    int leg = 4 ;
//    void bark(){
//        System.out.println("The animal has " + leg + " leg");
//    }
//}
//class Dog extends Animal{
//    String name = "Dog";
//    void showDetails(){
//        System.out.println(" the animal name is " + name);
//        System.out.println("Dog has "+ leg + " legs");
//        bark();
//
//    }
//}
//class DayOct16{
//    public static void main(String[] args) {
//        Dog myDog = new Dog();
//        myDog.bark();
//        myDog.showDetails();
//    }
//}

//
////************ Task 2 **************//
//// Multilevel inheritance
//class GrandFather{
//    String surname = "Jagtap";
//    void showDetails(){
//        System.out.println("My surname is " + surname);
//    }
//
//}
//class Father extends GrandFather{
//    String name = "Rajendra";
//    void showInfo(){
//        System.out.println("My name is " + name + " " + surname);
//        showDetails();
//    }
//
//}
//class Son extends Father{
//    String sonName = "Ravi";
//    void showSon(){
//        System.out.println(" I am the son of " + name + " My name is " + sonName + " " + surname );
//
//    }
//}
//
//public  class DayOct16{
//    public static void main(String[] args) {
//        Son s = new Son();
//        s.showDetails();
//        System.out.println("--------");
//        s.showInfo();
//        System.out.println("-----------");
//        s.showSon();
//
//    }
//}


//Multilevel Inheritances + constructor
// Organization Base class / Parent class

//base class
class Organization{
    String orgName;
    String location;
    public Organization(String o, String l){
        orgName = o;
        location =l;
        System.out.println("Organization Constructor called");
    }
    void showOrgDetails(){
        System.out.println(" Organization name : " + orgName);
        System.out.println(" Organization location   : " + location);

    }

}
// first level of Child class
class Department extends Organization{
    String deptName;
    String deptHead;

    public Department(String o , String l,String d,String h){
        super(o,l);
        deptName= d;
        deptHead = h;
        System.out.println(" Department Constructor called");


    }
    void showDepartmentDetails(){
        System.out.println(" Department Name : " + deptName);
        System.out.println("  Department Head : " + deptHead);
        showOrgDetails();

    }

}
// Second level Child class
class Team extends Department{
    String teamName;
    int members;

    public Team(String o , String l,String d,String h, String t , int m){
        super(o,l,d,h);
        teamName= t;
        members = m;
        System.out.println(" Team Constructor called");


    }
    void showTeamDetails(){
        System.out.println(" Team Name : " + teamName);
        System.out.println("  Team members : " + members);
        showDepartmentDetails();

    }

}


//third
class OutdoorTrip extends Team{
    String destination;
    String activity;
    double bugdet;

    public OutdoorTrip(String o , String l,String d,String h, String t , int m, String des, String act, double bug)
    {
        super(o,l,d,h,t,m);
        destination= des;
        activity = act;
        bugdet = bug;
        System.out.println(" OutdoorTrip Constructor called");


    }
    void showTripDetails(){
        System.out.println(" Outdoor Trip details ----");
        System.out.println("Destination : " + destination);
        System.out.println("  Activity : " + activity);
        System.out.println("Budget : " + bugdet );
        showTeamDetails();

    }

}

public class DayOct16 {
    public static void main(String[] args) {
        //obj of only last classs
        OutdoorTrip   trip = new OutdoorTrip("Tata Strive " , "Mumbai " ,"Operational department",
            "Ram Sir","TSSDC",45,"Lonavla","Team Building games", 300000 );
        trip.showTripDetails();



    }
}
/*
Static inner class

class AA{
class AA2{
static c

 */
