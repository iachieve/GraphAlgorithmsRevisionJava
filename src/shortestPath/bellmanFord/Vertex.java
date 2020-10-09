package shortestPath.bellmanFord;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	private String name;
	private boolean vistied;
	private double distance = Double.MAX_VALUE;
	private Vertex previousVertex;

	private List<Edge> adjacentList;

	public Vertex(String name) {
		this.name = name;
		this.adjacentList = new ArrayList<Edge>();

	}

	public void addNeighbor(Edge edge) {
		this.adjacentList.add(edge);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVistied() {
		return vistied;
	}

	public void setVistied(boolean vistied) {
		this.vistied = vistied;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public Vertex getPreviousVertex() {
		return previousVertex;
	}

	public void setPreviousVertex(Vertex previousVertex) {
		this.previousVertex = previousVertex;
	}

	public List<Edge> getAdjacentList() {
		return adjacentList;
	}

	public void setAdjacentList(List<Edge> adjacentList) {
		this.adjacentList = adjacentList;
	}

}
