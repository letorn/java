package core;

public class LongTimeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long now = System.currentTimeMillis();
		long year = now/1000/60/60/24/365+1970;
		System.out.println(now);
		System.out.println(year);//2012
		long max = 0x7fffffffffffffffL;
		year = max/1000/60/60/24/365 + 1970;
		System.out.println("公元:"+ year);
	}

}
