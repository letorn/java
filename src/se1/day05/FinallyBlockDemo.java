package se1.day05;
/*
 * finally块演示
 * 
 * 坚定不移的必须执行
 * 
 * 杀价题
 */
public class FinallyBlockDemo {
	public static void main(String[] args) {
		System.out.println(test(null) + "," + test("0") + "," + test(""));
	}
	//A:0,0,5   B:1,0,1   C:4,0,5    D:4,4,4
	public static int test(String str){
		try{
			return str.charAt(0) - '0';
		}catch(NullPointerException e){
			return 1;
		}catch(RuntimeException e){
			return 2;
		}catch(Exception e){
			return 3;
		}finally{
			return 4;
		}
	}
}
