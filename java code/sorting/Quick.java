package sorting;

import java.util.Scanner;

public class Quick {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++)
		{

			a[i] = sc.nextInt();
		}
		int l=0;
		int h = n-1;

		QuickSort( l, h,a);
		Print(a,n);
}
	public static void QuickSort(int l,int h,int a[])
	{
		if(l<h) {
int pivot=	Partition(l,h,a);
QuickSort(l,pivot-1,a);
QuickSort(pivot+1,h,a);
		}
		

	}
	
	public static int Partition(int l, int h,int arr[])
	{
		int pivot = arr[l];
		int i=l;
		int j=h;
		while(i<j)
		{
			while(arr[i]<=pivot) i++;
			while(arr[j]>pivot) j--;
			if(i<j)
			{
				int temp=arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[j];
		arr[j] = arr[l];
		arr[l] = temp;
		return j;
		
	}	
	
	public static void Print(int a[],int n)
	{
		for(int i=0; i<n; i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
