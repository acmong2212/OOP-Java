public class MainFan {
    public static void main(String[] args) {
        final int slow = 1;
        final int medium = 2;
        final int fast = 3;

        Fan fan1 = new Fan();
        fan1.setSpeed(fast);
        fan1.setRadius(10.0);
        fan1.setColor("yellow");
        fan1.setStatus(true);
        System.out.println(fan1.toString());

        Fan fan2 = new Fan();
        fan2.setSpeed(medium);
        fan2.setRadius(5.0);
        fan2.setColor("blue");
        fan2.setStatus(false);
        System.out.println(fan2.toString());
    }
}
