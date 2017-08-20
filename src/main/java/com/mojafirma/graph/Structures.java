package com.mojafirma.graph;

import com.mojafirma.graph.graphGnk.Edge;

public class Structures {

    public static Edge[] generateEdge(int n){
        int h = n * (n-1)/2;
        Edge[] result = new Edge[h];
        int index = 0;

        for (int i = 0; i <n-1 ; i++) {
            for (int j = i+1; j <n ; j++) {
                result[index] = new Edge(i, j);
                index++;
            }
        }

        return result;
    }
}
