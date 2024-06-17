package Session8.BT2;

public class Point3D extends Point2D{
    private float z=0.0f;
    float[] XYZ=new float[3];
    public Point3D() {}
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z=z;
    }

    public float getZ() {return z;}
    public void setZ(float z) {this.z=z;}
    public float[] getXYZ() {return XYZ;}
    public void setXYZ(float[] XYZ) {

    }
}
