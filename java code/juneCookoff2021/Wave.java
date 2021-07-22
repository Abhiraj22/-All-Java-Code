package juneCookoff2021;
//binary Search Approach
import java.util.Arrays;
import java.util.Scanner;

public class Wave {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			int n =0;
			 if(sc.hasNextInt())
			   {
		 n = sc.nextInt();
			   }
			int q = 0;
				 if(sc.hasNextInt())
			   {
		 q = sc.nextInt();
			   }
			int a[] = new int[n];
			for(int i=0; i<n; i++)
			{
				a[i] = sc.nextInt();
			}
			Arrays.sort(a);
			
			while(q-->0)
			{
				int x =0;
				if(sc.hasNextInt()) {
					 x = sc.nextInt();
				}
			
				
				
				int res = Search(a,n,x);
			 System.out.println(res);
				if(res==-1)
				{
					System.out.println(0);
				}
				else if((res &1)==1)
{
	System.out.println("NEGATIVE");
}
				else if((res&1)==0){
					System.out.println("POSITIVE");
				}
			}
			 
	}
public static int Search(int a[], int n,int x)
{
	int low =0;
	int high = n-1;
	int count =0;

	while(low<=high)
	{
		int mid = (low+high)/2;
		if(a[mid]==x)
		{
			count =-1;
			break;
		}
		else if(a[mid]<x)
		{
			count += mid-low+1;
			low = mid+1;
			
		}
		else {
			high = mid-1;
		}
	}
	return count;
}
	}