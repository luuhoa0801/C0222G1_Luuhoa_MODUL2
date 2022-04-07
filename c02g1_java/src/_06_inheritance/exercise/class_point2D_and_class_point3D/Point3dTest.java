package _06_inheritance.exercise.class_point2D_and_class_point3D;

import java.util.Arrays;

public class Point3dTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        point3D = new Point3D(1,2,3);
        point3D = new Point3D(4) ;
        System.out.println(point3D);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
