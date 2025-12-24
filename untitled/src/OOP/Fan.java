package OOP;

public class Fan {
    // 1. Khai báo hằng số
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // 2. Khai báo thuộc tính
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5; // Sửa int thành double
    private String color = "blue";

    // 3. Constructor không tham số
    public Fan() {

    }

    // 4. Getter và Setter
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) { // Tham số là double
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() { // Trả về double
        return radius;
    }

    public String getColor() {
        return color;
    }

    // 5. Phương thức toString
    public String toString() {
        if (this.on) {
            // Nếu quạt bật: speed, color, radius + "fan is on"
            return "Speed: " + this.speed + ", Color: " + this.color + ", Radius: " + this.radius + " - fan is on";
        } else {
            // Nếu quạt tắt: color, radius + "fan is off"
            return "Color: " + this.color + ", Radius: " + this.radius + " - fan is off";
        }
    }

    public static void main(String[] args) {
        // 6. Tạo 2 đối tượng theo yêu cầu

        // Đối tượng Fan 1
        Fan fan1 = new Fan();
        fan1.setSpeed(FAST);   // Giá trị lớn nhất (3)
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        // Đối tượng Fan 2
        Fan fan2 = new Fan();
        fan2.setSpeed(MEDIUM); // Giá trị trung bình (2)
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        // Hiển thị thông tin
        System.out.println("--- Fan 1 ---");
        System.out.println(fan1.toString());

        System.out.println("--- Fan 2 ---");
        System.out.println(fan2.toString());
    }
}