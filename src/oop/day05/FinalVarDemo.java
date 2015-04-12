package oop.day05;

import java.util.Arrays;

/**
 * final的变量初始化以后"值"不能改
 * 引用变量的值是对象的首地址, 是这个地址不能改
 *   但是对象的属性还是可以改的!
 */
public class FinalVarDemo {
  public static void main(String[] args) {
    final int[] ary = {2,3,5};
    //ary = null; //编译错误
    ary[1] = 8;
    System.out.println(Arrays.toString(ary)); 
    final Goo g = new Goo();
    //g = null;//编译错误
    g.a = 10;
  }
}
class Goo{
  int a =5;
}




