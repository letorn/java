package oop.day03;

public class MethodDemo {
  public static void main(String[] args) {
    Foo foo = new Foo();
    System.out.println(foo.add(2));//调用 add(int)
    System.out.println(foo.add('2'));//调用 add(char)
  }
}
class Foo{
  public int add(char c){// 签名: add(char) 
    return c-'0'+1;
  }
  public int add(int a){// 签名: add(int) 
    return a+1;
  }
  //public int add(int b){//编译错误,重复的方法 签名: add(int) 
  //  return b+1;
  //}  
  public int add(int a, int b){//签名 add(int, int)
    return a+b;
  }
}
