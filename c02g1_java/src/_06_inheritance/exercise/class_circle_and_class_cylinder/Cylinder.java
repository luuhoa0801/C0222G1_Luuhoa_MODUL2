package _06_inheritance.exercise.class_circle_and_class_cylinder;

public class Cylinder extends Circle {
    private double height ;
    public Cylinder(){
    }
    public Cylinder(double height,double radius, String color){
        super(radius,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return this.height * getArea() ;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + getHeight()+"\t" + super.toString()+
                '}';
    }
}
