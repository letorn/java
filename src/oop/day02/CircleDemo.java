package oop.day02;

public class CircleDemo {
  public static void main(String[] args) {
    Circle c = new Circle(3,4,5);
    System.out.println(c.area());
    System.out.println(c.contains(6,8));//true
  }
}
