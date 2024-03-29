package _07_abstract_class_interface.exercise.colorable;

public class Circle extends Shape {
    private double radius;
    public Circle(){
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return " Circle{ " + super.toString() +
                "radius=" + radius +" "+ getArea() +" }";
    }
}
