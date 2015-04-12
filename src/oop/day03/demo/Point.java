package oop.day03.demo;
 
public class Point {
  int x;
  int y;
  /** 表示对角线上的点 */
  public Point(int x){
    //System.out.println("Hi");//this()必须写在构造器的第一行!
    this(x,x);//调用本类的构造器, 根据参数列表匹配
    //this.x = x;
    //this.y = x;
  }
  /** 构造器 */
  public Point(int x, int y){
    this.x = x;
    this.y = y;
  }
  /** 计算当前点(this), 到原点的距离 */
  public double distance(){
    return Math.sqrt(this.x*this.x + this.y*this.y); 
  }
  /** 方法重载(方法名一样, 参数列表不一样): 计算当前点到某
   * 点坐标的距离 */
  public double distance(int x, int y){
    return Math.sqrt((this.x-x)*(this.x-x) + 
        (this.y-y)*(this.y-y));
  }
  /** 重载的方法之间"经常"是重用的 */
  public double distance(Point other){
    return this.distance(other.x, other.y);
  }
}






