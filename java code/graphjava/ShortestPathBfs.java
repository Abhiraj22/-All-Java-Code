package graphjava;

import java.util.*;

public class ShortestPathBfs {

	public static void main(String[] args) {
		int n=9;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for(int i=0; i<n; i++)
		{
			adj.add(new ArrayList<Integer>());
		}
		int src =0;
		adj.get(0).add(1);
		adj.get(1).add(0);
		adj.get(0).add(3);
		adj.get(3).add(0);
		adj.get(1).add(2);
		adj.get(2).add(1);
		adj.get(1).add(3);
		adj.get(3).add(1);
		adj.get(3).add(4);
		adj.get(4).add(3);
		adj.get(4).add(5);
		adj.get(5).add(4);
		adj.get(5).add(6);
		adj.get(6).add(5);
		adj.get(6).add(2);
		adj.get(2).add(6);
		adj.get(6).add(7);
		adj.get(7).add(6);
		adj.get(6).add(8);
		adj.get(8).add(6);
		adj.get(7).add(8);
		adj.get(8).add(7);
		dis(adj,n,src);
		
		

	}
	public static void dis(ArrayList<ArrayList<Integer>> adj, int n, int src)
	{
		int dist[] = new int[n];
		for(int i=0; i<n; i++)
		{
			dist[i] = Integer.MAX_VALUE;
		}
		Queue<Integer>q = new LinkedList<>();
		dist[src]=0;
		q.add(src);
		while(!q.isEmpty())
		{
			int node = q.poll();
			for(Integer it:adj.get(node))
			{
				if(dist[node]+1<dist[it])
				{
					dist[it] = dist[node]+1;
					q.add(it);
				}
			}
		}
		for(Integer it:dist)
		{
			System.out.print(it+" ");
		}
		
	}

}
