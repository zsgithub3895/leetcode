package code.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrangeCoins2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// System.out.println(arrangeCoins1(2147483647));
		// System.out.println(arrangeCoins2(2147483647));
		// System.out.println(addStrings("9133","0"));//276
		/*
		 * int[] g ={1,1,2}; int[] s = {2,2};
		 * System.out.println(findContentChildren(g,s));
		 */

		// System.out.print(firstBadVersion(2126753390));
		// System.out.println(guessNumber(10));
		/*
		 * BufferedReader in = new BufferedReader(new
		 * InputStreamReader(System.in)); String line; while ((line =
		 * in.readLine()) != null) { int n = Integer.parseInt(line); line =
		 * in.readLine(); int pick = Integer.parseInt(line);
		 * 
		 * int ret = guessNumber(n);
		 * 
		 * String out = String.valueOf(ret);
		 * 
		 * System.out.print(out); }
		 */
		//binaryToHex(10);
		int[] a = {1};
		int[] b = {1};
		System.out.println(firstUniqChar("a"));
	}
	
	  public char findTheDifference(String s, String t) {
	       // char tmp = 0;
		    char tmp = 0x00;
	        for(int i=0;i<s.length();i++)
	            tmp =(char)( tmp ^ s.charAt(i));
	        for(int i=0;i<t.length();i++)
	            tmp = (char)(tmp ^ t.charAt(i));
	        return tmp;
	    }
	  
	  public static int[] intersection(int[] nums1, int[] nums2) {
		  	Arrays.sort(nums1);
	        Arrays.sort(nums2);
	        int i = 0; 
	        int j = 0;
	        int k = 0;
	        int[] res = new int[Math.min(nums1.length, nums2.length)];
	        int before = -1;
	        while (i < nums1.length && j < nums2.length) {
	        	 if (nums1[i] == nums2[j]) {
					if (before == nums2[j]) {
						i++;
						j++;
					} else {
						before = nums2[j];
						res[k] = nums1[i];
						k++;
						i++;
						j++;
					}
	            } else if (nums1[i] < nums2[j]) {
	                i++;
	            } else {
	                j++;
	            }
	        }
	        return Arrays.copyOfRange(res, 0, k);
	    }
	  
	  public static int firstUniqChar(String s) {
	        int len = s.length();
	        Set<String> set = new HashSet<String>();
	        for(int i=0;i<len;i++){
	        	String temp = s.substring(i+1,len);
	        	if(null == temp || "".equals(temp)) return i;
	        	if(temp.contains(s.charAt(i)+"")){
	        		set.add(s.charAt(i)+"");
	        		continue;
	        	}else if(!set.contains(s.charAt(i)+"")){
	        		return i;
	        	}
	        }
	        return -1;
	    }
	  
	  public static int rotatedDigits(int N) {
	        String s = "2569";
	        int count = 0;
	        for(int i=1;i<N;i++){
	            if(i==2 || i==5 || i==6 || i==9) count++;
	            if(i>10){
	            	String ss = i+"";
	            	int len = ss.length();
	            	boolean  b = true;
	            	for(int j=0;j<len;j++){
	            		String tt = ss.charAt(j)+"";
	            		if(tt.equals("1")||tt.equals("8")) continue;
	            		if(!s.contains(tt)){
	            			b = false;
	            			break;
	            		}
	            	}
	            	
	            	if(b){
	            		count++;
	            	}
	            }
	        }
	        return count;
	    }
	  
	  public boolean isValid(int n){
		  boolean flag = false;
		  while(n>0){
			  if(n%10==2) flag = true;
			  if(n%10==5) flag = true;
			  if(n%10==6) flag = true;
			  if(n%10==9) flag = true;
			  if(n%10==3) return false;
			  if(n%10==4) return false;
			  if(n%10==7) return false;
			  n /= 10;
		  }
		  return flag;
	  }
	  
	  public static String reverseVowels(String s) {
		    if(null == s || "".equals(s)) return null;
	        List<Character> list = Arrays.asList('a','e','i','o','u');
	        int len = s.length();
	        char[] c = s.toCharArray(); 
	        int i=0;
	        int j=len-1;
	        while(i<j){
	        	if(list.contains(c[i]) && list.contains(c[j])){
	        		char tem = c[i];
	        		    c[i] = c[j];
	        		    c[j] = tem;
	        		    i++;
	        		    j--;
	        	}else if(!list.contains(c[i]) && list.contains(c[j])){
	        		i++;
	        	}else if(list.contains(c[i]) && !list.contains(c[j])){
	        		j--;
	        	}else if(!list.contains(c[i]) && !list.contains(c[j])){
	        		i++;
	        		j--;
	        	}
	        }
	        /*StringBuffer sb = new StringBuffer();
	        for(int k=0;k<len;k++){
	        	sb.append(c[k]);
	        }*/
	        //String.valueOf(c);
	        return new String(c);
	    }
	  
	  public static int[] intersectionII(int[] nums1, int[] nums2) {
		  	Arrays.sort(nums1);
	        Arrays.sort(nums2);
	        int i = 0; 
	        int j = 0;
	        int k = 0;
	        int[] res = new int[Math.min(nums1.length, nums2.length)];
	        while (i < nums1.length && j < nums2.length) {
	            if (nums1[i] == nums2[j]) {
	                res[k] = nums1[i];
	                k++;
	                i++;
	                j++;
	            } else if (nums1[i] < nums2[j]) {
	                i++;
	            } else {
	                j++;
	            }
	        }
	        return Arrays.copyOfRange(res, 0, k);
	    }
	  
	  public int countPrimeSetBits(int L, int R) {
		  boolean[] isPrime = new boolean[32];
	      int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};
	      for (int prime : primes) isPrime[prime] = true;
	      int ans = 0;
	      for (int i = L; i <= R; ++i) {
	          if (isPrime[Integer.bitCount(i)]) ans += 1;
	      }
	      return ans;
	  }
	public static String binaryToHex(int num) {
		   if (num == 0) {
		        return "0";
		    }
		    int MAX = 32;
		    boolean isNegative = false;
		    int bits[] = new int[MAX];
		    if (num < 0) {
		        isNegative = true;
		        bits[MAX - 1] = 1;
		        num = -num;
		    }

		    int i = 0;
		    // 转化为二进制的原码
		    while (num > 0) {
		        bits[i++] = num % 2;
		        num /= 2;
		    }

		    // 如果是负数，需要取反并且+1从而得到补码
		    if (isNegative) {
		        // 取反
		        for (int j = 0; j < bits.length - 1; j++) {
		            bits[j] = (bits[j] + 1) % 2;
		        }
		        // +1
		        int digit = 1;
		        int res = 0;
		        for (int j = 0; j < bits.length - 1; j++) {
		            res = bits[j] + digit;
		            bits[j] = res % 2;
		            digit = res / 2;
		        }
		    }

		    // 二进制转化为十六进制
		    String ret = "";
		    for (int j = 0; j < bits.length; j += 4) {
		        int data = 0;
		        for (int j2 = 0; j2 < 4; j2++) {
		            data += bits[j + j2] * (1 << j2);
		        }
		        ret = String.format("%x", data) + ret;
		    }

		    // 去掉字符串前面多余的0
		    for (int j = 0; j < ret.length(); j++) {
		        if (ret.charAt(j) != '0') {
		            ret = ret.substring(j);
		            break;
		        }
		    }
		System.out.println(ret);
		return ret;
	}
	
	//第二种解法就是按位与来获取。
	//既然是得到十六进制，那么每次与上0xF（二进制就是1111），得到一个值，然后数字向右移动4位，
	//这里需要注意的是数字是有符号的，刚好可以利用Java提供的无符号移动>>>
	 public static String toHex2(int num) {
	        if(num == 0) return "0";
	        char[] c = {'0', '1', '2', '3', '4', '5', '6','7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
	        StringBuilder sb = new StringBuilder();
	        while(num != 0) {
	            sb.append(c[num & 0xF]);
	            num = num >>> 4;
	        }
	        return sb.reverse().toString();
	    }
	 
	 public static int findComplement(int num) {
		    int MAX = 32;
		    int bits[] = new int[MAX];
		    int i=0;
	        while(num > 0){
	        	if((num & 1)==1){
	        		bits[i++] = 0;
	        	}else{
	        		bits[i++] = 1;
	        	}
	        	num = num >> 1;
	        }
	        int len = bits.length;
	        int data=0;
	        for(int j=0;j<len;j++){
	        	data += bits[j]*(1<<j);
	        }
	        return data;
	    }

	public boolean wordPattern(String pattern, String str) {
		if (null == pattern && null == str)
			return true;
		if (null == pattern || null == str)
			return false;
		String[] arr = str.split(" ");
		if (pattern.length() != arr.length)
			return false;
		int len = pattern.length();
		HashMap<Character, String> map = new HashMap<Character, String>();
		for (int i = 0; i < len; i++) {
			char a = pattern.charAt(i);
			String ss = map.get(a);
			if (null != ss) {
				if (ss.equals(arr[i])) {
					continue;
				} else {
					return false;
				}
			} else {
				if (map.values().contains(arr[i])) {
					return false;
				}
				map.put(a, arr[i]);
			}
		}
		return true;
	}

	public boolean isIsomorphic(String s, String t) {
		if (null == s && null == t)
			return true;
		if (null == s || null == t)
			return false;
		if (s.length() != t.length())
			return false;
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		int len = s.length();
		for (int i = 0; i < len; i++) {
			char a = s.charAt(i);
			char b = t.charAt(i);
			Character c = map.get(a);
			if (null != c) {
				if (c == b) {
					continue;
				} else {
					return false;
				}
			} else {
				if (map.values().contains(b)) {
					return false;
				}
				map.put(a, b);
			}
		}
		return true;
	}

	public boolean isSameTree(TreeNode p, TreeNode q) {
		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();
		if (null != p)
			dfsTree(p, sb);
		if (null != q)
			dfsTree(q, sb2);
		if (sb.toString().equals(sb2.toString())) {
			return true;
		}
		return false;
	}

	public void dfsTree(TreeNode tn, StringBuffer sb) {
		if (null != tn) {
			sb.append(tn.val);
			if (tn.left != null)
				dfsTree(tn.left, sb);
			if (tn.right != null)
				dfsTree(tn.right, sb);
		}
	}

	public static int guessNumber(int n) {
		int lower = 1;
		int higher = n;
		int mid = lower + (higher - lower) / 2;
		int guess = guess(mid);
		while (guess != 0) {
			if (guess < 0) {
				lower = mid + 1;
			}
			if (guess > 0) {
				higher = mid - 1;
			}
			mid = lower + (higher - lower) / 2;
			guess = guess(mid);
		}
		return mid;
	}

	private static int guess(int mid) {
		if (mid > 6) {
			return 1;
		}
		if (mid < 6) {
			return -1;
		}
		return 0;
	}

	public static int countPrimes(int n) {
		int m = (int) Math.sqrt(n);
		boolean[] bit = new boolean[n];
		bit[0] = true;
		bit[1] = true;
		for (int i = 2; i <= m; i++) {
			if (!bit[i]) {
				for (int j = 2 * i; j < n; j += i) {
					bit[j] = true;
				}
			}
		}
		int res = 0;
		for (int i = 0; i < n; i++) {
			if (!bit[i]) {
				res++;
			}
		}
		return res;
	}

	public static int getSum(int a, int b) {
		// 0010 0011 => 0001 0100 => 0101 0000
		if (a == 0)
			return b;
		int num = a ^ b;
		int c = (a & b) << 1;
		return getSum(c, num);
	}

	public String reverseString(String s) {
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		return sb.reverse().toString();
	}

	public int nthUglyNumber(int n) {
		int[] arr = new int[n];
		arr[0] = 1;
		int ugly_2 = 0;
		int ugly_3 = 0;
		int ugly_5 = 0;
		for (int i = 1; i < n; i++) {
			int tempMin = Math.min(arr[ugly_2] * 2, arr[ugly_3] * 3);
			int min = Math.min(tempMin, arr[ugly_5] * 5);
			arr[i] = min;
			if (arr[ugly_2] * 2 == min) {
				ugly_2++;
			}
			if (arr[ugly_3] * 3 == min) {
				ugly_3++;
			}
			if (arr[ugly_5] * 5 == min) {
				ugly_5++;
			}
		}
		return arr[n - 1];
	}

	/*
	 * public int nthUglyNumber(int n) { int count=1; int i=1;
	 * while(count<=1690){ if(isUgly(i)){ if(count==n) return i; count++; } i++;
	 * } return 0; }
	 * 
	 * public boolean isUgly(int i){ while(i%2==0) i /= 2; while(i%3==0) i /= 3;
	 * while(i%5==0) i /= 5; return i==1; }
	 */

	public static int firstBadVersion(int n) {
		int left = 1;
		int right = n;
		while (left < right) {
			int mid = left + (right - left) / 2;
			if (isBadVersion(mid)) {
				if (!isBadVersion(mid - 1) && isBadVersion(mid + 1)) {
					return mid;
				} else {
					right = mid - 1;
				}
			} else {
				left = mid + 1;
				if (isBadVersion(left) && isBadVersion(left + 1)) {
					return left;
				}
			}
		}
		return left;
	}

	private static boolean isBadVersion(int left) {
		if (left >= 1702766719) {// 1702766720
			return true;
		}
		return false;
	}

	public static int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);
		int len = g.length;
		int lens = s.length;
		int count = 0;
		int i = 0;
		for (int j = 0; j < lens && i < len; j++) {
			if (g[i] <= s[j]) {
				count++;
				i++;
			}
		}
		return count;
	}

	public static int arrangeCoins1(int n) {
		long start = System.currentTimeMillis();
		int i = 0;
		while (n > 0) {
			i++;
			n -= i;
		}
		long end = System.currentTimeMillis();
		System.out.println("方法一：" + (end - start));
		return n == 0 ? i : i - 1;
	}

	public static int arrangeCoins2(int n) {// n=(Math.sqrt(8s+1)-1)/2 //
											// n(n+1)/2 <= s
		return (int) ((Math.sqrt((long) 8 * n + 1) - 1) / 2);
	}

	public static String addStrings(String num1, String num2) {
		if (null == num1) {
			return num2;
		} else if (null == num2) {
			return num1;
		}
		int len1 = num1.length();
		int len2 = num2.length();
		int len = len1;
		if (len1 > len2) {
			while (len2 < len1) {
				num2 = "0" + num2;
				len2++;
			}
		}

		if (len1 < len2) {
			while (len1 < len2) {
				num1 = "0" + num1;
				len1++;
			}
			len = len2;
		}

		int carry = 0;
		StringBuilder sb = new StringBuilder();
		System.out.println(num1 + "|" + num2);
		for (int i = len - 1; i >= 0; i--) {
			int a = num1.charAt(i) - 48;
			int b = num2.charAt(i) - 48;
			int c = a + b + carry;
			sb.append(c % 10);
			if (c >= 10) {
				carry = 1;
			} else {
				carry = 0;
			}
		}

		if (carry != 0) {
			sb.append(carry);
		}

		return sb.reverse().toString();
	}
}
