package _07_abstract_class_interface.exercise.resizeable;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
//        System.out.println(circle);
        Circle circle1 = new Circle("red",true,5);
        circle1.resizeable(5);
        System.out.println(circle1);

    }
}
