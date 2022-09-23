package com.company.mygraph;

import java.util.ArrayList;
import java.util.HashMap;

public class MyGraph {
    private HashMap<String, ArrayList<String>> adjList = new HashMap<>();


    public boolean addVertex(String vertex) {
        if(!adjList.containsKey(vertex)) {
            adjList.put(vertex,new ArrayList<>());
            return true;
        }
        return false;
    }

    public boolean addEdge(String vertex1,String vertex2) {
        if (adjList.containsKey(vertex1) && adjList.containsKey(vertex2)) {
            adjList.get(vertex1).add(vertex2);
            adjList.get(vertex2).add(vertex1);
            return true;
        }
      return false;
    }
    public boolean removeEdge(String vertex1,String vertex2) {
        if (adjList.containsKey(vertex1) && adjList.containsKey(vertex2)) {
            adjList.get(vertex1).remove(vertex2);
            adjList.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeVertex(String vertex) {
        if (!adjList.containsKey(vertex)) {
            return false;
        }

        for (String adjVertex:adjList.get(vertex)) {
            adjList.get(adjVertex).remove(vertex);

        }
        adjList.remove(vertex);
        return true;

    }

    @Override
    public String toString() {
        return  "MyGraph " + adjList;
    }
}
class GraphMap{
    public static void main(String[] args) {
        MyGraph myGraph = new MyGraph();
        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addEdge("A","B");
        myGraph.addEdge("A","C");
        System.out.println(myGraph);
    }
}
