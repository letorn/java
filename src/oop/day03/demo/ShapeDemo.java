package oop.day03.demo;

public class ShapeDemo {
  public static void main(String[] args) {
    Shape s = new Circle(5,6,4);
    Point p = new Point(7,8);
    System.out.println(s.area());
    System.out.println(s.contains(p));//true
    s = new Rectangle(5,5,5,5);
    System.out.println(s.area());
    System.out.println(s.contains(p));//true
  }

}
