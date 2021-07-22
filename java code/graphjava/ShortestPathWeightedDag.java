package graphjava;
import java.util.*;
public class ShortestPathWeightedDag {

	public static void main(String[] args) {
		int n =6;
		ArrayList<ArrayList<Pair>> adj = new ArrayList<ArrayList<Pair>>();
		for(int i=0; i<n; i++)
		{
			adj.add(new ArrayList<Pair>());
		}
		adj.get(0).add(new Pair(1,2));
		adj.get(0).add(new Pair(4,1));
		adj.get(1).add(new Pair(2,3));
		adj.get(2).add(new Pair(3,6));
		adj.get(4).add(new Pair(2,2));
		adj.get(4).add(new Pair(5,4));
		adj.get(5).add(new Pair(3,1));
		ShortestPathWeightedDag obj = new ShortestPathWeightedDag();
		obj.shortest(0,adj,n);
		

	}
	public static void shortest(int src,ArrayList<ArrayList<Pair>> adj,int n )
	{
		Stack <Integer> s = new Stack<>();
		int dist[] = new int[n];
		boolean vis[] = new boolean[n];
		for(int i=0; i<n; i++)
		{
			vis[i] = false;
		}
		for(int i=0; i<n; i++)
		{
			if(vis[i] == false)
			{
				topo(i,vis,s,adj);
			}
		}
		for(int i=0; i<n; i++)
		{
			dist[i] = Integer.MAX_VALUE;
		}
		dist[src] =0;
		while(!s.isEmpty())
		{
			int node=s.pop();
			if(dist[node] !=Integer.MAX_VALUE)
			{
				for(Pair it:adj.get(node)) {
					if(dist[node]+it.getWeight()<dist[it.getV()]) {
						dist[it.getV()]= dist[node]+it.getWeight();
					}
				}
			}
		}
		for(int i=0; i<n; i++)
		{
			if(dist[i] == Integer.MAX_VALUE)
			{
				System.out.print("not reachable");
			}
			else {
				System.out.print(dist[i]+" ");
			}
		}
	}
	public static void topo(int node, boolean vis[], Stack s,ArrayList<ArrayList<Pair>> adj)
	{
		vis[node] = true;
		for(Pair it:adj.get(node))
		{
			if(vis[it.getV()]==false)
			{
				topo(it.getV(),vis,s,adj);
			}
		}
		s.add(node);
	}

}
class Pair{
	private int v;
	private int weight;
	Pair(int _v,int _w)
	{
		v=_v;
		weight=_w;
		
	}
	int getV(){
		return v;
	}
	int getWeight()
	{
		return weight;
	}
}