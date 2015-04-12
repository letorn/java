package oop.day02;

public class BookDemo {
  public static void main(String[] args){
    Book book;//声明变量: book, 是引用类型变量, 相当于代词
    //System.out.println(book.name);//编译错误, book未初始化
    //new 是运算符, 用来创建对象, new运算返回对象的首地址
    book= new Book();//创建Book类型的实例--对象
    //book是引用类型变量, 值是对象的首地址, 
    //引用变量通过地址引用了一个对象.
    book.name = "乡关何处";
    System.out.println(book.name);
    book = new Book();
    book.name = "鬼吹灯";
    
    System.out.println(book.name);
    book = null;
    System.out.println(book.name);//运行异常, 空指针异常
    //因为: book没有引用书对象造成, 有变量, 没有对象
    // 引用变量不是对象, 
    // 类型, 引用变量, 对象
    // Book  book     两个: new Book()  new Book() 
 //注意:
    // Java语言与自然语言差别: java 明确区别 类型, 引用变量, 对象
    // 在自然语言中不严格区别: 类型,变量,对象
    //    你家的狗那里去了! 狗: 既是类型,也是对象,也是应用变量
  }
}/*public class Book {
     int id;//编号
     String name; //书名字
     String isbn; //书号
     String[] authors; //作者
     double price; //价格
   }
*/




