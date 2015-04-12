package oop.day02;

public class Circle {
  Point center;//圆心
  int r;//半径
  public Circle(Point center, int r) {
    this.center = center;
    this.r = r;
  }
  public Circle(int x, int y, int r){
    this(new Point(x, y), r);
  }
  public double area(){
    return Math.PI * this.r * r;
  }
  public boolean contains(Point p){
    return this.contains(p.x, p.y); 
  }
  public boolean contains(int x, int y){
    return center.distance(x, y) <= r;
  }
}









