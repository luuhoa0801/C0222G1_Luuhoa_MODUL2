package _07_abstract_class_interface.exercise.resizeable;

public class Circle extends  Shape implements Resizeable{
    @Override
    public void resizeable(double percent) {
        this.radius = this.radius * percent / 100 ;
    }

    public Circle(String color, boolean filled) {
        super(color, filled);
    }
    private double radius ;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Circle(){
    }
    public Circle(double radius){
        this.radius = radius ;
    }
    public Circle(String color, boolean filled, double radius){
        super(color, filled);
        this.radius = radius ;
    }

    @Override
    public String toString() {
        return "Circle{" + super.toString()+
                "radius=" + radius +
                '}';
    }

}
