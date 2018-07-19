package code.algorithm;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

	}

	public static boolean isPerfectSquare(int num){
		return false;
	}
	
	private static void insertSort(int[] arr) {
		for(int i=0;i<arr.length;i++){
			int index = arr[i];
			int position = i;
			while(position>0 && arr[position-1]> index){
				arr[position] = arr[position-1];
				position--;
			}
			arr[position]=index;
		}
		 System.out.println(Arrays.toString(arr));
		
	}
}
