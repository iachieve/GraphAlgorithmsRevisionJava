package graph.topological;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	private int data;
	private boolean visited;
	private List<Vertex> neighborLis;

	public Vertex(int data) {
		this.setData(data);
		setNeighborLis(new ArrayList<>());
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<Vertex> getNeighborLis() {
		return neighborLis;
	}

	public void setNeighborLis(List<Vertex> neighborLis) {
		this.neighborLis = neighborLis;
	}

	public void addNeighborVertex(Vertex neighborList) {
		this.neighborLis.add(neighborList);
	}

	@Override
	public String toString() {
		return "" + this.data;
	}

}
