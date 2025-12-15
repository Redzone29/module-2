package arrays;

import java.util.Scanner;

public class FindTheMinValue {

        public static void main(String[] args) {
            System.out.println("Type the size of array n x n: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.println("Enter the element at index (" + (i + 1) + "," + (j + 1) + "): ");
                    Scanner sc1 = new Scanner(System.in);
                    arr[i][j] = sc1.nextInt();
                }
            }
            int min = arr[0][0];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] < min) {
                        min = arr[i][j];
                    }
                }
            }
            System.out.println("The min value is: " + min);
        }
    }
