package oop.day03.demo;
/** 圆是具体类, 继承图形就必须实行图形中的所有抽象方法("规约")
 * 图形的抽象方法是子类的"规约"(规定, 约定), 约定类子类具有
 * 一致的公共外观(一定包含 area() 和  contains()方法)
 *  */
public class Circle extends Shape {
  int r;
  public Circle(int x, int y, int r) {
    location = new Point(x,y);
    this.r = r;
  }
  /** 实现Shape中约定的方法  */
  public double area() {
    return Math.PI * r * r;
  }
  /** 实现Shape中约定的方法 */
  public boolean contains(int x, int y) {
    return this.location.distance(x, y) <= r;
  }
}
