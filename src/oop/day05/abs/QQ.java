package oop.day05.abs;
/**
 * implements 实现, 是一种继承关系
 *   具体类实现接口要实现全部的抽象方法
 */
public class QQ implements Car, Product {
  public double getPrice() {
    return 29990;
  }
  public String getType() {
    return TYPE_A;//TYPE_A 继承于Car
  }
  public void run() {
    System.out.println("启动");
  }
  public void stop() {
    System.out.println("停止");
  }
}



