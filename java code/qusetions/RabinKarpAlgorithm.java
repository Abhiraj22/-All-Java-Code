package qusetions;
import java.util.*;
public class RabinKarpAlgorithm {
	 public final static int d = 256;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		  String txt = "GEEKS FOR GEEKS";
	        String pat = "GEEK";
	        int q =101;
	        serach(txt,pat,q);
	}
public static	void serach(String txt,String pat, int q) {
	        int M = pat.length();
	        int N = txt.length();
	        int i,j;
	        int p=0;
	        int t=0;
	        int h = 1;
//	        int d =256;
	        for( i=0; i<M-1; i++)
	        {
	        	h = (h*d)%q;
	        	
	        }
	        for( i=0; i<M; i++)
	        {

	            p = (d*p + pat.charAt(i))%q;
	            t = (d*t + txt.charAt(i))%q;
	        	
	        	
	        }
	        for(i=0; i<=N-M; i++)
	        {
	        	if(p==t)
	        	{
	        		for(j=0; j<M; j++)
	        		{
	        			if(txt.charAt(i+j)!=pat.charAt(j))
	        			{
	        				break;
	        			}
	        		}
	        		if(j==M)
	        		{
	        			System.out.println("Pattern found at "+i);
	        		}
	        	}
	        	if(i<N-M)
	        	{
	        		 t = (d*(t - txt.charAt(i)*h) + txt.charAt(i+M))%q;
	        		  if (t < 0)
	                      t = (t + q);
	        	}
	        }
	}

}
