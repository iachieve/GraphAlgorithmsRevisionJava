package graph.cycle;

import java.util.List;

public class CycleDetection {
	public void detectCycle(List<Vertex> vertexList) {
		for (Vertex vertex : vertexList) {
			if (!vertex.isVisited()) {
				dfs(vertex);
			}
		}
	}

	private void dfs(Vertex vertex) {
		System.out.println("DFS on vertex " + vertex);
		vertex.setBeingVisited(true);

		for (Vertex v : vertex.getAdjacentList()) {
			System.out.println("visitng the neigbours of vertex " + vertex);

			// backward edge, visited before
			// meaning there's a cycle
			// this part not standard DFS
			if (v.isBeingVisited()) {
				System.out.println("there is a backward edge, so there's a cycle");
			}

			if (!v.isVisited()) {

				System.out.println("visiting vertex" + v + " recursively");
				v.setVisited(true);
				dfs(v);
			}
		}

		System.out.println("set vertex " + vertex + " setBeingVisited(false) and visited(true)...");
		// reverse of the first line in the function
		vertex.setBeingVisited(false);
		vertex.setVisited(true);
	}
}
