package _04_class_and_objects_in_Java.exerise.class_quadraticequation;

public class QuadraticEquation {
   private  double a;
   private double b;
   private double c;
    public QuadraticEquation(){
    }
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c ;
    }
    public double getDiscriminant(){
        return  (this.b * this.b) - (4 * this.a * this.c) ;
    }
    public double getRoot1 (){
        return (-this.b + Math.sqrt( Math.pow(this.b,2)- 4 * this.a * this.c ) ) / (2 * this.a) ;
    }
    public double getRoot2 (){
        return (-this.b - Math.sqrt( Math.pow(this.b,2)- 4 * this.a * this.c ) ) / (2 * this.a) ;
    }
    public double getRoot3(){
        return - this.b / (2 * this.a) ;
    }
    public double getRoot4(){
        return -this.c / this.b ;
    }


}
