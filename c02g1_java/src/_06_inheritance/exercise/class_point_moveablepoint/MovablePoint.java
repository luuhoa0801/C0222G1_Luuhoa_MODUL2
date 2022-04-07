package _06_inheritance.exercise.class_point_moveablepoint;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f ;
    private float ySpeed = 0.0f ;
    public MovablePoint(){
    }
    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed ;
        this.ySpeed = ySpeed ;
    }
    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed ;
        this.ySpeed = ySpeed ;
    }
    public float getXSpeed() {
        return xSpeed;
    }
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public float getYSpeed() {
        return ySpeed;
    }
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed ;
        this.ySpeed = ySpeed ;
    }
    public float[] getSpeed(){
        return new float[] { getXSpeed(),getYSpeed()};
    }

    @Override
    public String toString() {
        return "MovablePoint{ " + super.toString()+ "speed= "+
                "(" + xSpeed +","+ ySpeed + ")" +
                '}';
    }
    public MovablePoint move(){
//        float val = this.getX() + xSpeed;
//        this.setX(val);
        setX ( getX() + xSpeed );
        setY ( getY() + ySpeed );
         return this ;
    }


}
