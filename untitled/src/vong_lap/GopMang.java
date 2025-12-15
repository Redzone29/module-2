package vong_lap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] arr2 = new int[5];
        int[] arr3 = new int[10];

        for(int i = 0; i < arr.length; i++){
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr2.length; i++){
            Scanner sc1 = new Scanner(System.in);
            arr2[i] = sc1.nextInt();
        }
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < arr.length; j++){
                arr3[j] = arr[j];
            }
            for(int k = 0; k < arr.length; k++){
                arr3[k + 5] = arr2[k];
            }
        }
        for(int i = 0; i < arr3.length; i++){
            System.out.println(arr3[i]);
        }

    }
}
