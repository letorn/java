package oop.day02;

public class RectangleDemo {
  public static void main(String[] args) {
    Rectangle rect = new Rectangle(3,4,5,5);
    System.out.println(rect.area());
    System.out.println(rect.contains(4,4)); 
    
  }

}
