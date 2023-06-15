package algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Vertex {
private int id;
private boolean visited;
private List<Vertex> neighbors;
public Vertex(int id) {
    this.id = id;
    this.neighbors = new ArrayList<>();
}
public int getId() {
    return id;
}

public void addNeighbor(Vertex neighbor) {
    neighbors.add(neighbor);
}

public List<Vertex> getNeighbors() {
    return neighbors;
}

public boolean isVisited() {
    return visited;
}
public void setIsVisited(boolean visited) {
    this.visited = visited;
}

}

class Graph {
List<Vertex> vertices;

public Graph() {
    this.vertices = new ArrayList<>();
}
public void addVertex(Vertex vertex) {
    vertices.add(vertex);
}

public void depthFirstSearch(Vertex start) {
    Stack<Vertex> stack = new Stack<>();
    stack.push(start);
    while(!stack.isEmpty()) {
        Vertex current = stack.pop();
        if (!current.isVisited()) {
            current.setIsVisited(true);
            System.out.println(current.getId());
            for (Vertex neighbor: current.getNeighbors()) {
                    stack.push(neighbor);
                }
            }
        }
    }
}

public class DepthFirstSearch {
    public static void main(String[] args) {
        // creating a new graph with vertices and connections
        Graph graph = new Graph();
        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);
        Vertex v4 = new Vertex(4);
        Vertex v5 = new Vertex(5);
        Vertex v6 = new Vertex(6);

        v1.addNeighbor(v2);
        v1.addNeighbor(v3);
        v2.addNeighbor(v4);
        v3.addNeighbor(v5);

        graph.addVertex(v1);
        graph.addVertex(v2);
        graph.addVertex(v3);
        graph.addVertex(v4);
        graph.addVertex(v5);

        // perform depth first-search starting from v1
        graph.depthFirstSearch(v1);
    }
}
