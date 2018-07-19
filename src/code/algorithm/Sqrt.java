package code.algorithm;

public class Sqrt {

	public static void main(String[] args) {
		System.out.println(isPerfectSquare(5));
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
	
	 public static int mySqrt(int x) {//0,1,2,3,4,5,6
		  /*  double start=0;
		    double end = x;
		    double mid = 1;
		    double res = 1;
	        while(Math.abs(res-x) > 0.000001){
	        	mid = (end+start)/2;
	        	res = mid*mid;
	        	if(res>x){
	        		end = mid;
	        	}else{
	        		start = mid;
	        	}
	        }
	        return (int)mid;*/
		 if(x==0) return 0;
		 int start = 1;
		 int end = x;
		 int mid = 0;
		 while(start+1<end){
			 mid = start+(end-start)/2;
			 if(mid>x/mid){
				 end=mid;
			 }else{
				 start=mid;
			 }
		 }
		 
		 if(end<=x/end) return end;
		 return start;
	}

}
