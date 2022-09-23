package com.company.depthsearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

import java.util.Scanner;

class Vertex {
    static final byte clWHITE = 0;
    byte color;

    int num; // номер вершины
    Vertex from; // из какой вершины пришли
    Vertex(int num, byte color){
        this.num = num;
        this.color = color;
        from = null;
    } // constructor Vertex
} // class V

class Graphi {
    int N; //количество вершин
    ArrayList<Vertex> vertexes; //список вершин (вообще)
    ArrayList<LinkedList<Vertex>> adjancedVertexes; // список смежных вершин
    int[] distances; // массив расстояний от стартовой вершины
    int startVertex; // номер стартовой вершины

    Graphi() {
        System.out.print("Введите количество вершин в графе N = ");
        Scanner con = new Scanner(System.in);
        N = con.nextInt();
        vertexes = new ArrayList<Vertex>();
        adjancedVertexes = new ArrayList<LinkedList<Vertex>>();
        distances = new int[N + 1];
        //на 1 больше, элемент №0 использоваться не будет
        for (int i = 1; i <= N; i++) {
            vertexes.add(new Vertex(i, Vertex.clWHITE));
            // создаем новую белую вершину и добавляем ее в конец
            // создаем новую белую вершину и добавляем ее в конец
            adjancedVertexes.add(new LinkedList<Vertex>());
            // создаем также новый элемент в списке смежных вершин
        } // for i
        System.out.print(
                "\nСписок смежных вершин - номера вершин, разделенные пробелом");
        System.out.print("\nСписок должен оканчиваться нулем!");
        System.out.print(
                "\nПетли в графе не допускаются, попытка сделать вершину смежной"
                        + " самой себе будет игнорироваться");
        int numVertex;
        for (int i = 1; i <= N; i++) {
            System.out.print(
                    "\nВведите для вершины #" + i + " список смежных с ней.");
            System.out.println(
                    "\nПо завершении ввода списка введите 0 и нажмите Enter");
            while (con.hasNextInt()) {
                numVertex = con.nextInt();
                if (numVertex == 0) {
                    break;
                }
                if (numVertex == i) {
                    continue;
                }
                adjancedVertexes.get(i - 1).add(vertexes.get(numVertex - 1));
            } // while есть вершины в списке
        } // for i
    } // constructor Graph

    void printGraph() {
        ListIterator<Vertex> liv;
        System.out.println("\nполучился следующий граф:");
        for (int i = 1; i <= N; i++) {
            System.out.print("\nС вершиной #" + i + " связаны следующие: ");
            liv = adjancedVertexes.get(i - 1).listIterator();
            while (liv.hasNext()) {
                System.out.print(" " + liv.next().num);
            } // пока есть элементы в списке
        } // for i
    } //printGraph
}

public class Graph {
    public static void main(String[] args) {
        Graphi graph = new Graphi();
        graph.printGraph();
    }
}
