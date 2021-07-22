package juneCookoff2021;
import java.util.*;
public class XORFolding {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=0;
		 if(sc.hasNextInt())
		   {
	 t = sc.nextInt();
		   }
		 while(t-->0) {
int n = sc.nextInt();
int m = sc.nextInt();
String a[][] = new String[n][m];
int count=0;
for(int i=0; i<n; i++)
{
	for(int j=0;j<m; j++)
	{
		if(sc.nextLine()=="1") {
			count++;
		}
		
		
	}
}
if((count & 1)==1)
{
	System.out.println("YES");
}
else {
	System.out.println("NO");
}
	}
	}
}
