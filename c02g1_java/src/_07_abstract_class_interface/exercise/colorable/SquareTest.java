package _07_abstract_class_interface.exercise.colorable;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        Square square1 = new Square("bue",true,5);
        square1.howToColor();
        System.out.println(square1);
    }

}
