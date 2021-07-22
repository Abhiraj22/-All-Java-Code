package graphjava;

import java.util.ArrayList;
import java.util.Arrays;

class CycleDetectionDirectedGraph {

	public static void main(String[] args) {
		int n=9;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for(int i=0; i<=n; i++)
		{
			adj.add(new ArrayList<Integer>());
		}
		

		adj.get(1).add(2);

		

		adj.get(2).add(3);

		

		
		adj.get(7).add(2);
		adj.get(7).add(8);
		adj.get(8).add(9);
//		
		adj.get(9).add(7);
		

		adj.get(3).add(4);
		adj.get(3).add(6);
		

		adj.get(6).add(5);
		

		adj.get(4).add(5);
		
		
System.out.println(isCycle(n, adj));


	}
	public static boolean isCycle(int v,ArrayList<ArrayList<Integer>> adj)
	{
		int vis[] = new int[v+1];
		int dfsVis[] = new int[v+1];
		
		
		for(int i=1; i<=v; i++)
		{
			if(vis[i]==0)
			{
				if(checkForCycle(i,dfsVis,vis,adj))
				{
					return true;
				}
			}
		}
		return false;
	}
	public static boolean checkForCycle(int node,int dfsVis[],int vis[], ArrayList<ArrayList<Integer>> adj)
	{
		vis[node] = 1;
		dfsVis[node]=1;
		for(Integer it:adj.get(node))
		{
			if(vis[it]==0)
			{
				if(checkForCycle(it,dfsVis,vis,adj)==true)
				{
					return true;
				}
			}
			else if(dfsVis[it]==1)
			{
				return true;
			}
		}
		dfsVis[node]=0;
		return false;
	}
	
}
