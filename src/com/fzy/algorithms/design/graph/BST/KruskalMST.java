package com.fzy.algorithms.design.graph.BST;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by fuzeyi on 2017/5/29.
 */
public class KruskalMST {
    private Queue<Edge> mst;//保存最小生成树的边
    private MinPQ<Edge> pq; //保存还未被检测到的边
    private UF uf;// 判断无效的边

    public KruskalMST(EdgeWeightedGraph g) {
        this.mst = new LinkedBlockingQueue<>();
        this.pq = new MinPQ<Edge>();
        for (Edge e : g.edges()) {
            pq.insert(e);
        }
        this.uf = new UF(g.V());

        visit(g);
    }

    private void visit(EdgeWeightedGraph g) {
        while (!pq.isEmpty() && mst.size() < g.V() - 1) {
            Edge e = pq.delMin(); //从pq得到权重最小的边和它的顶点
            int v = e.either();
            int w = e.other(v);
            if (uf.connected(v, w)) {
                continue;
            }
            uf.union(v, w);//合并分量
            mst.add(e); //将边添加到最小生成树中
        }
    }

    public Iterable<Edge> edges() {
        return null;
    }

    public double weight() {
        return 0;
    }
}
