package graphjava;
import java.util.*;
public class TopologicalSorting {
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
		
		topoSort(n,adj);
}
	
public static void topoSort(int n, ArrayList<ArrayList<Integer>> adj)
	{
		Stack<Integer> st = new Stack<>();
		int vis[] = new int[n];
		for(int i=0; i<n; i++)
		{
			if(vis[i]==0)
			{
				findTopoSort(i,vis,adj,st);
			}
		}
//		int topo[]= new int[n];
//		int i=0;
		while(!st.isEmpty())
		{
			System.out.print(st.pop()+" ");
		}
		System.out.println();
//		return topo;
	}
	static void findTopoSort(int node,int vis[],ArrayList<ArrayList<Integer>> adj,Stack<Integer> st)
	{
		vis[node]=1;
		for(Integer it:adj.get(node))
		{
			if(vis[it] ==0)
			{
				findTopoSort(it,vis,adj,st);
			}
		}
		st.push(node);
	}

}
