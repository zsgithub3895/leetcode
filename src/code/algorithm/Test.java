package code.algorithm;

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
	
}
