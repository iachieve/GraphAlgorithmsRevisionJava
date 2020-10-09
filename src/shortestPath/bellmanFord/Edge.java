package shortestPath.bellmanFord;

public class Edge {
	private double weight;
	private Vertex startVertex;
	private Vertex tartgetVertex;

	public Edge(double weight, Vertex startVertex, Vertex tartgetVertex) {
		this.weight = weight;
		this.startVertex = startVertex;
		this.tartgetVertex = tartgetVertex;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Vertex getStartVertex() {
		return startVertex;
	}

	public void setStartVertex(Vertex startVertex) {
		this.startVertex = startVertex;
	}

	public Vertex getTartgetVertex() {
		return tartgetVertex;
	}

	public void setTartgetVertex(Vertex tartgetVertex) {
		this.tartgetVertex = tartgetVertex;
	}

}
