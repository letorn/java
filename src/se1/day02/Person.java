package se1.day02;

public class Person {
  private int age = 16;
  
  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if(age>100||age<0){
      System.out.println("火星人?");
    }else{
      this.age = age;
    }
  }

  public void sayHello(){
    System.out.println("大家好!我的年龄是" + age);
  }
}
