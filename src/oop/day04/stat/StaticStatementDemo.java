package oop.day04.stat;
/** 
 * 非静态代码块: 在创建对象时候执行, 类似构造器
 * 静态代码块: 在类的加载期间执行,类只加载一次,静态代码块也执行一次
 */
public class StaticStatementDemo {
  public static void main(String[] args) {
    new Goo(); new Goo();
  }
}
class Goo{
  //System.out.println();//编译错误,类中不能有语句
  { System.out.println("非静态代码块");}//非静态代码库,很少使用
  static { System.out.println("静态代码块");}//比较少用
  public Goo() {
    System.out.println("调用构造器!"); 
  }
}

