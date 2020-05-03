public class Rectangle extends Geometric {
    /* các trường dữ liệu */
    private double width;
    private double height;

    /* các khởi tạo tử */
    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, String filled, double width, double height) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    /* các thuộc tính phương thức */
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }
}
