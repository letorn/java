package oop.day05.obj;

import java.util.Arrays;

/**
 * 1 任何类型都继承于Object 
 * 2 都继承了Object定义的基本方法: toSting() 
 * 3 很多Java API 会默认调用 toString()作为对象的文本描述
 *   如: println(obj)  Arrays.toString()
 * 编程建议: 大多的类型要覆盖toString()方法
 */
public class ObjectDemo1 {
  public static void main(String[] args) {
    Point p1 = new Point(3,4);
    String str = p1.toString();
    System.out.println(str); //全限定名@hashcode
    System.out.println(p1); 
    Object[] ary = {p1, new Foo()};
    System.out.println(Arrays.toString(ary));
  }
}
class Foo{
  //public String toString() {
  //  return "Foo";
 // }
}
class Point /*extends Object*/ {
  private int x;
  private int y;
  public Point( int x, int y) {
    this.x = x;
    this.y = y;
  }
  public String toString() {
    return "("+x+","+y+")";//(4,5)
  }
}




