package graphjava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CycleDetectionDirectedUsingKahnsBfs {

	public static void main(String[] args) {
		int n=6;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for(int i=0; i<n; i++)
		{
			adj.add(new ArrayList<Integer>());
		}
		adj.get(5).add(2);
		adj.get(5).add(0);
		adj.get(2).add(3);
		adj.get(3).add(1);
		adj.get(4).add(1);
		adj.get(4).add(0);
		
		if(Kahns(n,adj))
		{
			System.out.println("Cyclic");
		}
		else {
			System.out.println("Not a Cyclic");
		}


	}
	public static boolean Kahns(int n, ArrayList<ArrayList<Integer>> adj)
	{
		int topo[] = new int[n];
		int indeg [] = new int[n];
		for(int i=0; i<n; i++)
		{
			for(Integer it: adj.get(i))
			{
				indeg[it]++;
			}
		}
		Queue<Integer> q = new LinkedList<>();
		for(int i=0; i<n; i++)
		{
			if(indeg[i] ==0)
			{
				q.add(i);
			}
		}
		int count =0;
		while(!q.isEmpty())
		{
			int node = q.poll();
			count++;
//			topo[ind++] = node;
			for(Integer it:adj.get(node))
			{
				indeg[it]--;
				if(indeg[it]==0)
				{
					q.add(it);
				}
			}
		}
		if(count ==n)
		{
			return false;
		}
		return true;
//		for(Integer i:topo)
//		{
//			System.out.print(i+" ");
//		}
//		System.out.println(); 
	}

}
