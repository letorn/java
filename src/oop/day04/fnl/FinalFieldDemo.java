package oop.day04.fnl;
/**
 * final 修饰的属性, 不能再修改
 * static 修饰的属性, 只有一份
 */
public class FinalFieldDemo {
  public static void main(String[] args) {
    Xoo x1 = new Xoo(); Xoo x2=new Xoo();
    System.out.println(x1.id+","+x2.id+","+Xoo.index); 
  }
}
class Xoo{
  static int index = 0;
  final int id; 
  public Xoo() {
    id=index++;
  }
}

