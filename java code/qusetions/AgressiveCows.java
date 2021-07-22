package qusetions;
import java.util.*;
public class AgressiveCows {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int c= sc.nextInt();
			int a[] = new int[n];
			for(int i=0; i<n; i++)
			{
				a[i]= sc.nextInt();
			}
			Arrays.sort(a);
			int low=1;
			 int high = a[n-1]-a[0];
			 int res =0;
			 while(low<=high)
			 {
				 int mid = (low+high)>>1;
				 if(canPlaceCow(mid,a,n,c))
				 {
					 res = mid;
					 low=mid+1;
					 
				 }
				 else {
					 high = mid-1;
				 }
			 }
			 System.out.println(res);
		}

	}
	public static boolean canPlaceCow(int mid,int a[],int n, int c)
	{
		int cord = a[0];
		
		int count=1;
		for(int i=1; i<n; i++)
		{
			if(a[i]-cord >=mid)
			{
				count++;
				cord=a[i];
			}
			
		}
		if(count>=c)
		{
			return true;
		}
		return false;
	}

}
