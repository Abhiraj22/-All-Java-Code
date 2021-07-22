package graphjava;

import java.util.ArrayList;

public class dfs {

	public static void main(String[] args) {
		int n=7;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for(int i=0; i<=n; i++)
		{
			adj.add(new ArrayList<Integer>());
		}
		
//		edge 1 2
		adj.get(1).add(2);
		adj.get(2).add(1);
		
//edge 2 3
		adj.get(2).add(3);
		adj.get(3).add(2);
		
//		edge 2 7
		adj.get(2).add(7);
		adj.get(7).add(2);
		
//		edge 3 5
		adj.get(3).add(5);
		adj.get(5).add(3);
		
//		edge 5 7
		adj.get(5).add(7);
		adj.get(7).add(5);
		
//		edge 4 6
		adj.get(4).add(6);
		adj.get(6).add(4);
		
		
		
System.out.println(dfsOfGraph(n, adj));



	}
	public static  void dfs1(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj , ArrayList<Integer> storeDfs)
	{
		storeDfs.add(node);
		vis[node] = true;
		for(Integer it:adj.get(node))
		{
			if(vis[it]== false)
			{
				dfs1(it,vis,adj,storeDfs);
			}
		}
		
	}
	public static ArrayList<Integer> dfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj){
		ArrayList<Integer> storeDfs = new ArrayList<>();
		boolean vis[] = new boolean[v+1];
		for(int i=1; i<=v; i++)
		{
			if(vis[i] == false)
			{
				dfs1(i,vis,adj,storeDfs);
			}
		}
		return storeDfs;
		
	}
}
