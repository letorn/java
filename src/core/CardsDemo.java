package core;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class CardsDemo {
	public static void main(String[] agrs){
		String[] cards = new String[]{"红桃A","红桃K","红桃J","红桃8",
				"红桃7","红桃10","红桃5","红桃3"};
		String[] players = new String[]{"白展堂","佟湘玉","莫小贝"};
		
		Random random = new Random();
		//i 代表最后
		for(int i=cards.length-1;i>=1;i--){
			int j = random.nextInt(i);
			String t = cards[i];
			cards[i] = cards[j];
			cards[j] = t;
		}
//		System.out.println(Arrays.toString(cards));
		System.out.println(cards[0] + "," + cards[1]);
		Scanner console = new Scanner(System.in);
		System.out.print("要牌不(Y/N):");
		String isYes = console.nextLine();
		if(isYes.equals("Y")){
			System.out.println(cards[2]);
		}
		

	}
}
