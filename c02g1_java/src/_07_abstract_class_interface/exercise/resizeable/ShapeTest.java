package _07_abstract_class_interface.exercise.resizeable;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0]= new Circle("red",true,5);
        shapes[1]=new Rectangle("blue",false,2,3);
        shapes[2]=new Square("green",true,5);

        for (Shape item:shapes) {
            item.resizeable(10);
            System.out.println(item);
        }

    }
}
