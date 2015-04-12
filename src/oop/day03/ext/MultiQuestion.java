package oop.day03.ext;

import java.util.Arrays;

/**
 * extends 扩展, Java表示继承 
 */
public class MultiQuestion extends Question {
  char[] answers;//多项标准答案
  public MultiQuestion(String title, 
      String[] options, char[] answers) {
    this.title = title;
    this.options = options;
    this.answers = answers;
  }
  public boolean check(char[] answers) {
    return Arrays.equals(this.answers, answers);
  }
}






