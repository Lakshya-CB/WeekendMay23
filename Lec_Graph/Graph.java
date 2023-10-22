package Lec_Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Graph {
//HashMap<V1,Nbrs> HM
//	HashMap<V1,HashMap<V2,Wt(Edge V1 to V2)>> HM
	HashMap<Integer, HashMap<Integer, Integer>> HM;

	public Graph(int totalV) {
		// TODO Auto-generated constructor stub
		HM = new HashMap<>();
		for (int V = 1; V <= totalV; V++) {
			HM.put(V, new HashMap<>());
		}
	}

	public void register(int V) {
		if (HM.containsKey(V)) {
			throw new RuntimeException("Kya kar rha hain ?");
		}
		HM.put(V, new HashMap());

	}

	public void addEdge(int V1, int V2, int Wt) {
		HashMap<Integer, Integer> V1_Nbrs = HM.get(V1);
		V1_Nbrs.put(V2, Wt);

		HashMap<Integer, Integer> V2_Nbrs = HM.get(V2);
		V2_Nbrs.put(V1, Wt);
	}

	public int getEdge(int V1, int V2) {
		return HM.get(V1).get(V2);
	}

	public boolean hasPath(int src, int dest) {
		return hasPath(src, dest, "", new HashSet());
	}

	private boolean hasPath(int curr, int dest, String path, HashSet<Integer> Visited) {
		if (curr == dest) {
			System.out.println(path);
			return true;
		}
		if (Visited.contains(curr)) {
			return false;
		}

		Visited.add(curr);
		boolean ans = false;
		for (int nbr : HM.get(curr).keySet()) {
			boolean sp = hasPath(nbr, dest, path + curr, Visited);
			ans = ans | sp;
		}
		Visited.remove(curr);
		return ans;
	}

	public void BFS(int src) {
		Queue<Integer> Q = new LinkedList<>();
		Q.add(src);
		HashSet<Integer> Visited = new HashSet<>();
		while (!Q.isEmpty()) {
			int curr = Q.poll();
			if (Visited.contains(curr)) {
				System.out.println("cycle!!");
				continue;
			}
			Visited.add(curr);
			for (int nbr : HM.get(curr).keySet()) {
				if (!Visited.contains(nbr)) {
					Q.add(nbr);
				}
			}
		}
	}

	public void BFT() {
//		find number of components 
		HashSet<Integer> Visited = new HashSet<>();
		int numOfComponents = 0;
		for (int src : HM.keySet()) {
			if (Visited.contains(src)) {
				continue;
			}
			numOfComponents++;
			Queue<Integer> Q = new LinkedList<>();
			Q.add(src);
			while (!Q.isEmpty()) {
				int curr = Q.poll();
				if (Visited.contains(curr)) {
					System.out.println("cycle!!");
					continue;
				}
				Visited.add(curr);
				for (int nbr : HM.get(curr).keySet()) {
					if (!Visited.contains(nbr)) {
						Q.add(nbr);
					}
				}
			}

		}
		System.out.println(numOfComponents);
	}
//	Single Source Shortest Path Algos
	class Dijpair implements Comparable<Dijpair>{
		public Dijpair(int src, int i) {
			// TODO Auto-generated constructor stub
			V = src;
			Wt = i;
		}
		int V;
		int Wt;
		@Override
		public int compareTo(Dijpair o) {
			// TODO Auto-generated method stub
//			A.compareTo(B)=> A-B;
//			this - o
			return this.Wt - o.Wt;
		}
	}
	public void Dijkstra(int src) {
		PriorityQueue<Dijpair> PQ = new PriorityQueue<>();
		PQ.add(new Dijpair(src,0));
		HashSet<Integer> Visited = new HashSet<>();
		while(!PQ.isEmpty()) {
			Dijpair curr = PQ.poll();
			if(Visited.contains(curr.V)) {
				continue;
			}
			System.out.println(
					src+ " to "+ curr.V + " with Wt => "+curr.Wt);
			Visited.add(curr.V);
			for(int nbr : HM.get(curr.V).keySet()) {
				if(!Visited.contains(nbr)) {
					PQ.add(new Dijpair(nbr,curr.Wt+ getEdge(curr.V, nbr)));
				
				}
			}
		}
	}

}
