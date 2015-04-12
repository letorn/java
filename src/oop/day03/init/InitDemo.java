package oop.day03.init;
/**
 * java 有个类: Class 类型的类型 
 *   Foo.class Koo.class Goo.class
 *   String.class System.class Integer.class ... 
 *  都是 Class 的实例
 * 
 * 对象实例化过程
 *  1 按需加载类文件到内存, 加载结果是对象, 这个对象是Class实例
 *    按需加载也叫懒惰加载, 就是尽量晚加载
 *  2 调用构造器创建对象
 *  3 子类构造器递归调用父类构造器
 *  4 先分配父类实例空间(实际上创建了父类型实例)
 *  5 调用父类型构造器方法体
 *  6 最后调用的是子类的方法体  
 *  7 返回一个子类对象实例, 里面包含父类型实例, 整体上是一个对象
 */
public class InitDemo {
  public static void main(String[] args) {
    Goo goo = new Goo();
    System.out.println(goo.a+","+goo.b+","+goo.c);
  }
}
class Koo{
  int a=1;
  public Koo(){
    a = 2;
  }
}
class Foo extends Koo{
  int b = 3;
  public Foo() {
    super();
    b = 4; a = 5;
  }
}
class Goo extends Foo{
  int c = 6;
  public Goo() {
    super();
    c = 7; b = 8; a = 9;
  }
}



