package vong_lap;

import java.util.Scanner;

public class ThemSoVaoMang {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Enter the element at index " + (i + 1) + ":");
            Scanner sc2 = new Scanner(System.in);
            arr[i] = sc2.nextInt();
        }
        System.out.println("\nChoose the index you want to type new number");
        Scanner sc3 = new Scanner(System.in);
        int index = sc3.nextInt();
        System.out.println("Write the new number:");
        Scanner sc4 = new Scanner(System.in);
        int newNum = sc4.nextInt();
        arr[index - 1] = newNum;
        System.out.println("The new array is:");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
