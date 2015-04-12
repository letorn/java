package oop.day03.ext;
/**
 * 构造器 是不能继承的 
 */
public class ConstructorDemo {
  public static void main(String[] args) {
    Goo g1 = new Goo();//是子类的默认构造器Goo() 不是Foo()
    //Goo g2 = new Goo(5);//编译错误,没有Goo(int)构造器
    //Goo 不能继承父类型构造器Foo(int)
    //System.out.println(g2.a); 
  }
}// 选择运行结果: A 编译错误  B 运行异常  C 0  D 5 
class Foo{
  int a;
  public Foo() {
  }
  public Foo(int a){
    this.a = a;
  }
}
class Goo extends Foo{
}


