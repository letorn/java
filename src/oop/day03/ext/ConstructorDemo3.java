package oop.day03.ext;

public class ConstructorDemo3 {
  public static void main(String[] args) {
    Yoo y1 = new Yoo();
    Yoo y2 = new Yoo(8);
  }
}
class Xoo{
  public Xoo() {
    System.out.println("call Xoo()"); 
  }
}
class Yoo extends Xoo{
  public Yoo() {
    //super();
  }
  public Yoo(int a){
    this();
  }
}