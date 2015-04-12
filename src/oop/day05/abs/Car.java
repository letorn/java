package oop.day05.abs;
/**
 * 抽象的汽车概念
 * 1 接口中的属性, 只能是常量
 * 2 接口中的方法只能是抽象方法
 * 
 * interface 与 abstract class 差别
 *    interface 是纯抽象
 *    abstract class 是可以是部分抽象(可以保护具体方法)
 *    接口可以多实现, 
 *    抽象类只能单继承
 */
public interface Car {
  /*public static final*/String TYPE_A = "A";
  String TYPE_B = "B";
  String TYPE_C = "C";
  /*public abstract*/String getType();
  void run();
  void stop();
}



