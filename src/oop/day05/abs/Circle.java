package oop.day05.abs;
/**
 * 圆是具体图形, 是抽象图形的实现, 实现了全部的抽象方法 
 * 圆是图形的子类型. 
 *  Circle extends Shape 翻译为 "Circle 是  Shape" 
 */
public class Circle extends Shape{
  private int r;
  public Circle() {
  }
  public Circle(int x,int y, int r) {
    super.location = new Point(x, y);
    this.r = r;
  }
  public double area(){
    return Math.PI * r * r;
  }
  public boolean contains(int x, int y){
    return this.location.distance(x, y)<=r;
  }
}
