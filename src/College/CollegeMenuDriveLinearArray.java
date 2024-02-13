package College;

import java.util.Scanner;

    public class CollegeMenuDriveLinearArray {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Display menu
            System.out.println("Menu:");
            System.out.println("1. Perform addition of matrices");
            System.out.println("2. Perform multiplication of matrices");
            System.out.println("3. Find transpose of the entered matrix");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    performMatrixAddition(scanner);
                    break;
                case 2:
                    performMatrixMultiplication(scanner);
                    break;
                case 3:
                    findMatrixTranspose(scanner);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }

        // Function to perform addition of matrices
        private static void performMatrixAddition(Scanner scanner) {
            System.out.println("Enter the dimensions of the matrices:");
            System.out.print("Number of rows: ");
            int rows = scanner.nextInt();
            System.out.print("Number of columns: ");
            int cols = scanner.nextInt();

            int[][] matrix1 = readMatrix(scanner, rows, cols, "first");
            int[][] matrix2 = readMatrix(scanner, rows, cols, "second");

            // Perform addition
            int[][] result = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    result[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }

            // Display result
            System.out.println("Resultant Matrix (Sum of Matrices):");
            displayMatrix(result);
        }

        // Function to perform multiplication of matrices
        private static void performMatrixMultiplication(Scanner scanner) {
            System.out.println("Enter the dimensions of the matrices:");
            System.out.print("Number of rows for first matrix: ");
            int rows1 = scanner.nextInt();
            System.out.print("Number of columns for first matrix: ");
            int cols1 = scanner.nextInt();

            System.out.print("Number of rows for second matrix: ");
            int rows2 = scanner.nextInt();
            System.out.print("Number of columns for second matrix: ");
            int cols2 = scanner.nextInt();

            if (cols1 != rows2) {
                System.out.println("Error: Number of columns in the first matrix must be equal to the number of rows in the second matrix for multiplication.");
                return;
            }

            int[][] matrix1 = readMatrix(scanner, rows1, cols1, "first");
            int[][] matrix2 = readMatrix(scanner, rows2, cols2, "second");

            // Perform multiplication
            int[][] result = new int[rows1][cols2];
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols2; j++) {
                    for (int k = 0; k < cols1; k++) {
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }

            // Display result
            System.out.println("Resultant Matrix (Multiplication of Matrices):");
            displayMatrix(result);
        }

        // Function to find transpose of the entered matrix
        private static void findMatrixTranspose(Scanner scanner) {
            System.out.println("Enter the dimensions of the matrix:");
            System.out.print("Number of rows: ");
            int rows = scanner.nextInt();
            System.out.print("Number of columns: ");
            int cols = scanner.nextInt();

            int[][] matrix = readMatrix(scanner, rows, cols, "");

            // Transpose the matrix
            int[][] transpose = new int[cols][rows];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    transpose[j][i] = matrix[i][j];
                }
            }

            // Display result
            System.out.println("Transpose of the entered Matrix:");
            displayMatrix(transpose);
        }

        // Function to read a matrix from the user
        private static int[][] readMatrix(Scanner scanner, int rows, int cols, String ordinal) {
            System.out.println("Enter the elements of the " + ordinal + " matrix:");
            int[][] matrix = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("Enter element [" + (i + 1) + "][" + (j + 1) + "]: ");
                    matrix[i][j] = scanner.nextInt();
                }
            }
            return matrix;
        }

        // Function to display a matrix
        private static void displayMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                for (int elem : row) {
                    System.out.print(elem + " ");
                }
                System.out.println();
            }
        }
    }
