import java.util.Scanner;

public class ExchangeMoney {
    public static void main(String[] args) {
        System.out.println("please enter the number of USD to exchange to VND:");
        Scanner sc = new Scanner(System.in);
        int dollar = sc.nextInt();
        System.out.println(dollar*25000);
    }
}
