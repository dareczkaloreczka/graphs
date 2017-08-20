package com.mojafirma.graph;

import com.mojafirma.graph.graphGnk.Edge;
import com.mojafirma.graph.graphGnk.GraphGnk;
import com.mojafirma.graph.graphGnp.GraphGnp;
import com.mojafirma.graph.transforms.Transfroms;

public class Graphs {

    public static void main(String[] args) {

        generateGnp(4, 0.5);
        generateGnk(4, 3);
        transformEtoA(4, 3);
    }

    public static void generateGnp(int n, double p){
        boolean [][] result = GraphGnp.generateGnp(n,p);
        Printer.printStructure(result);
    }
    public static void generateGnk(int n, int k){
        Edge[] result = GraphGnk.generateGnk(n,k);
        for (Edge edge : result){
            System.out.println(edge);
        }
    }
    public static void transformEtoA(int n, int k){
        Edge[] e = GraphGnk.generateGnk(n,k);
        Printer.printStructure(Transfroms.transformEtoA(n, k, e));
    }
}
