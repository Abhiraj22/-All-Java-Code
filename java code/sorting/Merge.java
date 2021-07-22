package sorting;

import java.util.Scanner;

public class Merge {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++)
		{

			a[i] = sc.nextInt();
		}
		mergeSort(a,0,n-1);
		Print(a,n);
	}
public static void mergeSort(int a[], int l, int r)
{
	if(l<r)
	{
		int mid = (l+r)/2;
		mergeSort(a,l,mid);
		mergeSort(a,mid+1,r);
		merge(a,l,mid,r);
	}
}
public static int[] merge(int a[], int l,int mid,int r)
{
	int b[] = new int[r+1];
	int i=l;
	int j=mid+1;
	int k=l;
	while(i<=mid && j<=r)
	{
		if(a[i]<a[j]) {
			b[k++] = a[i++];
		}
		else {
			b[k++] = a[j++];
		}
	}
	if(i>mid)
	{
		while(j<=r)
		{
			b[k++] = a[j++];
		}
	}
	else {
		while(i<=mid)
		{
			b[k++] = a[i++];
		}
	}
	for(k=l; k<=r; k++)
	{
		a[k] = b[k];
	}
	return a;
}
public static void Print(int a[], int n)
{
	for(int i=0; i<n; i++)
	{
		System.out.print(a[i]+" ");
	}
}
}
