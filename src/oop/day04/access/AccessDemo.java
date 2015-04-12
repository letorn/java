package oop.day04.access;

import oop.day04.access.sub.Goo;
/** 
 * 访问修饰/访问控制 
 * 
 * 继承 父子概念继承关系
 * 多态 父类的子类型实例是多种多样的, 相同名方法 实际过程是多样的
 * 封装:  尽可能私有, 减少公有, 减少暴露, 
 * 
 */
public class AccessDemo {
  public static void main(String[] args) {
    Goo g = new Goo();
    System.out.println(g.a);
    //System.out.println(g.b);//编译错误 不可见
    //System.out.println(g.c);//编译错误 不可见
    //System.out.println(g.d);//编译错误 不可见
    Foo f = new Foo();
    System.out.println(f.a);
    System.out.println(f.b);//同包关系, same package
    System.out.println(f.c);
    //System.out.println(f.d);//编译错误,d不可见
    f.a =8;
    //f.d = 8;//编译错误
    System.out.println(f.getD()); 
    
    Koo k = new Koo();
    k.test();
  }
}
class Koo extends Goo{// Koo 与 Goo 不在同一package中
  public void test(){
    System.out.println(a);
    System.out.println(b);//子类中可以访问父类中保护的属性b
    //System.out.println(c);//编译错误, c不可见
    //System.out.println(d);//编译错误, d不可见
  }
}
class Foo{
  public int a = 1;//共有 / 公共
  protected int b = 2; //保护
  int c = 3; // 默认的 不使用修饰词
  private int d = 4; //私有的
  public int getD(){
    return d;
  }
}






