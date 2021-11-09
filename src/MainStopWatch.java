import java.util.Scanner;

public class MainStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Start");
            System.out.println("2. End");
            System.out.println("3. Show");
            int so = scanner.nextInt();
            switch (so) {
                case 1:
                    stopWatch.start();
                    break;
                case 2:
                    stopWatch.stop();
                    break;
                default:
                    System.out.println(stopWatch.getElapsedTime());
            }
        }
    }
}