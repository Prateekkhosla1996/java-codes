package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Graph {
	private class Vertex{
		HashMap<String, Integer> nbrs=new HashMap<String, Integer>();
	}
	HashMap<String, Vertex> vtces;
	public Graph() {
		vtces=new HashMap<String, Graph.Vertex>();
	}
	public int numVertex() {
		return this.vtces.size();
	}
	public boolean containsVertex(String vname) {
		return this.vtces.containsKey(vname);
	}
	public void addVertex(String vname) {
		Vertex vtx=new Vertex();
		vtces.put(vname, vtx);
	}
	public void removeVertex(String vname) {
		Vertex vtx=vtces.get(vname);
		ArrayList<String> keys=new ArrayList<String>(vtx.nbrs.keySet());
		for(String key:keys) {
			Vertex nbrVtx=vtces.get(key);
			nbrVtx.nbrs.remove(vname);
		}
		vtces.remove(vname);
	}
	public int numEdges() {
		int count=0;
		ArrayList<String> keys=new ArrayList<>(vtces.keySet());
		for(String key:keys) {
			Vertex vtx=vtces.get(key);
			count=count+vtx.nbrs.size();
		}
		return count/2;
	}
	public boolean containsEdges(String vname1,String vname2) {
		Vertex vtx1=vtces.get(vname1);
		Vertex vtx2=vtces.get(vname2);
		if(vtx1==null||vtx2==null||!vtx1.nbrs.containsKey(vname2)) {
			return false;
		}
		return true;
	}
	public void addEdges(String vname1,String vname2, int cost) {
		Vertex vtx1=vtces.get(vname1);
		Vertex vtx2=vtces.get(vname2);
		if(vtx1==null||vtx2==null||vtx1.nbrs.containsKey(vname2)) {
			return;
		}
		vtx1.nbrs.put(vname2, cost);
		vtx2.nbrs.put(vname1, cost);
	}
	public void removeEdges(String vname1,String vname2) {
		Vertex vtx1=vtces.get(vname1);
		Vertex vtx2=vtces.get(vname2);
		if(vtx1==null||vtx2==null||!vtx1.nbrs.containsKey(vname2)) {
			return;
		}
		vtx1.nbrs.remove(vname2);
		vtx2.nbrs.remove(vname1);
	}
	public void display() {
		ArrayList<String> keys=new ArrayList<String>(vtces.keySet());
		for(String key:keys) {
			Vertex vtx=vtces.get(key);
			System.out.println(key+" : "+vtx.nbrs);
		}
		
	}
	
	public boolean hasPath(String vname1,String vname2,HashMap<String, Boolean> processed) {
		processed.put(vname1, true);
		if(containsEdges(vname1, vname2)) {
			return true;
		}
		Vertex vtx=vtces.get(vname1);
		ArrayList<String> nbrs=new ArrayList<String>(vtx.nbrs.keySet());
		
		for(String nbr:nbrs) {
			if(!processed.containsKey(nbr)&&hasPath(nbr, vname2,processed)) {
				return true;
			}
		}
		return false;
	}
	
	private class Pair{
		String vname;
		String psf;
	}
	public boolean bfs(String src,String dst) {
		HashMap<String, Boolean> processed=new HashMap<String, Boolean>();
		LinkedList<Pair> queue=new LinkedList<Graph.Pair>();
		Pair sp=new Pair();
		sp.vname=src;
		sp.psf=src;
		queue.addLast(sp);
		while(!queue.isEmpty()) {
			Pair rp=queue.removeFirst();
			if(processed.containsKey(rp.vname)) {
				System.out.println(rp.psf+dst);
				continue;
			}
			processed.put(rp.vname, true);
			if(containsEdges(rp.vname, dst)) {
				return true;
			}
			Vertex rpvtx=vtces.get(rp.vname);
			ArrayList<String >nbrs=new ArrayList<String>(rpvtx.nbrs.keySet());
			for(String nbr:nbrs) {
				if(!processed.containsKey(nbr)) {
					Pair np=new Pair();
					np.vname=nbr;
					np.psf=rp.psf+nbr;
					queue.addLast(np);
					}
			}
		}
		return false;
	}
	public boolean dfs(String src,String dst) {
		HashMap<String, Boolean> processed=new HashMap<String, Boolean>();
		LinkedList<Pair> stack=new LinkedList<Graph.Pair>();
		Pair sp=new Pair();
		sp.vname=src;
		sp.psf=src;
		stack.addFirst(sp);
		while(!stack.isEmpty()) {
			Pair rp=stack.removeFirst();
			if(processed.containsKey(rp.vname)) {
				
				continue;
			}
			processed.put(rp.vname, true);
			if(containsEdges(rp.vname, dst)) {
				System.out.println(rp.psf+dst);
				return true;
			}
			Vertex rpvtx=vtces.get(rp.vname);
			ArrayList<String >nbrs=new ArrayList<String>(rpvtx.nbrs.keySet());
			for(String nbr:nbrs) {
				if(!processed.containsKey(nbr)) {
					Pair np=new Pair();
					np.vname=nbr;
					np.psf=rp.psf+nbr;
					stack.addFirst(np);
					}
			}
		}
		return false;
	}
	
	public void bft() {
		HashMap<String, Boolean> processed=new HashMap<String, Boolean>();
		LinkedList<Pair> queue=new LinkedList<Graph.Pair>();
		ArrayList<String> keys=new ArrayList<String>(vtces.keySet());
		for(String key: keys) {
			if(processed.containsKey(key)) {
				continue;
			}
		Pair sp=new Pair();
		sp.vname=key;
		sp.psf=key;
		queue.addLast(sp);
		while(!queue.isEmpty()) {
			Pair rp=queue.removeFirst();
			if(processed.containsKey(rp.vname)) {
				
				continue;
			}
			processed.put(rp.vname, true);
			System.out.println(rp.vname+" "+rp.psf);
			
			Vertex rpvtx=vtces.get(rp.vname);
			ArrayList<String >nbrs=new ArrayList<String>(rpvtx.nbrs.keySet());
			for(String nbr:nbrs) {
				if(!processed.containsKey(nbr)) {
					Pair np=new Pair();
					np.vname=nbr;
					np.psf=rp.psf+nbr;
					queue.addLast(np);
					}
			}
		}
		
	}
	}
	public void dft() {
		HashMap<String, Boolean> processed=new HashMap<String, Boolean>();
		LinkedList<Pair> stack=new LinkedList<Graph.Pair>();
		ArrayList<String> keys=new ArrayList<String>(vtces.keySet());
		for(String key: keys) {
			if(processed.containsKey(key)) {
				continue;
			}
		Pair sp=new Pair();
		sp.vname=key;
		sp.psf=key;
		stack.addFirst(sp);
		while(!stack.isEmpty()) {
			Pair rp=stack.removeFirst();
			if(processed.containsKey(rp.vname)) {
				
				continue;
			}
			processed.put(rp.vname, true);
			System.out.println(rp.vname+" "+rp.psf);
			
			Vertex rpvtx=vtces.get(rp.vname);
			ArrayList<String >nbrs=new ArrayList<String>(rpvtx.nbrs.keySet());
			for(String nbr:nbrs) {
				if(!processed.containsKey(nbr)) {
					Pair np=new Pair();
					np.vname=nbr;
					np.psf=rp.psf+nbr;
					stack.addFirst(np);
					}
			}
		}
		
	}
	}
	public boolean isCyclic() {
		HashMap<String, Boolean> processed=new HashMap<String, Boolean>();
		LinkedList<Pair> queue=new LinkedList<Graph.Pair>();
		ArrayList<String> keys=new ArrayList<String>(vtces.keySet());
		for(String key: keys) {
			if(processed.containsKey(key)) {
				continue;
			}
		Pair sp=new Pair();
		sp.vname=key;
		sp.psf=key;
		queue.addLast(sp);
		while(!queue.isEmpty()) {
			Pair rp=queue.removeFirst();
			if(processed.containsKey(rp.vname)) {
				
				return true;
			}
			processed.put(rp.vname, true);
			
			Vertex rpvtx=vtces.get(rp.vname);
			ArrayList<String >nbrs=new ArrayList<String>(rpvtx.nbrs.keySet());
			for(String nbr:nbrs) {
				if(!processed.containsKey(nbr)) {
					Pair np=new Pair();
					np.vname=nbr;
					np.psf=rp.psf+nbr;
					queue.addLast(np);
					}
			}
		}
		
	}
		return false;
	}
	
	public boolean isConnected() {
		int flag=0;
		HashMap<String, Boolean> processed=new HashMap<String, Boolean>();
		LinkedList<Pair> queue=new LinkedList<Graph.Pair>();
		ArrayList<String> keys=new ArrayList<String>(vtces.keySet());
		for(String key: keys) {
			if(processed.containsKey(key)) {
				continue;
			}
			flag++;
		Pair sp=new Pair();
		sp.vname=key;
		sp.psf=key;
		queue.addLast(sp);
		while(!queue.isEmpty()) {
			Pair rp=queue.removeFirst();
			if(processed.containsKey(rp.vname)) {
				
				continue;
			}
			processed.put(rp.vname, true);
			
			Vertex rpvtx=vtces.get(rp.vname);
			ArrayList<String >nbrs=new ArrayList<String>(rpvtx.nbrs.keySet());
			for(String nbr:nbrs) {
				if(!processed.containsKey(nbr)) {
					Pair np=new Pair();
					np.vname=nbr;
					np.psf=rp.psf+nbr;
					queue.addLast(np);
					}
			}
		}
		
	}
		if(flag>=2) {
			return false; 
		}
		return true;
	}
	
	public boolean isTree() {
		return !isCyclic()&& isConnected();
	}
}
