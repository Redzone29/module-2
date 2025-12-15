package arrays;

import java.util.Scanner;

public class SumDiagonal {
    public static void main(String[] args) {
        System.out.println("type size of array n x n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int sum = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.println("Enter the element at index (" + (i + 1) + "," + (j + 1) + "): ");
                Scanner sc1 = new Scanner(System.in);
                arr[i][j] = sc1.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            sum += arr[i][i];
        }
        System.out.println("Sum of diagonal elements is: " + sum);
    }
}
