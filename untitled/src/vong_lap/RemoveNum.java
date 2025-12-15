package vong_lap;

import java.util.Scanner;

public class RemoveNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element at index " + (i + 1) + ":");
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
        System.out.println("The new array is:");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
