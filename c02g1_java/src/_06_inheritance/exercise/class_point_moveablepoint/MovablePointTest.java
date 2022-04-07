package _06_inheritance.exercise.class_point_moveablepoint;

public class MovablePointTest {
    public static void main(String[] args) {
//        MovablePoint movablePoint = new MovablePoint(1,2,3,4);
//        System.out.println(movablePoint.toString());

        MovablePoint movablePoint1 = new MovablePoint(3,4);

        System.out.println(movablePoint1);
        System.out.println(movablePoint1.move());
    }
}
