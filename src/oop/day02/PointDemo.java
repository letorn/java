package oop.day02;
/**
 * 点类型演示 
 *
 */
public class PointDemo {
  public static void main(String[] args) {
    Point p1 = new Point(3,4);
    System.out.println(p1.x);
    Point p2 = new Point(5,5);
    System.out.println(p2.x);
    //Point p3 = new Point();
    Point p3 = new Point(5);//创建对角线上的点
    System.out.println(p1.distance());//distance(p1)
    System.out.println(p2.distance());//5*1.414
    //--------------------------
    Point p4 = new Point(3,4);
    System.out.println(p4.distance(6,8)); 
    // System.out.println(distance(p4,6,8));
    //System.out.println(p4.distance(6));//编译错误:
    // 没有方法: distance(int)
    System.out.println(p4.distance(p2)); 
    
  }
}



