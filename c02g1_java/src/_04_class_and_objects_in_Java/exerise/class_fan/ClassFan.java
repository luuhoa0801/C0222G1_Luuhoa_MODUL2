package _04_class_and_objects_in_Java.exerise.class_fan;

public class ClassFan {
    private final int SLOW = 1 ;
    private final int MEDIUM = 2 ;
    private final int FAST = 3 ;
    private int speed ;
    private boolean on ;
    private double radius ;
    private String color ;

    public ClassFan(int speed, double radius, String color, boolean on){
        this.speed = speed ;
        this.radius = radius ;
        this.color = color ;
        this.on = on ;
    }
    public ClassFan(){
        this.speed = 1 ;
        this.radius = 5 ;
        this.color = "blue" ;
        this.on = false ;
    }
    public String toString(){
        if (this.on){
            return "fan is on" +"\t"+ this.speed + "\t" + this.color+ "\t"+this.radius;
        } else {
            return "fan is off"+"\t"+this.color+"\t"+this.radius ;
        }
    }

    public static void main(String[] args) {
        ClassFan classFan1 = new ClassFan(3,10,"yellow",true);
        ClassFan classFan2 = new ClassFan(2,5,"blue",false);
        System.out.println(classFan1.toString());
        System.out.println(classFan2.toString());
    }
}
