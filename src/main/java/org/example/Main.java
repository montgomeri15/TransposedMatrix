package org.example;

public class Main {
    public static void main(String[] args) {
        int[][] basicMatrix = {{1, 2, 3}, {4, 5, 6}};
        int row = basicMatrix.length;
        int column = basicMatrix[0].length;
        transposedMatrix(basicMatrix, row, column);
    }

    public static int[][] transposedMatrix(int[][] basicMatrix, int row, int column){
        displayMatrix(basicMatrix);

        int[][] transposedMatrix = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transposedMatrix[j][i] = basicMatrix[i][j];
            }
        }
        displayMatrix(transposedMatrix);
        return transposedMatrix;
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