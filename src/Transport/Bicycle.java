package Transport;

public class Bicycle implements Transport{
    @Override
    public void move() {
        System.out.println("Bicycle is moving");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle stopped");
    }
}
