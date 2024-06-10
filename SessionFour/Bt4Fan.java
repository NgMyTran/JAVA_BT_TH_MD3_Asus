package SessionFour;

public class Bt4Fan {
    
  
    int SLOW = 1;
     int MEDIUM = 2;
    int FAST = 3;

  //Thuộc tính
    private int speed;
    private boolean on;
    private double radius;
    private String color;


    public Bt4Fan(int speed,boolean on,double radius,String color) {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    // getter và setter
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //toString
    @Override
    public String toString() {
        if (on) {
            return "Fan speed: " + speed + ", color: " + color + ", radius: " + radius + " (fan is on)";
        } else {
            return "Fan color: " + color + ", radius: " + radius + " (fan is off)";
        }
    }}