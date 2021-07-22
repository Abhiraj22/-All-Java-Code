package sorting;
import java.util.*;
import java.io.*;
public class Bubble {

	public static void main(String[] args)throws IOException {
//	BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		boolean swapped = false;
	int n = sc.nextInt();
	int arr[] = new int[n];
	for(int i=0; i<n; i++)
	{
//		arr[i] = Integer.parseInt(br.readLine());
		arr[i] = sc.nextInt();
	}
	for(int i=0; i<n-1; i++)
	{
		for(int j=0; j<n-1-i; j++)
		{
			if(arr[j]>arr[j+1])
			{
				int temp = arr[j];
				arr[j] =arr[j+1];
				arr[j+1] = temp;
				swapped = true;
			}
		}
		if(!swapped)
		{
			break;
		}
	}
for(int i=0; i<n; i++)
{
	System.out.print(arr[i]+" ");
}
	}

}
