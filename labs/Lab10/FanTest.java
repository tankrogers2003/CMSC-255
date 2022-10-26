public class FanTest {
    public static void main(String[] args) {
        Fan fast = new Fan();
        fast.setSpeed(Fan.FAST);
        fast.setRadius(10);
        fast.setColor("yellow");
        fast.setOn(true);

        Fan medium = new Fan();
        medium.setSpeed(Fan.MEDIUM);
        medium.setRadius(20);
        medium.setColor("blue");
        medium.setOn(false);

        System.out.println(fast.toString());
        System.out.println(medium.toString());
    }
}
