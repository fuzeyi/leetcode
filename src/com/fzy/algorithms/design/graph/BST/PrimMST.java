package com.fzy.algorithms.design.graph.BST;

/**
 * 最小生成树的prim算法(即时版本)
 * Created by fuzeyi on 2017/5/29.
 */
public class PrimMST {
    private Edge[] edgeTo;//距离树最近的边
    private double[] distTo;//distTo[w] = edgeTo[w].weight();
    private boolean[] marked;
    private IndexMinPQ<Double> pq; //有效的横切边

    public PrimMST(EdgeWeightedGraph g) {
        edgeTo = new Edge[g.V()];
        distTo = new double[g.V()];
        marked = new boolean[g.V()];
        for (int v = 0; v < g.V(); v++) {
            distTo[v] = Double.POSITIVE_INFINITY; //正无穷大
        }
        pq = new IndexMinPQ<>(g.V());
        distTo[0] = 0.0;
        pq.insert(0, 0.0); //用顶点0和权重0初始化pq
        while (!pq.isEmpty()) {
            visit(g, pq.delMin());
        }
    }

    private void visit(EdgeWeightedGraph g, int v) {
        //将顶点v添加到树中，更新数据
        marked[v] = true;
        for (Edge e : g.adj(v)) {
            int w = e.other(v);
            if (marked[w]) {
                continue;
            }
            if (e.getWeight() < distTo[w]) {
                //连接w和树的最佳边Edge变e
                edgeTo[w] = e;
                distTo[w] = e.getWeight();
                if (pq.contains(w)) {
                    pq.changeKey(w, distTo[w]);
                } else {
                    pq.insert(w, distTo[w]);
                }
            }
        }
    }

    public Iterable<Edge> edges() {
        return null;
    }

    public double weight() {
        return 0;
    }


}
