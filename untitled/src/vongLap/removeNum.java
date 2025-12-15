package vongLap;

import java.util.Scanner;

public class removeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            Scanner sc1 = new Scanner(System.in);
            arr[i] = sc1.nextInt();
        }
        System.out.println("Enter the number you want to remove:");
        Scanner sc2 = new Scanner(System.in);
        int num = sc2.nextInt();
        for (int i = 0; i < n; i++){
            if(arr[i] == num){
                arr[i] = 0;
            }
        }
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
