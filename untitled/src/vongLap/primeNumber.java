package vongLap;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of prime number:");
        int n = sc.nextInt();
        int times = 0;
        int count = 0;
        for (int i = 2; i <= 1000; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;

                }
            }
            if (count == 2) {
                System.out.println(i);
                times++;
            }

            if(times == n){
                break;
            }
        }
            }
        }
