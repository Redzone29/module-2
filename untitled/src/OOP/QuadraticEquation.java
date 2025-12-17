package OOP;

import java.util.Scanner;

public class QuadraticEquation {
    // Biến instance (thuộc tính của đối tượng)
    private double a, b, c;

    // Constructor
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Phương thức tính Delta
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    // Phương thức tính nghiệm
    public void calculateRoots() {
        double delta = getDiscriminant();

        if (delta > 0) {
            double r1 = (-b + Math.sqrt(delta)) / (2 * a);
            double r2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm phân biệt: " + r1 + " và " + r2);
        } else if (delta == 0) {
            double r1 = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép: " + r1);
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập a: ");
        double a = sc.nextDouble();

        System.out.println("Nhập b: ");
        double b = sc.nextDouble();

        System.out.println("Nhập c: ");
        double c = sc.nextDouble();

        // Kiểm tra a khác 0 để đảm bảo là phương trình bậc 2
        if (a == 0) {
            System.out.println("Đây không phải phương trình bậc 2.");
        } else {
            // Tạo đối tượng
            QuadraticEquation qe = new QuadraticEquation(a, b, c);

            // BƯỚC CÒN THIẾU CỦA BẠN LÀ Ở ĐÂY: Gọi phương thức để thực thi
            qe.calculateRoots();
        }

        sc.close();
    }
}