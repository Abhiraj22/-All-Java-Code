package qusetions;
import java.io.*;
import java.util.Arrays;
import java.util.HashMap;

//link to ques -->
//https://www.geeksforgeeks.org/function-to-find-number-of-customers-who-could-not-get-a-computer/
public class Fiberlink {

	public static void main(String[] args) {
		System.out.println(runCustomerSimulation(2, "ABBAJJKZKZ")); 
	    System.out.println(runCustomerSimulation(3, "GACCBDDBAGEE")); 
	    System.out.println(runCustomerSimulation(3, "GACCBGDDBAEE")); 
	    System.out.println(runCustomerSimulation(1, "ABCBCA")); 
	    System.out.println(runCustomerSimulation(1, "ABCBCADEED")); 
	}
public static int runCustomerSimulation(int t, String str) {
	
	
	
	
//	HashMap Approach -->
	
//	HashMap<Character,Integer> map = new HashMap<>();
//int ch1[] = new int[26];
//Arrays.fill(ch1, 0);
//int count =0;
//
//	for(int i=0; i<str.length(); i++) {
//	
//		char ch = str.charAt(i);
//		if(map.containsKey(ch) && map.size()<=t ) {
//		map.remove(ch);
//
//		}
//		else if((map.isEmpty() || !map.containsKey(ch)) && map.size()<t){
//			map.put(ch, 1);
//
//			
//		}
//		else {
//			if(ch1[ch-'A']==0) {
//			ch1[ch-'A']=1;
//			count++;
//		}
//		}
//			}
//	
//	System.out.println(count);
	
//	-->
	
	
//	Optimized Approach ---->
//	T.C --> O(n) and S.C --> O(26)
	int n = str.length();
	int res =0;
	int occu =0;
	int a[] = new int[26];
	for(int i=0; i<n; i++)
	{
		char ch = str.charAt(i);
		int index = ch-'A';
		if(a[index]==0) {
			a[index]=1;
			if(occu<t) {
				a[index]=2;
				occu++;
			}
			else {
				res++;
			}
		}
		else {
			if(a[index]==2) {
				a[index]=0;
				occu--;
			}
		}
	}
return res;
	
	
	
	}

	}


