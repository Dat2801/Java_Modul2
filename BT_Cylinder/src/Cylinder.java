public class Cylinder {
    private double radius = 1.0D;
    private double height = 1.0D;
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
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getVolume() {
        return this.radius * this.radius * 3.141592653589793D * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}
