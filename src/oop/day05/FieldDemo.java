package oop.day05;
/**
 * 1 属性绑定到引用变量的类型 
 * 2 方法动态绑定到对象
 * 骗子的名字:  一个对象!
 *   1 骗子是人 骗子继承于人
 *   2 人有人名, 骗子有骗子的名字
 *   3 与骗子的招呼: whoau() 返回一定是骗子的名字
 *   4 查户口: 按类型检查 属性 , 按照类型返回属性名 
 */
public class FieldDemo {
  public static void main(String[] args) {
    Tricker t = new Tricker();
    Person p = t;
    System.out.println(t.name + "," + p.name);
    System.out.println(t.whoau() + "," + p.whoau()); 
  }
}
class Person{
  String name="大灰狼";
  public String whoau(){return this.name;}
}
class Tricker extends Person{//骗子
  String name = "喜羊羊";
  public String whoau(){
    // Tricker this.name
    // Person super.name
    return this.name;
  }
}









