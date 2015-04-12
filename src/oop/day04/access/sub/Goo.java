package oop.day04.access.sub;

public class Goo {
  public int a = 1;//共有 / 公共
  protected int b = 2; //保护
  int c = 3; // 默认的 不使用修饰词
  private int d = 4; //私有的
  public int getD(){
    return d;
  }
}
