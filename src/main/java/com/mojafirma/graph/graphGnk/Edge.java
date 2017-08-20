package com.mojafirma.graph.graphGnk;

import com.mojafirma.graph.Structures;

public class Edge {

    private int a;
    private int b;

    public Edge(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    /*public static boolean[][] generateGnk(int n, int k) {
            boolean[][] result = new boolean[n][n];
            boolean[][] arrayE;
            return result;
        }*/

        /*private int[][] generateE(int n) {
            int size = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    size++;
                }
                boolean[][] arrayE = new boolean[size][size*n];
                for (int i = 0; i < n; i++) {
                    arrayE[i] = i;
                    for (int j = 0; j < n; j++) {
                        arrayE[i][j] = j;

                    }

                }
            }
        }*/
    }

