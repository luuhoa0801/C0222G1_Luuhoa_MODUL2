package _07_abstract_class_interface.exercise.resizeable;

public class Square  extends  Shape implements Resizeable{
    @Override
    public void resizeable(double percent) {
    this.side = this.side * percent / 100;
    }
    private double side ;
    public Square(String color, boolean filled) {
        super(color, filled);
    }

    public Square() {
    }
    public Square(String color, boolean filled,double side){
        super(color, filled);
        this.side = side ;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" + super.toString()+
                "side=" + side +
                '}';
    }
}
