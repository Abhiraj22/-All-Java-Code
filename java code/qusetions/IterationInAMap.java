package qusetions;
import java.io.*;
import java.util.TreeMap;
import java.util.*;

public class IterationInAMap {

	public static void main(String[] args) {
		String arr[] = {"aaa", "bbb", "ccc", "bbb", "aaa", "aaa"};
		int N = arr.length;
		TreeMap<String,Integer> h = new TreeMap<>();
	       for(int i=0; i<N; i++)
	       {
	           if(!h.containsKey(arr[i])){
	           h.put(arr[i],1);
	           }
	           else{
	               h.put(arr[i],h.get(arr[i])+1);
	           }
	       }
	    //   Set<Entry<String,Integer>>ent=h.entrySet();
	      String max ="";
	      int max1=0;
	      for(Integer i:h.values())
	      {
	          max1 = Math.max(max1,i);
	      }
	      int max2=0;
	      for(Integer i:h.values())
	      {
	          if(i>max2 && i<max1)
	          {
	              max2 = Math.max(max2,i);
	          }
	      }
	       
	       for(Map.Entry x:h.entrySet())
	       {
	          if(max2==(int)x.getValue())
	          {
	              max = (String)x.getKey();
	              break;
	          }
	         
	       }
	  System.out.println(max);

	}

}
