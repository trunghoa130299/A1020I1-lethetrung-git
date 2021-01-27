package _06_ke_thua.bai_tap;

import java.util.Arrays;

public class MovablePoint extends LopPoint {
    protected float xSpeed;
    protected float ySpeed;

    public MovablePoint() {

    }

    public MovablePoint(float x,float y,float xSpeed, float ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
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
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float [] getSpeed(){
        return new float[]{this.xSpeed,this.ySpeed};
    }

    @Override
    public String toString() {
        return "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed + "," + this.getX()+ ","+ this.getY() + Arrays.toString(getSpeed()) + super.toString();
    }
    public MovablePoint move(){
        this.setX(this.getX() + xSpeed);
        this.setY(this.getX() + ySpeed);
        return this;
    }
}
