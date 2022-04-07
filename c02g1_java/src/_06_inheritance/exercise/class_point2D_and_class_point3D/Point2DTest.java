package _06_inheritance.exercise.class_point2D_and_class_point3D;

import java.util.Arrays;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D = new Point2D(1,1);
        System.out.println(point2D);
        System.out.println(Arrays.toString(point2D.getXY()));
    }
}
