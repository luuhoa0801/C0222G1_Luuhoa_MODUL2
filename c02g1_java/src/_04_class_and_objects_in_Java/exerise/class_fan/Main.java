package _04_class_and_objects_in_Java.exerise.class_fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan( 3,10,"yellow",true);
        Fan fan2 = new Fan(2,5,"blue",false);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
