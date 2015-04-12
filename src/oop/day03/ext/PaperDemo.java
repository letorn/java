package oop.day03.ext;

import java.util.Scanner;

public class PaperDemo {
  public static void main(String[] args) {
    //有考卷对象(数组), 没有考题对象(数组元素)
    Question[] paper = {null,null}; //new Question[2];
    paper[0] = new SingleQuestion(
        "谁是 让子弹飞一会 的导演?", 
        new String[]{"A 姜武","B 张艺谋","C 姜文","D 葛大爷"},
        'C');
    paper[1] = new MultiQuestion("谁演了 让子弹飞?", 
        new String[]{"A 姜文","B 姜武","C 姜子牙","D 刘嘉玲"}, 
        new char[]{'A','B','D'}); 
    Scanner console = new Scanner(System.in);
    for(int i=0; i<paper.length; i++){
      Question q = paper[i];
      q.print();// print(q)//显示考题
      System.out.print("选择答案:");
      String str = console.nextLine();//"ABC",控制台读取一行文本
      char[] answers = str.toCharArray();//将字符串转换为char数组
      //"ABC" -> ['A','B','C']
      if(q.check(answers)){//check(char[]) 动态绑定到p引用的对象
        System.out.println("行呀!");
      }else{
        System.out.println("革命尚未成功, 还需努力!");
      }
    }
  }
}











