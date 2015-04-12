package oop.day05.card;

import java.util.Arrays;
import java.util.Random;

public class CardDemo {
  public static void main(String[] args) {
    //Card ace = new Card(20, 200);
    //Card ace1 = new Card(Card.SPADE, 12);
    Card[] cards = new Card[54];//{null,null,...}
    //System.out.println(cards[0].getRank());//空指针异常
    int i=0;
    for(int rank=Card.THREE; rank<=Card.DEUCE; rank++){
      cards[i++] = new Card(Card.DIAMOND, rank); 
      cards[i++] = new Card(Card.CLUB, rank); 
      cards[i++] = new Card(Card.HEART, rank); 
      cards[i++] = new Card(Card.SPADE, rank); 
    }
    System.out.println(i); 
    cards[i++] = new Card(Card.JOKER, Card.BLACK);
    cards[i++] = new Card(Card.JOKER, Card.COLOR);
    //洗牌
    Random random = new Random();
    for(i=cards.length-1; i>0; i--){
      int j = random.nextInt(i);
      Card card = cards[i];
      cards[i]=cards[j];
      cards[j]=card;
    }
    System.out.println(Arrays.toString(cards));  
    //发牌
    Player[] players = new Player[3];
    players[0] = new Player(1,"九把刀");
    players[1] = new Player(2,"二把刀");
    players[2] = new Player(3,"一把刀");
    int index = 0;
    for(i=0; i<cards.length; i++){
      Card card = cards[i];
      Player someone = players[index++%players.length];
      someone.add(card);
    }
    System.out.println("结果:"); 
    System.out.println(players[0]);
    System.out.println(players[1]);
    System.out.println(players[2]);
  }
}













