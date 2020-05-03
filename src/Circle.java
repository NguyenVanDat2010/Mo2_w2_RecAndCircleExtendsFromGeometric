public class Circle extends Geometric {
    /* các trường dữ liệu */
    private double radius;

    /* các khởi tạo tử */
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, String filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    /* các thuộc tính phương thức */
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return this.radius * 2 * Math.PI;
    }

    public double getDiameter() {
        return this.radius * 2;
    }

    public void printCircle() {
        System.out.println("The " + getColor() + " is created with radius " + radius);
    }
}
