/**
 * 
 * https://www.youtube.com/watch?v=1057z9XTfcs
 * https://www.youtube.com/watch?v=WOCV2UcxNrI
 * 
 * single source shortest path problem (directed, and undirected graph)
 * dijkstra doesn't consider negative paths
 * 
 * shortest path -> minimization problem -> optimization problem -> GREEDY METHOD
 * 
 * greedy method: the problem should be solved in stages by taking
 * one step at a time and considering one input at a time to get optimal solution
 * 
	 * Relaxation concept:
	 * 
	 * node1	->	node2	->	node3
	 * 	0		2			4
	 * 
	 * node2: u
	 * node3: v
	 * d[u]: distance from node1 to node to = 2
	 * c(u, v): distance from node2 to node3 = 4
	 * if(d[u]+c(u, v) < d[v])
	 * 		d[v] = d[u]+c(u, v)
	 * 
 * 	
 */

package shortest_path.dijkstra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraAlgo {

	public void computePath(Vertex sourceVertex) {
		sourceVertex.setDistance(0);

		PriorityQueue<Vertex> priorityQueue = new PriorityQueue<Vertex>();
		priorityQueue.add(sourceVertex);

		while (!priorityQueue.isEmpty()) {
			Vertex actuaVertex = priorityQueue.poll();

			for (Edge edge : actuaVertex.getAdjacentList()) {
				Vertex v = edge.getTargetVertex();
				double newDistance = actuaVertex.getDistance() + edge.getWieght();
				if (newDistance < v.getDistance()) {
					priorityQueue.remove(v);

					v.setDistance(newDistance);
					v.setPredecessor(actuaVertex);
					priorityQueue.add(v);

				}
			}
		}
	}

	public List<Vertex> getShortestPathTo(Vertex targetVertex) {
		List<Vertex> shortestPathToTarget = new ArrayList<Vertex>();
		for (Vertex vertex = targetVertex; vertex != null; vertex = vertex.getPredecessor()) {
			shortestPathToTarget.add(vertex);
		}
		Collections.reverse(shortestPathToTarget);
		return shortestPathToTarget;
	}
}
