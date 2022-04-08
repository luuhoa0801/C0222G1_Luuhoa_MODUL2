package _07_abstract_class_interface.exercise.resizeable;

public class SquareTest {
    public static void main(String[] args) {

        Square square = new Square();
        System.out.println(square);

        Square square1 = new Square("blue",true,5);
        square1.resizeable(10);
        System.out.println(square1);
    }
}
