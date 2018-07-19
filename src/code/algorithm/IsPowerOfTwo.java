package code.algorithm;

public class IsPowerOfTwo {

	public static void main(String[] args) {
		//System.out.println(hammingWeight(-2147483648));
		//System.out.println(Integer.MAX_VALUE);
		//4294967295
		//2147483647
	}
	
	 public static boolean isPowerOfTwo(int n) {
		int count=0;
		while(n>0){//10 
			if((n & 1) == 1){
				count++;
			}
			n = n>>1;
		}
		if(count==1){
			return true;
		}
		return false;
	 }
	 
	 public int hammingWeight(int n) {
	        int count=0;
	        while(n!=0){
				count++;
				n = n & (n-1);
			}
			return count;
	    }
	 
	 public int minCostClimbingStairs(int[] cost) {
	        if (cost == null || cost.length == 0) {
	            return 0;
	        }
	        
	        int n = cost.length;
	        
	        int[] dp = new int[n];
	        dp[0] = cost[0];
	        dp[1] = cost[1];
	        
	        if (n == 1) {
	            return dp[0];
	        }
	        
	        for (int i = 2; i < n; i++) {
	            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
	        }
	        
	        return Math.min(dp[n - 1], dp[n - 2]);
	    }
	 

}
