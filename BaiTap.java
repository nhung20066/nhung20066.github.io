import java.util.Scanner;

public class BaiTap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 4.1. Tính diện tích hình tròn khi biết bán kính
        try {
            System.out.print("Nhập bán kính r (m): ");
            double r = scanner.nextDouble();

            if (r < 0) {
                System.out.println("Bán kính phải lớn hơn hoặc bằng 0!");
            } else {
                double S = Math.PI * r * r;
                System.out.printf("Diện tích hình tròn là: %.2f m²%n", S);
            }
        } catch (Exception e) {
            System.out.println("Vui lòng nhập một số hợp lệ cho bán kính!");
        }

        // 4.2. Tính tổng từ 1 đến n
        try {
            System.out.print("Nhập số nguyên dương n: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Vui lòng nhập n lớn hơn 0!");
            } else {
                int S = n * (n + 1) / 2;  // Công thức tổng
                System.out.printf("Tổng từ 1 đến %d là: %d%n", n, S);
            }
        } catch (Exception e) {
            System.out.println("Vui lòng nhập một số nguyên hợp lệ cho n!");
        }

        scanner.close();
    }
}