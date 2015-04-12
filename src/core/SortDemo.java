package core;

import java.util.Arrays;

public class SortDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ary = {8,3,5,1,4,9};
		//selectionSort(ary);
		//bubbleSort(ary);
		insertionSort(ary);
		//Arrays.sort(ary);//系统类Arrays排序方法
		System.out.println(Arrays.toString(ary));
	}
	
	//冒泡排序
	public static void bubbleSort(int[] ary){
		for(int i=0;i<ary.length-1;i++){
			for(int j=0;j<ary.length-1-i;j++){
				if(ary[j]>ary[j+1]){
					int t = ary[j];
					ary[j] = ary[j+1];
					ary[j+1] = t;
				}
			}
		}
	}
	
	//选择排序
	public static void selectionSort(int[] ary){
		for(int i=0;i<ary.length-1;i++){
			for(int j=i+1;j<ary.length;j++){
				if(ary[i] > ary[j]){
					int t = ary[i];
					ary[i] = ary[j];
					ary[j] = t;
				}
			}
		}
	}
	
	//插入式排序
	public static void insertionSort(int[] ary){
		int i,j,t;
		for(i=1;i<ary.length;i++){
			t = ary[i];
			for(j=i-1;j>=0 && t<ary[j];j--){
				ary[j+1] = ary[j];
			}
			ary[j+1] = t;
		}
	}

}
