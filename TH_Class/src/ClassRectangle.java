import java.awt.*;

public class ClassRectangle {
        double width, height;
    public ClassRectangle (double weight, double height) {
        this.width = width;
        this.height = height;

    }
    public double getArea() {
        return this.width * this.height;
    }
    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }
    public String display() {
        return "Rectangle {" + "width = " + width + ", height = " + height + "}";
    }

}
