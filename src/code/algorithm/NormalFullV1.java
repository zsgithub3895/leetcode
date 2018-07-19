package code.algorithm;

import java.util.Arrays;

public class NormalFullV1 {
	static int[] arr ={1,2,3,4};
	static int[] result = new int[4];
	static int total=4;
	static int count;
	public static void main(String[] args) {
		System.out.println(count);
	}
	
	public static void full_1(){
		int count=0;
		int[] arr =new int[5];
		for(arr[1]=1;arr[1]<5;arr[1]++){
			for(arr[2]=1;arr[2]<5;arr[2]++){
				for(arr[3]=1;arr[3]<5;arr[3]++){
					for(arr[4]=1;arr[4]<5;arr[4]++){
						int[] result = new int[5];
						boolean flag = true;
						for(int i=1;i<5;i++){
							result[arr[i]] +=1 ;
							if(result[arr[i]]>1) flag=false;
						}
						if(flag){
							System.out.println(arr[1]+"|"+arr[2]+"|"+arr[3]+"|"+arr[4]);
							count++;
						}
					}
				}
			}
		}
		System.out.println(count);
	}
	
	
	public static void dfs2(int deep){
		if(deep>=total){
			int[] result = new int[5];
			boolean flag = true;
			for(int i=1;i<total;i++){
				result[arr[i]] +=1 ;
				if(result[arr[i]]>1) flag=false;
			}
			if(flag){
				System.out.println(arr[1]+"|"+arr[2]+"|"+arr[3]+"|"+arr[4]);
				count++;
			}
			return;
		}
		
		for(int i=1;i<total;i++){
			arr[deep]=i;
			dfs2(deep+1);
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void dfs3(int deep){
		if(deep>=total){
			System.out.println(arr[1]+"|"+arr[2]+"|"+arr[3]+"|"+arr[4]);
			count++;
			return;
		}
		
		for(int i=1;i<total;i++){
			if(result[i]==0){//当前数据没有被全排
				result[i]=1;//标记当前数已经全排
				arr[deep]=i;
				dfs3(deep+1);
				result[i]=0;
			}
		}
		//System.out.println(Arrays.toString(arr));
	}
	

	
	

	
}
