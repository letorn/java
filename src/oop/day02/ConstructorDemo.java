package oop.day02;
/**
 * 构造器规则
 *  1 类一定有构造器: 根本规则
 *  2 默认构造器现象
 *    A 如果类没有声明任何构造器, javac(编译器)自动添加默认构造器
 *    B 如果类声明构造器, javac就不再添加默认构造器了! 
 */
public class ConstructorDemo {
  public static void main(String[] args) {
    //Foo foo = new Foo(5);//编译错误, 没有Foo(int) 构造器!
    Foo foo = new Foo();//调用默认构造器
    //Goo goo = new Goo();//编译错误,Goo没有无参数构造器(默认构造器)
    //Goo 有构造器, 但是没有无参数构造器!
    Goo goo = new Goo(5);//调用有参数构造器Goo(int)
    System.out.println(goo.a);
  }
}
class Foo{// javac自动添加默认构造器: public Foo(){}
} 
class Goo{//Javac 不再添加默认构造器
  int a;
  public Goo(int a) { 
    this.a = a;
  }
}


