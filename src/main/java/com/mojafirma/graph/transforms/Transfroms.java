package com.mojafirma.graph.transforms;

import com.mojafirma.graph.graphGnk.Edge;

public class Transfroms {

    public static boolean[][]transformEtoA(int n, int k, Edge[]e){
        boolean[][] result = new boolean[n][n];
        int h = e.length;

        for (int i = h-1; i > h-1-k ; i--) {
            result[e[i].getA()][e[i].getB()] = true;
            result[e[i].getB()][e[i].getA()] = true;
        }
        return result;
    }
}
