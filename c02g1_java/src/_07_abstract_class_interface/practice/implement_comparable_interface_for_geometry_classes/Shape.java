package _07_abstract_class_interface.practice.implement_comparable_interface_for_geometry_classes;

public class Shape {
    private String color = "green";
    private boolean filled = true;
    Shape(){
    }
    Shape(String color, boolean filled){
        this.color = color ;
        this.filled = filled ;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of " +
                getColor() + " and " +
                ( getFilled() ? "filled" : "not filled") ;
    }

}
