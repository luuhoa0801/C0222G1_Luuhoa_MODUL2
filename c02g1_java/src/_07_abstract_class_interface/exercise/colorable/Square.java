package _07_abstract_class_interface.exercise.colorable;

public class Square extends Shape implements Colorable {
    private double side;



    public Square(double side) {
        this.side = side;
    }
    public Square(){
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea(){
        return this.side * this.side;
    }

    @Override
    public String toString() {
        return "Square { " + super.toString() +
                " side=" + side +" "+ getArea()+" }";
    }
    @Override
    public void howToColor() {
        System.out.println(" Color all four sides..");
    }
}
