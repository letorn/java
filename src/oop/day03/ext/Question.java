package oop.day03.ext;
/** 选择题  */
public class Question {
  String title;//题干
  String[] options;//选项
  public void print(/*Question this*/){
    System.out.println(this.title);
    for(int i=0; i<this.options.length; i++){
      String option = this.options[i];
      System.out.print(option+'\t');
    }
    System.out.println();
  }
  public boolean check(char[] answers){//['A','D']
    return false;
  }
}
