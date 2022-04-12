package _07_abstract_class_interface.exercise.colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle("red",true,4,5);
        shapes[1] = new Square("blue",false,6);
        shapes[2] = new Circle("green",true,3);
        for (Shape item:shapes) {
//            System.out.println(item);
            if ( item instanceof Colorable){
                Square square = (Square) item;
                System.out.println(item);
                square.howToColor();
            }
        }
    }
}
