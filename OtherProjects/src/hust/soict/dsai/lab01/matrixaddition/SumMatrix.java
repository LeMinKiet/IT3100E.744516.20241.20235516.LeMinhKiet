package hust.soict.dsai.lab01.matrixaddition;

import javax.swing.*;

public class SumMatrix {
    public static String matrix_String(double[][] matrix) {
        String strMatrix = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                strMatrix += matrix[i][j] + "    ";
            }
            strMatrix += "\n";
        }
        return strMatrix;
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to Sum of Matrix");
        String input = JOptionPane.showInputDialog(null, "Please enter the size of the matrix: ", "Take Input", JOptionPane.INFORMATION_MESSAGE);
        String[] arr =  input.split(" ");
        int[] numbers = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            numbers[i] = Integer.parseInt(arr[i]);
        }
        double matrixA[][] = new double[numbers[0]][numbers[1]];
        double matrixB[][] = new double[numbers[0]][numbers[1]];
        double res[][] = new double[numbers[0]][numbers[1]];
        for (int i = 0; i < numbers[0]; i++) {
            String RowA = JOptionPane.showInputDialog(null, "Please enter the element(s) of row" + (i + 1) +" of the matrix A: ", "Input of Row A", JOptionPane.INFORMATION_MESSAGE);
            String[] rowA =  RowA.split(" ");
            for (int j = 0; j < numbers[1]; j++) {
                matrixA[i][j] = Double.parseDouble(rowA[j]);
            }
        }
        for (int i = 0; i < numbers[0]; i++) {
            String RowB = JOptionPane.showInputDialog(null, "Please enter the element(s) of row" + (i + 1) +" of the matrix B: ", "Input of Row B", JOptionPane.INFORMATION_MESSAGE);
            String[] rowB =  RowB.split(" ");
            for (int j = 0; j < numbers[1]; j++) {
                matrixB[i][j] = Double.parseDouble(rowB[j]);
            }
        }
        for (int i = 0; i < numbers[0]; i++) {
            for (int j = 0; j < numbers[1]; j++) {
                res[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        JOptionPane.showMessageDialog(null, "Matrix A: \n" + matrix_String(matrixA)
                + "\n" + "Matrix B: \n" + matrix_String(matrixB) +  "\n"
                + "The sum of 2 matrix: \n" + matrix_String(res), "Result", JOptionPane.INFORMATION_MESSAGE);
    }
}
