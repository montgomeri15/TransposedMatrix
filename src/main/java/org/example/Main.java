package org.example;

public class Main {
    public static void main(String[] args) {

    }

    public static void displayMatrix(int[][] matrix) {
        System.out.println("Наша матриця: ");
        for(int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + "\t");
            }
            System.out.println();
        }
    }
}