import java.util.Scanner;

public class MainRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap chieu` rong: ");
        double width = scanner.nextDouble();
        System.out.println("Nhap chieu` cao: ");
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Hinh` chu nhat cua ban: " + rectangle.display());
        System.out.println("Chu vi hinh` chu nhat la`: " + rectangle.getPerimeter());
        System.out.println("Dien tich hinh` chu nhat la`: " + rectangle.getArea());
    }
}
