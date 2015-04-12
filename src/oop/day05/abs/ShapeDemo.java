package oop.day05.abs;
/**
 * 1 抽象类型不能创建实例
 * 2 抽象类型可以定义变量, 引用具体类型实例 
 * 3 抽象类型的实例的多态的
 * 4 方法是动态绑定到对象的方法
 */
public class ShapeDemo {
  public static void main(String[] args) {
    //Shape s = new Shape();//编译错误, 不能创建抽象实例
    Shape s = new Circle(10,10,8);
    System.out.println(s.area());//执行的是圆的面积方法
    s = new Rectangle(2,2,10,8);
    System.out.println(s.area());//执行的是矩形的面积方法
    print(s); 
    print(new Circle(10,10,8));
  }
  public static void print(Shape s){
    for(int y=0; y<20; y++){
      for(int x=0; x<30; x++){
        if(s.contains(x, y)){
          System.out.print("*");
        }else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}







