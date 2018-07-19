package code.algorithm;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

	}

	public static boolean isPerfectSquare(int num) {
        if(num==0) return true;
		 int start = 1;
		 int end = num;
		 int mid = 0;
		 while(start+1<end){
			 mid = start+(end-start)/2;
			 if(mid*mid == num){
				 return true;
			 }
			 if(mid>num/mid){
				 end=mid;
			 }else{
				 start=mid;
			 }
		 }
		 if(end*end==num)  return true;
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