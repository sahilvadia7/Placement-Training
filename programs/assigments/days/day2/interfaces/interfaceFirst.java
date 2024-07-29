package programs.assigments.days.day2.interfaces;

interface Shape{
    Number getArea();
}

class Circle implements Shape{

    private static float PI = 3.14f;
    private double radius = 10;

    @Override
    public Double getArea(){
        return 2*PI*radius;
    }

}

class Triangle implements Shape{

    private double base = 5;
    private double height =10;

    @Override
    public Double getArea(){
        return 0.5*base*height;
    }
} 

class Rectangle implements Shape{
    private double length = 3;
    private double width = 8;

    @Override
    public Double getArea() {
        return length*width;
      
    }
}




public class interfaceFirst {
    public static void main(String[] args) {
        
        Shape circle = new Circle();
        System.out.println("Area of circle : "+circle.getArea());

        Shape triangle = new Triangle();
        System.out.println("Area of Triangle : "+triangle.getArea());

        Shape rectangle = new Rectangle();
        System.out.println("Area of Rectangle : "+rectangle.getArea());

        
    }
}
