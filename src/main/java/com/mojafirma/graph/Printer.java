package com.mojafirma.graph;

import java.util.Arrays;

public class Printer {

    public static void printStructure(boolean [][] structure){
        for (boolean[] row : structure){
            System.out.println(Arrays.toString(row));

        }
    }
}
