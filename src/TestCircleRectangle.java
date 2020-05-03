public class TestCircleRectangle {
    public static void main(String[] args) {
        Circle circle=new Circle(3);
        circle.setColor("Black");
        System.out.println("A circle "+circle.toString());
        System.out.println("The radius is "+circle.getRadius());
        System.out.println("The diameter is "+circle.getDiameter());
        System.out.println("The area is "+circle.getArea());
        System.out.println("The perimeter is "+circle.getPerimeter());

        Circle circle1=new Circle(5,"Red","Green");
        System.out.println("\nA circle "+circle1.toString());
        circle1.printCircle();

        Rectangle rectangle=new Rectangle(5,6);
        System.out.println("\nA rectangle "+rectangle.toString());
        System.out.println("The width: "+rectangle.getWidth()+", The height: "+rectangle.getHeight());
        System.out.println("The area is "+rectangle.getArea());
        System.out.println("The perimeter is "+rectangle.getPerimeter());

        Rectangle rectangle1=new Rectangle("Blue","Brown",20,10);
        System.out.println("\nA rectangle "+rectangle1.toString());
    }
}
