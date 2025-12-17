package OOP;

import java.util.Scanner;

public class QuadraticEquation {
    // 1. Trường dữ liệu private
    private double a, b, c;

    // 2. Phương thức khởi tạo (Constructor)
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // 3. Phương thức getter
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    // 4. Phương thức getDiscriminant() - trả về Delta
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    // 5. Phương thức getRoot1()
    public double getRoot1() {
        if (getDiscriminant() < 0) return 0;
        // Đề yêu cầu dùng Math.pow(x, 0.5)
        return (-b + Math.pow(getDiscriminant(), 0.5)) / (2 * a);
    }

    // 6. Phương thức getRoot2()
    public double getRoot2() {
        if (getDiscriminant() < 0) return 0;
        return (-b - Math.pow(getDiscriminant(), 0.5)) / (2 * a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        QuadraticEquation qe = new QuadraticEquation(a, b, c);

        double delta = qe.getDiscriminant();

        if (delta > 0) {
            System.out.println("The equation has two roots: " + qe.getRoot1() + " and " + qe.getRoot2());
        } else if (delta == 0) {
            System.out.println("The equation has one root: " + qe.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }

        sc.close();
    }
}