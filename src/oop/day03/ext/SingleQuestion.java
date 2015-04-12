package oop.day03.ext;
/**
 * extends 扩展, Java表示继承 
 *
 */
public class SingleQuestion extends Question {
  char answer;//单选答案
  public SingleQuestion(String title, 
      String[] options, char answer) {
    this.title = title;
    this.options = options;
    this.answer = answer;
  }
  /** 重写/覆盖 (Override) 替换/修改父类型的行为 */
  public boolean check(char[] answers) {
    if(answers==null || answers.length != 1){
      return false;
    }
    return this.answer == answers[0];
  }
}






