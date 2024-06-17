package Session8.BT2;

public class Point2D {
    private float x=0.0f;
    private float y=0.0f;
    float [] XY= new float[2];
    public Point2D() {}
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float getX() {return x;}
    public float getY() {return y;}
    public float getXY(){
        return XY[0];
    }

    public void setX(float x) {this.x = x;}
    public void setY(float y) {this.y = y;}
    public void setXY(float x, float y) {
        this.XY[0] = x;
        this.XY[1] = y;
    }

    @Override
    public String toString() {
        return "Point2D [x=" + x + ", y=" + y + "]";
    }
}
