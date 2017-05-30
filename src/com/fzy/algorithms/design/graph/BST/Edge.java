package com.fzy.algorithms.design.graph.BST;

/**
 * Created by fuzeyi on 2017/5/28.
 */
public class Edge implements Comparable<Edge> {
    private final int v;
    private final int w;
    private final double weight;

    public Edge(int v, int w, double weight) {
        this.v = v; //边的一端
        this.w = w; //边的另一端
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    /**
     * 边两端的顶点之一
     *
     * @return
     */
    public int either() {
        return v;
    }

    /**
     * 边的另一个端点
     *
     * @param vertex
     * @return
     */
    public int other(int vertex) {
        if (vertex == v) return w;
        else if (vertex == w) return v;
        else throw new IllegalArgumentException("Illegal endpoint");
    }

    /**
     * 通过权重来比较边的大小
     *
     * @param o
     * @return
     */
    @Override
    public int compareTo(Edge o) {
        if (this.weight < o.getWeight()) return -1;
        else if (this.weight > o.getWeight()) return 1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return String.format("%d-%d %.5f", v, w, weight);
    }

    public static void main(String[] args) {
        Edge e = new Edge(12, 23, 3.14);
        System.out.println(e);
    }

}
