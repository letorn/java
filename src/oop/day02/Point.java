package oop.day02;
/** 点 类型(class)
 * this 代表当前这个对象
 * 构造器重载: 相同的构造器名, 参数列表不同, 就是参数不同的构造器
 *  重载的构造器: 代表根据不同的前提条件创建对象.
 *   Point(x,y) 创建一个点  Point(x) 创建对角线上的点
 *   
 *   对象方法: 是对象的功能
 *     1 方法的语法, 方法是行为, 一般使用动词定义方法名!
 *     2 方法的调用原理
 *     3 方法的参数传递
 *     4 方法可以重载(overload)
 *   方法案例: 
 *     1 计算当前点到原点(0,0)的距离, 当前点:this
 *     2 计算当前点到坐标(x,y)的距离
 *     3 计算当前点到另外一点的距离
 *     
 *   方法重载的业务意义: 行为的多态现象
 *    根据参数(宾语)的类型, 使用不同行为过程
 *    
 *      计算距离()
 *      计算距离(int,int)

 *      打(人)
 *      打(麻将)
 *      打(牌)
 *      打(车)
 *      
 *      打印(int) println(65)  按照10进制字符串打印
 *      打印(char) println('A')  按照字符打印
 *      打印(String) println("A")  按照字符串打印
 *      
 *      打酱油(钱,瓶子)
 *      打酱油(钱)
 *      打酱油(信用卡,瓶子)
 **/
public class Point {
  int x;
  int y;
  public Point(int x, int y){
    this.x = x;//是在软件运行期间,动态绑定到当前对象! 
    this.y = y;//编译以后不能确定谁是this, 运行期间确定!
  }
  /** 重载(overload)的构造器, 用来创建对角线上的点 */
  public Point(int x){
    this(x,x);//this()调用本来的其他构造器,必须写在构造器的第一行
    //this() 可以重用构造器, 简化代码(重复使用reuse)
    //this.x = x;
    //this.y = x;
  }
  /** distance:距离, 计算距离, 计算当前点到原点的距离 */
  public double distance(/* Point this */){
    //this 是方法的第一个隐含参数
    //return Math.sqrt(x*x + y*y);//可以省略this.
    return Math.sqrt(this.x*this.x + this.y*this.y);
  }
  /** 计算当前点(this)到一个坐标(x, y)的距离 
   * 重载的方法: 方法名一样, 方法参数不同 */
  public double distance(/*Point this*/int x, int y){
    return Math.sqrt((this.x-x)*(this.x-x) + 
        (this.y-y)*(this.y-y));
  }
  /** 计算当前点(this)到另外一点(other)的距离 */
  public double distance(Point other){
    //return Math.sqrt((this.x-other.x)*(this.x-other.x) +
    //    (this.y-other.y)*(this.y-other.y));
    // 就是 当前点到另外一点坐标的距离
    return this.distance(other.x, other.y);
  }
}









