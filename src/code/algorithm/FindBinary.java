package code.algorithm;

public class FindBinary {

	public static void main(String[] args) {
		System.out.println(addBinary("111","111"));
	}
	
	public static String addBinary(String a, String b) {
        if(null == a && null == b){
        	return null;
        } 
        int len=0;
        StringBuffer sa = new StringBuffer();
        StringBuffer sb = new StringBuffer();
        if(a.length() > b.length()){
        	 len = a.length() - b.length();
        	 for(int i=0;i<len;i++){
        		 sb.append("0");
         	 }
        }else{
        	 len = b.length() - a.length();
        	 for(int i=0;i<len;i++){
        		 sa.append("0");
         	 }
        }
       sb.append(b);
   	   sa.append(a);
   	   int l = sb.length();
   	   StringBuffer sc = new StringBuffer();
   	   int count = 0;
   	   for(int i=l-1;i>=0;i--){
   		   int c = Integer.valueOf(sa.charAt(i)+"") +Integer.valueOf(sb.charAt(i)+"")+count;
   		   int x = c%2;
   		   if(c > 1){
   			   sc.append(x);
   			   count=1;
   		   }else{
   			   sc.append(x);
   			   count=0;
   		   }
   	   }
   	   if(count!=0){
   		  sc.append(1);
   	   }
        return sc.reverse().toString();
    }

}
