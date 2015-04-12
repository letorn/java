package oop.day04.fnl;
/**
 * 不能覆盖final方法
 */
public class FinalMethodDemo {
  public static void main(String[] args) {
  }
}
class Koo{
  public final void test(){
  }
}
class Goo extends Koo{
  //public void test(){//编译错误, 不能覆盖/重写test()
  //}
}