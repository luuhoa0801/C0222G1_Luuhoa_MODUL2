package _05_accessmodifier_staticmethod_staticproperty.practice.static_method;

public class Student {
    private int rollno ;
    private String name ;
    private  static String college = "BBDIT";
    Student(int r,String n){
        rollno = r;
        name = n ;
    }
    static void  change(){
        college = "CODEGYM";
    }
    void display(){
        System.out.println(rollno + " "+ name + " "+ college);
    }

}

