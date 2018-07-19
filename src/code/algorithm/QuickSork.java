package code.algorithm;

import java.util.Arrays;

public class QuickSork {

	public static void main(String[] args) {
            int[] arr = {5,1,3,6,7};
            int i=0;
            int j=arr.length-1;
            insertSort(arr);
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
	
	 public static void insertSort2(int[] arr){
		 //{5,1,3,6,7};     [1,3,5]
         for(int i = 1;i < arr.length; i ++){
             if(arr[i] < arr[i-1]){
                 int temp = arr[i];
                 int j = 0;
                 for(j = i-1; j >= 0 && arr[j] > temp; j --){                
                         arr[j+1] = arr[j];//把比temp大或相等的元素全部往后移动一个位置            
                 }
                 arr[j+1] = temp;//把待排序的元素temp插入腾出位置的(j+1)
             } 
         }
         System.out.println(Arrays.toString(arr));
    }

	private static void quickSork(int[] arr, int low, int high) {
           		if(low<high){
           			int v = partition(arr,low,high);
           			quickSork(arr,low,v-1);
           			quickSork(arr,v+1,high);
           		}
	}

	/**
	 * 将数组分三部分:
	 * arr[low...j-1]<=arr[j]<=arr[j+1...high]
	 * return 中轴元素的下标
	 */
	private static int partition(int[] arr, int low, int high) {
		 int i=low;
		 int j=high+1;
		 int v = arr[low];
		 while(true){
			 
			 while(arr[++i]<v){ if(i==high) break;}
			 
			 while(arr[--j]>v){ if(j==low) break;}
			 
			 if(i>=j) break;
			 
			 swap(arr,i,j);
		 }
		 swap(arr,low,j);
		 System.out.println(Arrays.toString(arr));
		 return j;
	}

	private static void swap(int[] arr, int i, int j) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
	}
	

}
