package _04_class_and_objects_in_Java.exerise.class_fan;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private boolean on ;
    private double radius ;
    private int speed ;
    private String color ;

    public boolean isOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public Fan(){
        this.speed = SLOW ;
        this.on = false ;
        this.radius = 5 ;
        this.color = "blue";
    }
    public Fan(int speed,double radius,String color,boolean on){
        this.speed = speed ;
        this.radius = radius ;
        this.color = color ;
        this.on = on ;

    }
    public String toString(){
     if ( isOn()){
        return  "Fan is on" +"\t" + getSpeed() +"\t" +getColor() +"\t" + getRadius() ;
     } else {
         return "Fan is off" +"\t" + getColor() +"\t" + getRadius() ;
     }
    }

}
