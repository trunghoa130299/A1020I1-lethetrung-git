package _06_ke_thua.bai_tap;

import java.util.Arrays;

public class Point3D  extends  Point2D{
    protected float z;
    public Point3D(){

    }
    public Point3D(float x, float y, float z){
        super(x,y);
        this.z=0.0f;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public float[] getXYZ(){
        return new float[]{this.x,this.y,this.z};
    }

    @Override
    public String toString() {
        return "(x,y,z)" + this.x +","+ y+","+ z+ Arrays.toString(getXYZ());
    }
}
