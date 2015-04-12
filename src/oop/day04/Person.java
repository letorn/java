package oop.day04;
/** java Bean */
public class Person {
  private String name;
  private boolean married;
  public Person() {
  }
  public Person(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }
  public boolean isMarried(){
    return married;
  }
  public void setMarried(boolean married){
    this.married = married;
  }
}
