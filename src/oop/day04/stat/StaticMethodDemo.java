package oop.day04.stat;
/** 静态方法演示
 * 静态方法是属于类的方法, 不创建对象, 直接使用类名调用
 *  静态方法, 中没有this, 不能访问this的资源(属性/方法)
 *   java API 中的静态方法(工具方法):
 *    Arrays.sort()  Arrays.fill()  Arrays.equals()
 *    Math.sin()  Math.sqrt()  Integer.toHexString() 
 * 提示: main方法也是静态方法, 没有隐含变量this
 * 非静态方法: 必须使用对象调用, 对象隐含传递给方法中this
 **/
public class StaticMethodDemo {
  int a = 1;
  public static void main(String[] args) {
    Koo.test();//静态方法可以利用类名访问
    Koo koo = new Koo();
    koo.test2();//test2(koo) //非静态方法使用对象调用
  }
}
class Koo{
  int a = 1;//实例变量
  static int b = 4;
  public void test2(/*Koo this*/){//有隐含参数this引用当前对象
    System.out.println("对象方法"+this.a);
  }
  public static void test(){//没有隐含参数this
    //System.out.println(a);//编译错.静态方法中没有this!
    //this.test2();//编译错误!
    System.out.println("静态方法"+b); 
  }
}

