package oop.day05;

public class PrivateMethodDemo {
  public static void main(String[] args) {
    Koo koo = new Foo();
    koo.test2();
  }
}
class Koo{
  public void test2(){
    a();//执行父类型 Koo的a() 
    b();//执行子类型 Foo的b()覆盖方法,私有方法不能继承,继承才能覆盖
  }
  public void b(){ System.out.println("Call Koo b()"); }
  private void a(){ System.out.println("Call Koo a()"); }
}
class Foo extends Koo{
  public void b(){ System.out.println("Call Foo b()"); }
  public void a(){ System.out.println("Call Foo a()"); }
}

