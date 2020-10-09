package shortest_path.dijkstra;

public class Edge {
	private double wieght;
	private Vertex startVertex;
	private Vertex targetVertex;

	public double getWieght() {
		return wieght;
	}

	public void setWieght(double wieght) {
		this.wieght = wieght;
	}

	public Vertex getStartVertex() {
		return startVertex;
	}

	public void setStartVertex(Vertex startVertex) {
		this.startVertex = startVertex;
	}

	public Vertex getTargetVertex() {
		return targetVertex;
	}

	public void setTargetVertex(Vertex targetVertex) {
		this.targetVertex = targetVertex;
	}

	public Edge(double wieght, Vertex startVertex, Vertex targetVertex) {
		this.wieght = wieght;
		this.startVertex = startVertex;
		this.targetVertex = targetVertex;
	}

}
