package oop.day05.abs;
/**
 * 1 抽象类型/接口不能创建实例
 * 2 抽象类型可定义变量, 引用具体类型实例
 * 3 接口也是实现子类型的父类型
 */
public class QQDemo {
  public static void main(String[] args) {
    QQ qq = new QQ(); //QQ是汽车也是商品
    Car car = qq;
    Product p = qq;
    System.out.println(p.getPrice());
    car.run();
    car.stop();
    //System.out.println(car.getPrice());
    //car类型没有getPrice()方法
    Car cc = (Car) p; 
    
  }
}
