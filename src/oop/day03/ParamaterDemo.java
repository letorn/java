package oop.day03;

public class ParamaterDemo {
  public static void main(String[] args) {
    int a = 5; int[] ary= {5}; Dog wangcai = new Dog();
    add(a); add(ary); add(wangcai);
    System.out.println(a+","+ary[0]+","+wangcai.a);//5,6,6
  }
  public static int add(int a){
    return ++a;
  }
  public static int add(int[] ary){
    return ++ary[0];
  }
  public static int add(Dog wangwang){
    return ++wangwang.a;
  }
}
class Dog{
  int a = 5;
}



