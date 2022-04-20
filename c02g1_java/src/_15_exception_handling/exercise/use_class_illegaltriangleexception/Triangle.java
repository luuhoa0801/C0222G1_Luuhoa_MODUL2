package _15_exception_handling.exercise.use_class_illegaltriangleexception;

public class Triangle extends Exception{
    public Triangle(String message) {
        super(message);
    }
}
