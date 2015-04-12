package oop.day05.abs;

public class Rectangle extends Shape {
  private int width;
  private int height;
  public Rectangle() {
  }
  public Rectangle(int x, int y, int w, int h) {
    this.location = new Point(x, y);
    this.height = h;
    this.width = w;
  }
  public double area() {
    return this.width * this.height;
  }
  public boolean contains(int x, int y) {
    int offX = x - this.location.x;
    int offY = y - this.location.y;
    return offX>0 && offX<=width && offY>0 && offY<=height;
  }
}
