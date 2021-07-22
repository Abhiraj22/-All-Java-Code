package graphjava;

public class GraphUsing2dArray {

	public static void main(String[] args) {
		int  n =3, m=3;
		int adj[][] = new int[n+1][m+1];
//		edge btw 1 2
		adj[1][2] = 1;
		adj[2][1] = 1;
		
//		edge btw 2 3
		adj[2][3] = 1;
		adj[3][2] = 1;
		
//		edge btw 1 3 
		adj[1][3] = 1;
		adj[3][1] = 1;
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=m; j++)
			{
				System.out.print(adj[i][j]+ " ");
			}
			System.out.println();
		}
		}

}
