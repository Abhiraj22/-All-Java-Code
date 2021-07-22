package sorting;

import java.util.Scanner;

public class Insertion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean swapped = false;
	int n = sc.nextInt();
	int arr[] = new int[n];
	for(int i=0; i<n; i++)
	{

		arr[i] = sc.nextInt();
	}

//	for(int i=1; i<n; i++)
//	{
//		
//		for(int j=0; j<i; j++)
//		{
//			if(arr[j]>arr[i])
//			{
//				int temp = arr[j];
//				arr[j] = arr[i];
//				arr[i] = temp;
//			}
//		}
//	}
	for(int i=1; i<n; i++)
	{
		int temp = arr[i];
		int j=i-1;
		while(j>=0 && arr[j]>temp)
		{
			arr[j+1] = arr[j];
			j--;
			
		}
		arr[j+1] = temp;
	}
	
	for(int i=0; i<n; i++)
	{
		System.out.print(arr[i]+" ");
	}
	}

}
