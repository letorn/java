package oop.day05.abs;
/**
 * 抽象的图形概念(不能确定具体形状),
 *   图形一定可以计算面积, 计算面积的方法是抽象的(不确定的). 
 *
 *  图形一定可以计算面积, 可以判断是否包含坐标/点
 *  
 *  具体类继承抽象类, 必须实现全部的抽象方法, 极其合理
 */
public abstract class Shape {
  protected Point location;//图形的位置
  public abstract double area();
  public abstract boolean contains(int x, int y);
  public boolean contains(Point p){//Method Body 方法体
    return this.contains(p.x, p.y);
  }
}






