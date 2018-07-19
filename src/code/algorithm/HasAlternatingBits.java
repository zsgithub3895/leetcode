package code.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class HasAlternatingBits {
	public List<String> resultList = new ArrayList<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addDigits(9199));
	}
	
	 public boolean hasAlternatingBits(int n) {
	       String binary = Integer.toBinaryString(n);
	       int len = binary.length();
	       int before = binary.charAt(0);
	       for(int i=1;i<len;i++){
	    	   int c = binary.charAt(i);
	    	   if(c == before){
	    		   return false;
	    	   }
	    		before = c; 
	       }
	       return true;
	 }
	 
	 public static int addDigits(int num) {//9999=36=9  
		 String s = Integer.toString(num);
		 if(s.length()==1){
			 return Integer.valueOf(s);
		 }
		 int sum = 0;
		 for(int i=0;i<s.length();i++){
			 int temp = Integer.valueOf(s.charAt(i)+"");
			  sum += temp;
		 }
		 return addDigits(sum);
	 }
	 
	 public String addStrings(String num1, String num2) {
		 if(null == num1 || null == num2) return null;
	        if(!num1.startsWith("0") || !num2.startsWith("0")) return null;
	        if(num1.length()>=5100 || num2.length()>=5100) return null;
	        int a = Integer.valueOf(num1) + Integer.valueOf(num2);
		        return String.valueOf(a);
	    }
	 
	 
	    public void findPath(TreeNode root,String path) {
	        if(root.left == null && root.right == null){
	        	resultList.add(path);
	        }
	        TreeNode left = root.left;
	        if(null != left){
	        	findPath(left,path+"->"+left.val);
	        }
	        
        	TreeNode right = root.right;
        	if(null != right){
        		findPath(right,path+"->"+right.val);
  	        }
	        
	    }

}
