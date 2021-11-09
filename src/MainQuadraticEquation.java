import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap a: ");
        double a = input.nextDouble();
        System.out.println("Nhap b: ");
        double b = input.nextDouble();
        System.out.println("Nhap c: ");
        double c = input.nextDouble();

        QuadraticEquation delta = new QuadraticEquation(a, b, c);
        if (delta.getDelta() > 0) {
            System.out.println("Phuong trinh` co 2 nghiem: ");
            System.out.println("x1 = " + delta.getRoot1());
            System.out.println("x2 = " + delta.getRoot2());
        } else if (delta.getDelta() == 0) {
            System.out.println("Phuong trinh` co nghiem kep: x1 = x2 = " + delta.getRoot1());
        } else {
            System.out.println("Phuong trinh` vo nghiem");
        }
    }
}
