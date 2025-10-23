package Tata_Strive_HW;


//Multilevel Inheritances + constructor
// Organization Base class / Parent class

//base class
class College{
    String clgName;
    String location;
    public College(String n, String l){
        clgName = n;
        location =l;
        System.out.println("college Constructor called");
    }
    void showClgDetails(){
        System.out.println(" College name : " + clgName);
        System.out.println(" College location   : " + location);

    }

}
// first level of Child class
class Department extends College {
    String deptName;
    int deptNo;

    public Department(String c , String l,String d,int dn){
        super(c,l);
        deptName= d;
        deptNo = dn;
        System.out.println(" Department Constructor called");


    }
    void showDepartmentDetails(){
        System.out.println(" Department Name : " + deptName);
        System.out.println("  Department No. : " + deptNo);
        showClgDetails();

    }

}
// Second level Child class
class Hod extends Department {
    String hodName;


    public Hod(String c , String l,String d,int dn, String h){
        super(c,l,d,dn);
        hodName= h;
        System.out.println("Hod Constructor called");


    }
    void showHodDetails(){
        System.out.println(" Hod Name : " + hodName);
        showDepartmentDetails();

    }

}


//third
class StudentCr extends Hod {
    String className;
    String event;


    public StudentCr(String c , String l,String d,int dn, String h , String cn, String e)
    {
        super(c,l,d,dn,h);
        className= cn;
        event = e;
        System.out.println(" StudentCr Constructor called");


    }
    void showCrDetails(){
        System.out.println(" --------------Student CR details ----");
        System.out.println("Name of the class : " + className);
        System.out.println("  Event name : " + event);
        showHodDetails();

    }

}

public class Inheritance {
    public static void main(String[] args) {
        //obj of only last classs
         StudentCr cr = new StudentCr("DMCE " , "Navi-Mumbai " ,"Computer department",
            6,"Dr. Pandey ","Comp-A","Milestones" );
         cr.showCrDetails();



    }
}



