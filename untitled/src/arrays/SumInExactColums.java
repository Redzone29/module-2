package arrays;

import java.util.Scanner;

public class SumInExactColums {
    public static void main(String[] args) {
        System.out.println("Type the size of array n x n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int sum ;
        sum = 0 ;
        System.out.println("type colums to addition");
        Scanner sc2 = new Scanner(System.in);
        int k = sc2.nextInt() ;

        while (k > n || k < 0){
            System.out.println("Please type a number smaller than n and greater than 0:");
            Scanner sc3 = new Scanner(System.in);
            k = sc3.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter the element at index (" + (i + 1) + "," + (j + 1) + "): ");
                Scanner sc1 = new Scanner(System.in);
                arr[i][j] = sc1.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            sum += arr[i][k - 1];
        }
        System.out.println("The sum of elements in column " + k + " is: " + sum);
    }
}
