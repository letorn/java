package oop.day04.stat;
/**
 * 静态属性演示
 *  限量版月饼 1~99
 */
public class StaticFieldDemo {
  public static void main(String[] args) {
    Class cls = MoonCake.class; //cls 就是"月饼类"的引用
    String name = cls.getName();
    System.out.println(name); 
    MoonCake c1 = new MoonCake();
    MoonCake c2 = new MoonCake();
    System.out.println(c1.id+","+c2.id+","+MoonCake.index); 
  }
}
class MoonCake{//月饼
  static int index=1;
  int id;
  public MoonCake() {
    if(index==100){
      throw new RuntimeException("不能生产了!");
    }
    id = index++;
  }
}
