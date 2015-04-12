package oop.day04.fnl;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * final 修饰的类不能被子类继承
 * javaAPI 中的final 类: String, Integer Double Math 
 * final 类在工作中不建议使用!
 *   Spring  Hibernate  Struts2  等这些框架 
 *   使用了 动态代理技术: 原理是"继承"类并且"覆盖"所有方法, 添加逻辑
 *   final类会阻止继承, 影响"SSH框架"的使用
 */
public class FinalClassDemo {
  public static void main(String[] args) {
  }
}
final class Foo{
}
//class Koo extends Foo{} //编译错误, 不能继承子类了
//class MyString extends String{} //编译错误 String是final的
//class MyArrays extends Arrays{} //编译错误,Arrays构造器是私有的
class MyArrayList extends ArrayList{} 



