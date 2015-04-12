package se1.day05;
/**
 * 扑克牌 
 */
public class Card {
  /** 花色 0代表方块, 1 代表梅花...*/
  private int suit;
  /** 点数  0代表3, 1代表4...  */
  private int rank;
  
  public static final int DIAMOND = 0; //方块(钻石)
  public final static int CLUB = 1; //梅花
  public static final int HEART = 2; //红桃(红心)
  public static final int SPADE = 3; //黑桃(花锄)
  public static final int JOKER = 4; //王

  public final static int THREE = 0;
  public final static int FOUR = 1;
  public final static int FIVE = 2;
  public final static int SIX = 3;
  public final static int SEVEN = 4;
  public final static int EIGHT = 5;
  public final static int NINE = 6;
  public final static int TEN = 7;
  public final static int JACK = 8;//J
  public final static int QUEEN = 9;//Q
  public final static int KING = 10;//K
  public final static int ACE = 11;//A
  public final static int DEUCE = 12; //2
  public final static int BLACK = 13; //小王
  public final static int COLOR = 14;//大王
  
  public Card() {
  }
  public Card(int suit,int rank){
    setSuit(suit);
    setRank(rank);
  }
  public int getRank() {
    return rank;
  }
  public void setRank(int rank) {
    if(rank<THREE || rank>COLOR){
      throw new RuntimeException("超过范围0~14:"+rank);
    }
    this.rank = rank;
  }
  public int getSuit() {
    return suit;
  }
  public void setSuit(int suit) {
    if(suit<DIAMOND || suit>JOKER){
      throw new RuntimeException("超过suit范围:"+suit);
    }
    this.suit = suit;
  }
  private static final String[] SUIT_NAME = 
    {"方块", "梅花", "红桃", "黑桃", ""}; 
  private static final String[] RANK_NAMES = 
  {"3","4","5","6","7","8","9","10","J","Q","K",
    "A","2","小王","大王"};

  public String toString(){
    String suitname = SUIT_NAME[this.suit];
    String rankname = RANK_NAMES[this.rank];
    return suitname+rankname;
  }
  
  public boolean equals(Object obj) {
    if(obj==null){
      return false;
    }
    if(this==obj){
      return true;
    }
    if(obj instanceof Card){
      Card other = (Card)obj;
      return this.rank==other.rank && this.suit==other.suit;
    }
    return false;
  }
  public int hashCode() {
    return suit*100+rank;
  }
}







