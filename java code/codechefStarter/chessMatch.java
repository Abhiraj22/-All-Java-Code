package codechefStarter;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;

public class chessMatch {

	public static void main(String[] args)throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int n =0;
		int q=0;
		 if(sc.hasNextInt())
		   {
	 n = sc.nextInt();
		   }
		 if(sc.hasNextInt())
		   {
	 q= sc.nextInt();
		   }
int a[] = new int[n];
for(int i=0; i<n; i++)
{
	a[i] = sc.nextInt();
}
while(q-->0)
{
	if(sc.nextInt()==1)
	{
		int l = sc.nextInt();
		int r = sc.nextInt();
		int x = sc.nextInt();
		for(int i=l-1; i<r; i++)
		{
			int v = (x+i-l);
			a[i]+=(v*v);
		}
	}
	else {
		int y = sc.nextInt();
		System.out.println(a[y-1]);
	}
}
	}

}
