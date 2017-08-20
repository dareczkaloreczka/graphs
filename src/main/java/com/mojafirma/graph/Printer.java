package com.mojafirma.graph;

import com.mojafirma.graph.graphGnk.Edge;

import java.util.Arrays;

public class Printer {

    public static void printStructure(boolean [][] structure){
        for (boolean[] row : structure){
            System.out.println(Arrays.toString(row));

        }
    }
    public static void printE(Edge[] e){
        for (Edge edge : e){
            System.out.println(e);
        }
    }
}
