package _05_accessmodifier_staticmethod_staticproperty.exerise.access_modifier;

public class Circle {
    private double radius = 1.0 ;
    private String color = "red";
    Circle(){
    }
    Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius ;
    }
    public double getArea(){
        return this.radius * this.radius * Math.PI ;
    }

}
