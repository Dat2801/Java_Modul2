import sun.java2d.loops.ScaledBlit;

import java.util.Scanner;

public class Circle {
    Scanner scanner = new Scanner(System.in);
    private double radius = 1.0;
    private String color = "red";
public Circle() {
}
    public static String nameOfCircle;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
 public double getRadius(){
        return radius;
}
public double getArea(){
        return radius * radius * Math.PI;

 }
}
