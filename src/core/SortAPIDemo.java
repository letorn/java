package core;

import java.util.Arrays;
import java.util.Random;

public class SortAPIDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ary = new int[10000];//4(byte)*10000/1024=40(k)
		Random random = new Random();
		for(int i=0;i<ary.length;i++){
			ary[i] = random.nextInt(ary.length);
		}
		
		int[] ary1 = Arrays.copyOf(ary,ary.length);
		int[] ary2 = Arrays.copyOf(ary,ary.length);
		int[] ary3 = Arrays.copyOf(ary,ary.length);
		
		long t1 = System.currentTimeMillis();
		Arrays.sort(ary);//Java API 提供的排序方法
		long t2 = System.currentTimeMillis();
		SortDemo.selectionSort(ary1);
		long t3 = System.currentTimeMillis();
		SortDemo.bubbleSort(ary2);
		long t4 = System.currentTimeMillis();
		SortDemo.insertionSort(ary3);
		long t5 = System.currentTimeMillis();
		System.out.println("API:"+(long)(t2-t1));
		System.out.println("selectionSort:"+(long)(t3-t2));
		System.out.println("bubbleSort:"+(long)(t4-t3));
		System.out.println("insertionSort:"+(long)(t5-t4));
		
		//二分查找
		int index = Arrays.binarySearch(ary, 1000);
		System.out.println(index);
		if(index<0){
			System.out.println("没有找到");
		}
		
		//字符串数组查找
		String[] str = {"abcdefg"};
		System.out.println(Arrays.binarySearch(str,"d"));
		//字符串查找
		String str1 = "abcdefg";
		System.out.println(str1.indexOf("c"));
		
		//比较
		System.out.println(Arrays.equals(ary, ary1));
		System.out.println(ary1[index]);
		
		//填充
		int[] ary5 = {5,6,7};
		Arrays.fill(ary5,10);
		System.out.println(Arrays.toString(ary5));
	}

}
