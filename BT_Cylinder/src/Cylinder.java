public class Cylinder {
    private double radius = 1.0;
    private double height = 1.0;
    private String color = "red";

    public Cylinder() {
    }

    public Cylinder(double radius) {
        this.radius = radius;
    }

    public Cylinder(double radius, String color, double height) {
        this.radius = radius;
        this.color = color;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getVolume() {
        return radius * radius * Math.PI * height;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}


