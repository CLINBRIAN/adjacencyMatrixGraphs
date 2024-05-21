/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.company.adjacencymatrixgraphs;

/**
 *
 * @author kamau
 */
public class AdjacencyMatrixGraphs {

    public static void main(String[] args) {
        String[] vertexData = {"A", "B", "C", "D"};

        int[][] adjacencyMatrix = {
            {0, 1, 1, 1}, // Edges for A
            {1, 0, 1, 0}, // Edges for B
            {1, 1, 0, 0}, // Edges for C
            {1, 0, 0, 0} // Edges for D
        };
        System.out.println("Vertex data");
        for (String value : vertexData) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("values of matrix");
        printAdjacencyMatrix(adjacencyMatrix);
    }

    public static void printAdjacencyMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int values : row) {
                System.out.print(values + " ");
            }
            System.out.println();
        }
    }

}
