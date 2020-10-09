package shortestPath.bellmanFord;

import java.util.List;

public class BellmanFordAlgo {
	private List<Edge> edgelList;
	private List<Vertex> vertexList;

	public BellmanFordAlgo(List<Edge> edgelList, List<Vertex> vertexList) {
		this.edgelList = edgelList;
		this.vertexList = vertexList;
	}

	public void bellmanFord(Vertex sourVertex) {
		sourVertex.setDistance(0);
		for (int i = 0; i < vertexList.size() - 1; i++) { // V1-1 iteration -> relax all the edges
			for (Edge edge : edgelList) {
				Vertex u = edge.getStartVertex();
				Vertex v = edge.getTartgetVertex();

				if (u.getDistance() == Double.MAX_VALUE)
					continue;
				double newDistance = u.getDistance() + edge.getWeight();
				if (newDistance < v.getDistance()) {
					v.setDistance(newDistance);
					v.setPreviousVertex(edge.getStartVertex());
				}
			}
		}

		for (Edge edge : edgelList) {
			if (edge.getStartVertex().getDistance() != Double.MAX_VALUE) {

				if (hasCycle(edge)) {
					System.out.println("there has been a negative cycle detected...");
				}

			}
		}
	}

	private boolean hasCycle(Edge edge) {
		return (edge.getStartVertex().getDistance() + edge.getWeight()) < edge.getTartgetVertex().getDistance();
	}

	public void shortestPathTo(Vertex targetVertex) {
		if (targetVertex.getDistance() == Double.MAX_VALUE)
			System.out.println("there is no path from the source to the target");

		Vertex actualVertex = targetVertex;
		while (actualVertex.getPreviousVertex() != null) {
			System.out.println(actualVertex.getPreviousVertex());

		}
	}
}
