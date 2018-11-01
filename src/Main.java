import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Giai phuong trinh bac nhat: ");
        System.out.println("Nhap vao phuong trinh dang a*x + b=0");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        double a = scanner.nextDouble();
        System.out.println("b = ");
        double b = scanner.nextDouble();
        System.out.println("c = ");
        double c = scanner.nextDouble();

        if (a != 0) {
            double ketqua = -b / a;
            System.out.printf("Ket qua la : %f!", ketqua);
        }else {
            if (b == 0) {
                System.out.print("Phuong trinh co vo so nghiem");
            } else {
                System.out.print("Phuong trinh vo nghiem");
            }
        }
    }
}
