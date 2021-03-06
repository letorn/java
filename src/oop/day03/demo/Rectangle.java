﻿package oop.day03.demo;

public class Rectangle extends Shape {
  int height;//高
  int width;//宽
  public Rectangle(Point location, int w, int h) {
    this.location = location;
    this.width = w;
    this.height = h;
  }
  public Rectangle(int x, int y, int w, int h) {
    this(new Point(x, y), w, h);
  }
  public double area() {
    return this.width * this.height;
  }

  public boolean contains(int x, int y) {
    int w = x-this.location.x; int h = y-this.location.y;
    return w>=0 && w<this.width && h>=0 && h<this.height;
  }
}
