package code.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSubstring {
	static int count=0;
	public static void main(String[] args) {
		String[] words = {"foo","bar"};
		findSubstring("barfoothefoobarman",words);
		
	}
	
	 public static List<Integer> findSubstring(String s, String[] words) {
		  if("".equals(s) || s == null || null == words || words.length==0){
              return null; 
           }
		 	List<Integer> ll = new ArrayList<Integer>();
			String[] words_copy = words.clone();
			List<String> list = new ArrayList<String>();
	 		int[] res = new int[words.length];//标记当前数已经全排
			dfs(0,words, res,words_copy,list);
			for(String ss:list){
				for(int i=0;i<s.length();i++){
					int index = s.indexOf(ss,i);
					if(index !=-1 && !ll.contains(index)){
						ll.add(index);
					}
				}
			}
			System.out.println(Arrays.asList(ll));
	        return ll;
	 }
	 
		public static void dfs(int deep,String[] words,int[] res,String[] arr,List<String> list){
			int total = words.length;
			if(deep>=total){
				StringBuffer sb =new StringBuffer();
				for(String a:arr){
					sb.append(a);
				}
				list.add(sb.toString());
				return;
			}
			
			for(int i=0;i<total;i++){
				if(res[i]==0){//当前数据没有被全排
					res[i]=1;//标记当前数已经全排
					arr[deep]=words[i];
					dfs(deep+1,words,res,arr,list);
					res[i]=0;
				}
			}
		}

}
