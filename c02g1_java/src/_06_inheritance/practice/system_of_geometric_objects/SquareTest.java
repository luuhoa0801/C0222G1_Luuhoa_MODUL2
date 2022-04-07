package _06_inheritance.practice.system_of_geometric_objects;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        Square square1 = new Square();
        square1 = new Square(5,"red",true);
        System.out.println(square1);

    }
}
