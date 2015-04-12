package se1.day05;

public class ThrowsExceptionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card card = null;
//		printCard(card);
		try {
			printCard(card);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void printCard(Card card)throws Exception{
		try{
			System.out.println(card.toString());
		}catch(NullPointerException e){
			System.out.println("有错，我不解决，谁调用我谁解决！");
			throw e;//主动抛出异常
		}catch(Exception e){
			throw e;
		}
	}

}
