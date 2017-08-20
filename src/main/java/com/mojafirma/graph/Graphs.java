package com.mojafirma.graph;

public class Graphs {

    public static void main(String[] args) {

        generateGnp(4, 0.5);
    }

    public static void generateGnp(int n, double p){
        boolean [][] result = GraphGnp.generateGnp(n,p);
        Printer.printStructure(result);


    }
}
