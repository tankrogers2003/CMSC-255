/*
Thomas Rogers
Lab10, OOP
CMSC-255
 */

public class Fan {
    //create three constant integers denoting speeds
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    //create each private instance variable, with it's default value
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5.0;
    private String color = "blue";

    //parameterized constructor
    public Fan() {
        this(Fan.SLOW, false, 5.0, "blue");
    }
    //this method sets values of Fan()
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    //this method sets the speed of the fan
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    //this method gets the speed of the fan
    public int getSpeed () {
        return this.speed;
    }
    //this method set the power status of the fan
    public void setOn(boolean on) {
        this.on = on;
    }
    //this method returns the value of power status
    public boolean isOn() {
        return this.on;
    }
    //this method sets the radius of the fan
    public void setRadius(double radius) {
        this.radius = radius;
    }
    //this method returns the value of radius
    public double getRadius() {
        return this.radius;
    }
    //this method sets the color of the fan
    public void setColor(String color) {
        this.color = color;
    }
    //this method returns the value of color
    public String getColor() {
        return this.color;
    }
    //this method returns a string description of the fan when called
    public String toString() {
        if (on) {
            return "fan is " + speed + ", " + color + ", and size " + radius;
        } else {
            return "fan is off";
        }
    }
}
