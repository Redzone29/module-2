package arrays;

import java.util.Scanner;

public class CountingTimeAppearOfChar {
    public static void main() {
        String chuoigoc = "hello world code gym";

        Scanner sc = new Scanner(System.in);
        System.out.println("This String is: " + chuoigoc + "");
        System.out.println("Type the character you want to count:");

        char KyTuCanDem = sc.next().charAt(0);

        int count = 0;

        for (int i = 0; i < chuoigoc.length(); i++) {
            if (chuoigoc.charAt(i) == KyTuCanDem) {
                count++;
            }

        }
        System.out.println("The number of times the character " + KyTuCanDem + " appears is: " + count);
    }
}
