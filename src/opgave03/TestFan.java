package opgave03;

public class TestFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.MEDIUM);
        fan1.setColor("yellow");
        fan1.setFan(true);
        fan1.setRadius(10);

        Fan fan2 = new Fan();
        fan2.setSpeed(fan1.FAST);
        fan2.setColor("blue");
        fan2.setFan(false);
        fan2.setRadius(5);

        System.out.println(fan1.toString());
        System.out.println();
        System.out.println(fan2.toString());

    }
}
