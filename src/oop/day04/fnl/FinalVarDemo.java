package oop.day04.fnl;
/**
 * final变量: 初始化以后, 不能再修改
 * 
 * 提示: 不正确的说法: final变量不能修改
 *
 */
public class FinalVarDemo {
  public static void main(String[] args) {
    final int a = 1;//局部变量
    int b = 1;
    b = b++;
    //a = a++;//编译错误, 不允许修改a
    System.out.println(b); 
    test(a,b);
  }
  public static void test(final int x, int y){
    //x++;//编译错误, 不能再次修改x
    y++;
    System.out.println(y); 
  }
}




