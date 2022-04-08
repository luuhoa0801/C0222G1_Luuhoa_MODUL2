package _07_abstract_class_interface.exercise.resizeable;

public class Rectangle extends Shape implements Resizeable{
    @Override
    public void resizeable(double percent) {
        this.width = width * percent / 100;
        this.length = length * percent / 100;
    }

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    public Rectangle() {
    }
    private double width;
    private double length;
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(String color,boolean filled, double width,double length){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" + super.toString() +
                "weight=" + width +
                ", length=" + length +
                '}';
    }
}
