import java.util.Scanner;

public class HinhTron {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
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
            System.out.println("Vui lòng nhập một số hợp lệ!");
        }
    }
}