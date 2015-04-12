package oop.day03.ext;
/**
 * 子类一定调用父类型构造器
 *   1 类一定有构造器
 *   2 子类默认调用父类无参数构造器
 *   3 如果父类没有无参数构造器, 必须使用super() 调用父类的构造器
 *   super: 超级的  Super Man  
 */
public class ConstructorDemo2 {
  public static void main(String[] args) {
    Noo noo = new Noo();
    Moo moo = new Moo();//子类默认调用无参数父类构造器!
  }
}
class Koo{
  public Koo(int s){
    System.out.println(s); 
  }
}
//class Noo extends Koo{}//编译错误, 父类没有无参数构造器!
class Noo extends Koo{
  //public Noo(){/*super();*/}//编译错误, 父类没有无参数构造器
  public Noo(){
    super(8);//子类使用super() 调用父类构造器
  }
}
class Moo extends Noo{/*public Moo(){super();}*/}











