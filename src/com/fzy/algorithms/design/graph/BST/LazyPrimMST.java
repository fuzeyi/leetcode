package com.fzy.algorithms.design.graph.BST;


import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 最小生成树的 prim算法的的延时实现
 * Created by fuzeyi on 2017/5/28.
 */
public class LazyPrimMST {
    private boolean[] marked; //最小生成树的顶点
    private Queue<Edge> mst; //最小生成树的边
    private MinPQ<Edge> pq;  //横切边 (包括失效的边)

    public LazyPrimMST(EdgeWeightedGraph g) {
        pq = new MinPQ<Edge>();
        marked = new boolean[g.V()];
        mst = new LinkedBlockingQueue<>();

        visit(g, 0); //假设g是连通图
        while (!pq.isEmpty()) {
            Edge e = pq.delMin(); //从pq中得到权重最小的边
            int v = e.either();
            int w = e.other(v);
            if (marked[v] && marked[w]) {
                continue;
            }
            mst.add(e);
            if (!marked[v]) {
                visit(g, v);
            }
            if (!marked[w]) {
                visit(g, w);
            }
        }


    }

    private void visit(EdgeWeightedGraph g, int v) {
        //标记顶点v并将所有连接 v 和未被标记顶点的边加入pq
        marked[v] = true;
        for (Edge e : g.adj(v)) {
            if (!marked[e.other(v)]) {
                pq.insert(e);
            }
        }
    }

    public Iterable<Edge> edges() {
        return mst;
    }

    public double weight() {
        float weight = 0f;
        for (Edge e : mst) {
            weight += e.getWeight();
        }
        return weight;
    }
}
