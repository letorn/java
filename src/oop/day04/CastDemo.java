package oop.day04;
/**
 * 引用数据类型转换
 *   1 自动类型转换(小类型到大类型): 子类型变量转换为父类型变量
 *   2 强制类型转换(大类型到小类型): 父类型变量转换为子类型变量
 *     A 父类型实际引用的是子类型实例, 可以转换成功
 *     B 父类型实际引用的不是子类型实例, 转换失败: 运行异常
 *   3 instanceof 运算符: 测试实际变量引用类型的兼容性
 *   
 *   Number : 数
 *    |-- Integer 整数
 *    |-- Double 双倍浮点数
 *    |-- Long 长整数
 *    |-- Float
 *    |-- Byte
 *    |-- Short
 */
public class CastDemo {
  public static void main(String[] args) {
    Integer i = new Integer(5);
    Double d = new Double(5.5);
    //小到大的转换
    Number n = i;
    n = d;
    //大到小的转换
    //Double x = n;//编译错误
    Double x = (Double)n;//转换成功
    //Integer y = (Integer)n;//运行异常,转换异常, ClassCastException
    //检查变量引用的对象类型 
    // instance 实例  of 的   : 检查 ... 的实例 
    // 检查n引用的对象是否是Double类型的实例
    System.out.println(n instanceof Double); //true
    System.out.println(n instanceof Integer);//false
    //常见用法: 类型安全的数据类型转换,不会出现异常
    if(n instanceof Integer){
      Integer z = (Integer) n;
      System.out.println(z+"是一个整数!");
    }
  }
}









