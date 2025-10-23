package Tata_Strive;
//Static is a keyword
// static -- variable , method , class , block
// why --  for memory management--
// static member shared by all objects of the class
// when -- you want common property for all obj at that time
// static belongs to class not obj
// how to access -- since it is belongs to class  so ;
// ClassName.variablName;
//public class DayOct14 {
//    //static variable
//    static String institute = "Tata Strive";
//    // Instance varibable
//    String name;
//    int id;
//
//    //constructor
//
//    DayOct14(String n,int i ){
//        name = n;
//        id = i;
//    }
//    //static method
//    static void displayInstitute(){
//        System.out.println("Institute : " + institute);
//
//    }
//    //instance method
//    void displayDetails(){
//        System.out.println("learner name :" + name + "id " + id );
//    }
//
//
//
//    public static void main(String[] args) {
//        //Accesss static method directly
//        DayOct14.displayInstitute();
//        //create learners
//        DayOct14 s1 = new DayOct14("pooja",23);
//        DayOct14 s2 = new DayOct14("nilam",22);
//        //Access  instance methods
//        s1.displayDetails();
//        s2.displayDetails();
//        //Access static var using class
//        System.out.println("all learners belong to : " + institute);
//
//
//
//    }

//    static String company = "Infosys";
//    int employeesid ;
//    String employeeName ;
//
//    DayOct14(String e, int eno ){
//        employeeName = e;
//        employeesid = eno;
//
//    }
//
//    static  void displayCompany()
//    {
//        System.out.println("welcome to our Company  : " + company);
//    }
//    void display(){
//        System.out.println("employeeName  " + employeeName + "employeeid  " + employeesid);
//    }
//
//    public static void main(String[] args) {
//        DayOct14.displayCompany();
//        DayOct14 c1 = new DayOct14("Shreya  ",202);
//        DayOct14 c2 = new DayOct14("Sumit   " , 102);
//        c1.display();
//        c2.display();
//        System.out.println("All employees from " + company + "  " + "company !!!");
//    }


class product{

    // instance variable
    String name;
    double price;
    static String shopName = "Tata StriveShopping Mart";


    product(String n , double p){
        name = n;
        price = p;

    }

    void displaydetails(){

        System.out.println("Product " + name + "| price " + price);
    }


}
//noone extend final class
final class Bill{
    double totalAmount;
    void addToBill(product p){
        totalAmount = totalAmount + p.price;
        System.out.println(p.name + "added to bill ..");
    }
    void displayTotal(){
        System.out.println("Total Amount : " + totalAmount);
        System.out.println("Thank you for shopping with  " + product.shopName);

    }
}
public class DayOct14 {
    public static void main(String[] args) {
        System.out.println("welcome to " + product.shopName);
        System.out.println("--------------");
        product p11 = new product("Shoes",1500);
        product p12 = new product("Jeans",1600);
        product p13 = new product("Tops",1000);
        product p14 = new product("Shirts",500);
        product p15 = new product("Watch",3000);
        //Array of product
        product cart[]= {p11, p12,p13,p14,p15};
        System.out.println("All Products list : " );
        //foreach loop
        for(product p : cart){
            p.displaydetails();

        }
        System.out.println("---------------");
        Bill bill = new Bill();
        //Adding items to bill
        // foreach (data d : b)
        for(product p : cart){
            bill.addToBill(p);
        }
        //Display total
        bill.displayTotal();


    }


}


