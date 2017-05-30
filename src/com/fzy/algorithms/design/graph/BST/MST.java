package com.fzy.algorithms.design.graph.BST;

/**
 * Created by fuzeyi on 2017/5/28.
 */
public class MST {
    private EdgeWeightedGraph g ;
    public MST(EdgeWeightedGraph g){
        this.g = g;
    }

    /**
     * 最小生成树所有的边
     * @return
     */
    public Iterable<Edge> edges(){
        return null;
    }

    /**
     * 最小生成树的权重
     * @return
     */
    public double weight(){
        return 1;
    }
}
