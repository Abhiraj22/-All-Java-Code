package graphjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.*;
class Node{
	int first;
	int second;
	public Node(int first,int second)
	{
		this.first=first;
		this.second=second;
	}
}

public class CycleDetectionUsingBfs {

	public static void main(String[] args) {
		int n=11;
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
//		
//		edge 2 4
		adj.get(2).add(4);
		adj.get(4).add(2);
		
//		
//		edge 8 7
		adj.get(8).add(7);
		adj.get(7).add(8);
		
//	edge 8 9
		adj.get(9).add(8);
		adj.get(8).add(9);


//edge 8 11
		adj.get(11).add(8);
		adj.get(8).add(11);
		
//		edge 3 5
		adj.get(3).add(5);
		adj.get(5).add(3);
		
//		edge 6 7
		adj.get(6).add(7);
		adj.get(7).add(6);
		
//		edge 5 6
		adj.get(5).add(6);
		adj.get(6).add(5);
//	edge 10 5	
		adj.get(5).add(10);
		adj.get(10).add(5);
	
//	edge 9 10	
		adj.get(10).add(9);
		adj.get(9).add(10);
		
		
		
System.out.println(isCycle(n, adj));



	}
	public static boolean isCycle(int v, ArrayList<ArrayList<Integer>> adj)
	{
		boolean vis[] = new boolean[v+1];
		Arrays.fill(vis, false);
		for(int i=1; i<=v; i++)
		{
			if(vis[i]==false)
			{
				if(CycleFind(i,vis,adj))
				{
					return true;
				}
				
			}
		}
		return false;
			
	}
	public static boolean CycleFind(int s, boolean vis[], ArrayList<ArrayList<Integer>> adj)
	{
		Queue<Node> q = new LinkedList<>();
		q.add(new Node(s,-1));
		vis[s] = true;
		while(!q.isEmpty())
		{
			int node=q.peek().first;
			int parent = q.peek().second;
			q.remove();
			for(Integer it:adj.get(node))
			{
				if(vis[it]==false)
				{
					q.add(new Node(it,node));
					vis[it] = true;
					
				}
				else if(parent!=it)
				{
					return true;
				}
			}
			
		}
	return false;
		
	}

}

