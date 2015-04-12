package oop.day05.obj;

import java.util.Arrays;

/**
 * 1 == 比较的是变量的值, 不能用与比较对象是否相等.
 * 2 Object 中定义了比较对象相等的方法equals(), 默认使用==实现
 * 3 建议覆盖equals() 实现比较对象相等的逻辑
 * 4 使用关键属性比较对象是否相等如: 用户的ID
 * 5 java API 几乎都覆盖/重写了equals方法
 * 6 很多java API 使用equals方法判断对象是否相等
 *   Arrays.equals()
 */
public class ObjectDemo2 {
  public static void main(String[] args) {
    Node n1 = new Node(4,5);
    Node n2 = n1;
    Node n3 = new Node(4,5);
    System.out.println(n1==n2);//true
    System.out.println(n1==n3);//false
    System.out.println(n1.equals(n3));//true
    System.out.println(n1.equals(null));//false
    System.out.println(n1.equals(n1));//true
    System.out.println(n1.equals("4,5"));//flase
    
    String s1 = new String("1");
    String s2 = new String("1");
    System.out.println(s1==s2);//false
    System.out.println(s1.equals(s2));//true
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
        
    Node[] nodes1 = new Node[]{new Node(3,4),new Node(4,5)};
    Node[] nodes2 = new Node[]{new Node(3,4),new Node(4,5)};
    System.out.println(Arrays.equals(nodes1, nodes2)); 
  }
}
class Node{
  int i;
  int j;
  public Node(int i, int j) {
    this.i = i; this.j = j;
  }
  public boolean equals(Object obj) {
    if(obj==null){
      return false;
    }
    if(this==obj){
      return true;
    }
    if (obj instanceof Node) {
      Node other = (Node) obj;
      return this.i==other.i && this.j==other.j;
    }
    return false;
  }

  public int hashCode() {
    return i*10000+j;
  }
}







