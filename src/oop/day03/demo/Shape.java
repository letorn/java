package oop.day03.demo;

public class Shape {
  Point location;
 
  public double area(){
    return 0;
  }
  public boolean contains(Point p){
    return contains(p.x, p.y);
  }
  public boolean contains(int x, int y){
    return false;
  }
}
