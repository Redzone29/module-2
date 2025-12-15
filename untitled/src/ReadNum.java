import java.util.Scanner;

public class ReadNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số nguyễn không âm, tối đa 3 chữ số");
        int number = sc.nextInt();

        //Kiểm tra điều kiện đầu vào
        if (number < 0 || number > 999) {
            System.out.println("Out of ability");
        } else {
            String result = "";
            if (number == 0) {
                System.out.println("Zero");
                return;
            }
            int hundreds = number / 100;
            int tens = (number % 100) / 10;
            int ones = number % 10;
                switch (hundreds) {
                    case 1:
                        result += "one hundred ";
                        break;
                    case 2:
                        result += "two hundred ";
                        break;
                    case 3:
                        result += "three hundred ";
                        break;
                    case 4:
                        result += "four hundred ";
                        break;
                    case 5:
                        result += "five hundred ";
                        break;
                    case 6:
                        result += "six hundred ";
                        break;
                    case 7:
                        result += "seven hundred ";
                        break;
                    case 8:
                        result += "eight hundred ";
                        break;
                    case 9:
                        result += "nine hundred ";
                    case 0:
                        break;
                }
                switch (tens) {
                    case 2: result += "twenty "; break;
                    case 3: result += "thirty "; break;
                    case 4: result += "forty "; break;
                    case 5: result += "fifty "; break;
                    case 6: result += "sixty "; break;
                    case 7: result += "seventy "; break;
                    case 8: result += "eighty "; break;
                    case 9: result += "ninety "; break;
                    case 0: break;
                }
                switch (ones) {
                    case 0: break;
                    case 1: result += "one "; break;
                    case 2: result += "two "; break;
                    case 3: result += "three "; break;
                    case 4: result += "four "; break;
                    case 5: result += "five "; break;
                    case 6: result += "six "; break;
                    case 7: result += "seven "; break;
                    case 8: result += "eight "; break;
                    case 9: result += "nine "; break;
                }
                if (tens == 1) {
                    switch (ones) {
                        case 0: result += "ten "; break;
                        case 1: result += "eleven "; break;
                        case 2: result += "twelve "; break;
                        case 3: result += "thirteen "; break;
                        case 4: result += "fourteen "; break;
                        case 5: result += "fifteen "; break;
                        case 6: result += "sixteen "; break;
                        case 7: result += "seventeen "; break;
                        case 8: result += "eighteen "; break;
                        case 9: result += "nineteen "; break;
                    }
                }
            System.out.println(result);
        }
    }
}
